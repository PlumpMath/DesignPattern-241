package fr.davyaubert.singleton;

/**
 * Created by daubert on 02/03/2017.
 */
public final class Client {
    private static Client instance = null;

    public static synchronized Client Instance (){
        if (instance == null) {
            instance = new Client();
        }
        return  instance;
    }

    public void printHashCode() {
        System.out.println("Hascode= " + instance.hashCode());
    }
}
