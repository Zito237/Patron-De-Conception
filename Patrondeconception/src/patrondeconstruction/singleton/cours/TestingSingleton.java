package patrondeconstruction.singleton.cours;

import patrondeconstruction.singleton.modifier.Singleton;

public class TestingSingleton {
    public static void main(String[] args) {
        int som = Singleton.getInstance().somme(1,2);
        System.out.println(som);

    }
}
