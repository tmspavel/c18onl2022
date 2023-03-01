package singleton.otherExamples.billPughAndReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
        BillPughSingleton instanceTwo = null;

        try {
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (BillPughSingleton) constructor.newInstance();
                break;
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
