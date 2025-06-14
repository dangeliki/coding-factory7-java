package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        Φορτώνει αλλά είναι γνωστό το teacher at compile time , δεν γίνονται initialize τα static fields
        Class<?> clazz = Teacher.class;
//        Φορτωνεται στην μνημη και γινονται initialize τα static fields
        Class<?> aClass = Class.forName("gr.aueb.cf.ch20.reflection.Teacher");

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        Constructor<?>[] constructorsList = Teacher.class.getDeclaredConstructors();

        Constructor<?> defaultCtor = clazz.getDeclaredConstructor();
        defaultCtor.setAccessible(true);

        Teacher teacher = (Teacher) defaultCtor.newInstance();

        Constructor<?> intCtor = Teacher.class.getConstructor((Long.class));

        Constructor<?> overloadedCtor = clazz.getConstructor(Long.class, String.class, String.class);

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(teacher);

    }
}
