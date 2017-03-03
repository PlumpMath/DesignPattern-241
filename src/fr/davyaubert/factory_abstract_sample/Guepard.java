package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public final class Guepard extends Felin {
    @Override
    public int Weight() {
        return 80;
    }

    @Override
    public int Lenght() {
        return 160;
    }

    @Override
    public void Run() {
        super.Run();
        System.out.println("I'm a Cheetah");
    }
}
