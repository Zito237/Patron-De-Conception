package singleton.modifier;

public class Connexion {
    public static Connexion instance;
    private static int counter = 0;
    private  Connexion(){
        counter++;
    }
    public static Connexion getInstance(){
        if(instance==null){
            instance = new Connexion();
        }
        return instance;
    }
    public void description(){
        System.out.println("Connexion");
        System.out.println("le nombre d'instances de connexion est :" +counter);
    }
}
