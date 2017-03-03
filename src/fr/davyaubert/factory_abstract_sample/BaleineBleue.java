package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public class BaleineBleue extends Cetace {
    @Override
    public int Weight() {
        return 3500;
    }

    @Override
    public int Lenght() {
        return 32;
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("I'm a blue whale");
    }
}
