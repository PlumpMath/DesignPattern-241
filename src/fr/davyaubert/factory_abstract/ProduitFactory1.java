package fr.davyaubert.factory_abstract;

/**
 * Created by daubert on 02/03/2017.
 */
public class ProduitFactory1 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
