package fr.davyaubert;

public class Main {

    public static void main(String[] args) {

        /*
            Le pattern "Fabrique (Factory)" consiste à créer un objet dont le type dépend du contexte.
            La fabrique retourne un objet dont le type est issue de la classe mère mais les traitements
            exécutés sont ceux de l'instance créée.
        */
        /*ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        System.out.println("Utilisation de la première fabrique");
        ProduitA produitA1 = produitFactory1.getProduitA();
        produitA1.MethodeA();

        System.out.println("Utilisation de la deuxième fabrique");
        ProduitA produitA2 = produitFactory2.getProduitA();
        produitA2.MethodeA();*/


        /*
            Le pattern "Singleton" consiste à obtenir qu'une seule instance d'un objet.
            Il faut s'assurer qu'il soit ThreadSafe ain d'aviter tout problème d'utilisation
            entre deux threads.
         */
        /*System.out.println("Initialisation client1");
        Client client1 = Client.Instance();
        client1.printHashCode();

        System.out.println("Initialisation client1");
        Client client2 = Client.Instance();
        client2.printHashCode();*/


        /*
            Le pattern "Fabrique abstraite" consiste à fournir une interface unique pour instancier des objets d'une même famille
            sans avoir à connaitre les classes à instancier.
         */
        /*System.out.println("Utilisation de la fabrique abstraite 1");
        IProduitFactory produitFactory_1 = new fr.davyaubert.factory_abstract.ProduitFactory1();
        produitFactory_1.getProduitA().MethodeA();
        produitFactory_1.getProduitB().MethodeB();

        System.out.println("Utilisation de la fabrique abstraite 2");
        IProduitFactory produitFactory_2 = new fr.davyaubert.factory_abstract.ProduitFactory2();
        produitFactory_2.getProduitA().MethodeA();
        produitFactory_2.getProduitB().MethodeB();*/

        /*ICetaceFactory cetaceFactory_1 = new CetaceFactory();
        cetaceFactory_1.getBaleineBleue().swim();*/

        /*ICetaceFactory cetaceFactory_2 = new CetaceFactory();
        cetaceFactory_2.getBaleineBosse().helloWorld();*/

     /*   IAnimalFactory animalFactory = new AnimalFactory();
        animalFactory.getFelinFactory().getLion().Run();
        animalFactory.getFelinFactory().getGuepard().Run();
        animalFactory.getCetaceFactory().getBaleineBleue().swim();
        animalFactory.getCetaceFactory().getBaleineBosse().swim();*/

        /*String myString = "049405230025460746870213123876804409809845";

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < myString.length(); i++) {
            if (i != 0 && i%2 == 0) {
                System.out.println(sb.toString());

                sb = new StringBuilder();
                sb.append(myString.charAt(i));
            } else {
                sb.append(myString.charAt(i));
            }
        }*/
    }
}
