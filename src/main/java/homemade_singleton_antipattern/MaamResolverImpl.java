package homemade_singleton_antipattern;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {

    private double maam;

    public MaamResolverImpl() {
        maam = getMaamFromMasAhNasaServer();
    }

    @SneakyThrows
    private double getMaamFromMasAhNasaServer() {
        Thread.sleep(4000);
        return 0.18;
    }

    @Override
    public double getMaam() {
        return maam;
    }
}
