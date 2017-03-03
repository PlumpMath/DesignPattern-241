package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public class AnimalFactory implements IAnimalFactory {
    @Override
    public IFelinFactory getFelinFactory() {
        return new FelinFactory();
    }

    @Override
    public ICetaceFactory getCetaceFactory() {
        return new CetaceFactory();
    }
}
