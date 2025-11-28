package singleton.modifier;

public class TestConnexion {
    public static void main(String[] args) {
        Connexion cn1 = Connexion.getInstance();
        Connexion cn2 = Connexion.getInstance();

        cn1.description();
        cn2.description();
    }
}
