package singleton.cours;

public class TestingSingleton {
    public static void main(String[] args) {
        Singleton.getInstance().op2(1,2,3);
        Singleton.getInstance().op2(3,4,5);
    }
}
