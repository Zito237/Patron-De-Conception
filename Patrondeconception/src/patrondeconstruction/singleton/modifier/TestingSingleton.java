package patrondeconstruction.singleton.modifier;

public class TestingSingleton {
    public static void main(String[] args) {
int som = Singleton.getInstance().somme(1,2);
System.out.println(som);
        float div = Singleton.getInstance().division(1,2);
        System.out.println(div);

    }
}
