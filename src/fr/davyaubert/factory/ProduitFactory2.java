package fr.davyaubert.factory;

/**
 * Created by daubert on 02/03/2017.
 */
public class ProduitFactory2 extends ProduitFactory {
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
}
