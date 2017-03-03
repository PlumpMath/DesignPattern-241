package fr.davyaubert.factory_abstract_sample;

/**
 * Created by daubert on 03/03/2017.
 */
public class CetaceFactory implements ICetaceFactory {
    @Override
    public BaleineBleue getBaleineBleue() {
        return new BaleineBleue();
    }

    @Override
    public BaleineBosse getBaleineBosse() {
        return new BaleineBosse();
    }
}
