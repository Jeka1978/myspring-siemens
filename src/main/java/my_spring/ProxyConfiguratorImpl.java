package my_spring;

import com.google.common.base.Stopwatch;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
public class ProxyConfiguratorImpl implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        if (type.isAnnotationPresent(Benchmark.class)) {
            if (type.getInterfaces().length == 0) {
               return Enhancer.create(type, (InvocationHandler) (proxy, method, args) -> {
                    return getInvocationHandler(t, method, args);
                });
            }
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> {
                return getInvocationHandler(t, method, args);
            });
        }
        return t;

    }

    private Object getInvocationHandler(Object t, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {
        System.out.println("******** BENCHMARK FOR METHOD " + method.getName() + " started ******");
        Stopwatch started = Stopwatch.createStarted();
        long elapsed = started.elapsed(TimeUnit.NANOSECONDS);
        Object retval = method.invoke(t, args);
        System.out.println("elapsed = " + elapsed);
        System.out.println("******** BENCHMARK FOR METHOD " + method.getName() + " ended ******");

        return retval;
    }
}
