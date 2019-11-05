package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class ConsoleSpeaker implements Speaker {

    @PostConstruct
    public void init(){
        System.out.println(this.getClass());
    }
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
