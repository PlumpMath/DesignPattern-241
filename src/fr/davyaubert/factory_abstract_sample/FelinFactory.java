package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public class FelinFactory implements IFelinFactory {
    @Override
    public Lion getLion() {
        return new Lion();
    }

    @Override
    public Guepard getGuepard() {
        return new Guepard();
    }
}
