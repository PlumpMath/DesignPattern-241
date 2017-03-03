package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public final class Lion extends Felin {

    @Override
    public int Weight() {
        return 500;
    }

    @Override
    public int Lenght() {
        return 180;
    }

    @Override
    public void Run() {
        super.Run();
        System.out.println("I'm a Lion");
    }
}
