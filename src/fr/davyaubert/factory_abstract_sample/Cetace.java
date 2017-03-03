package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public abstract class Cetace {
    public abstract int Weight();
    public abstract int Lenght();

    protected void swim() {
        System.out.println("I swim. Height= " + Weight() + " Lenght= " + Lenght() + ". Who i am ?");
    }
}
