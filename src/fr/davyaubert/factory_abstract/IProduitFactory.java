package fr.davyaubert.factory_abstract;

/**
 * Created by daubert on 02/03/2017.
 */

/**
 * Interface pour les fabriques de création d'objets.
 * Elle définit donc les méthodes de création des objets.
 */
public interface IProduitFactory {
    ProduitA getProduitA();
    ProduitB getProduitB();
}
