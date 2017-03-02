package fr.davyaubert.factory;

/**
 * Created by daubert on 02/03/2017.
 */
public abstract class ProduitFactory {

    public ProduitA getProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
