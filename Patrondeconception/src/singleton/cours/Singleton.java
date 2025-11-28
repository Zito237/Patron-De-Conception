package singleton.cours;

public final class Singleton {
    private static Singleton instance = null;
    //d'autres attributs, classique et non static
    private String attribut1;
    private String attribut2;

    //constructeur de l'objet
    private Singleton() {
        //presennce de cons prive enleve le publique
        super();

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //d'autres methodes classiques et non statique
    public void op1(int x, int y, int z){
        this.attribut1 = "bonjour";

    }
    public void op2(int x, int y, int z){
        this.attribut2 = "coucou";
    }



}
