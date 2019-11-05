package homemade_singleton_antipattern;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverHomeMadeSingleton {
    private static MaamResolverHomeMadeSingleton ourInstance = new MaamResolverHomeMadeSingleton();

    public static MaamResolverHomeMadeSingleton getInstance() {
        return ourInstance;
    }

    private MaamResolverHomeMadeSingleton() {
    }

    public double getMaam(){

        return 0.18;
    }
}
