package pl.kodolamacz.podstawy;

/**
 * Created by acacko on 28.10.17
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton init() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton singleton = Singleton.init();
        Singleton singleton2 = Singleton.init();

        System.out.println(singleton == singleton2);

    }


}
