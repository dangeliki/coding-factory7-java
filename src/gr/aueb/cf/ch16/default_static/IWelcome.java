package gr.aueb.cf.ch16.default_static;

public interface IWelcome {

    static void staticMethod() {
        System.out.println("Hello From Interface Static Method");
    }


    default void defaultMethod() {
        System.out.println("Default Method from IWelcome");
    }

}
