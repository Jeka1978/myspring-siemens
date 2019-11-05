package homemade_singleton_antipattern;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {
    private MaamResolver maamResolver;

    public TaxCalculator(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    public double withMaam(double price) {
        return maamResolver.getMaam() * price+ price;
    }
}
