package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public class BaleineBosse extends Cetace {
    @Override
    public int Weight() {
        return 2100;
    }

    @Override
    public int Lenght() {
        return 25;
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("I'm a humpback whale");
    }
}
