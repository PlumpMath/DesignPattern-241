package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public interface IAnimalFactory {
    IFelinFactory getFelinFactory();
    ICetaceFactory getCetaceFactory();
}
