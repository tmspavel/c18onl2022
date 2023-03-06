package singleton.otherExamples.billPughAndReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
        Object instanceTwo = null;

        try{

//            if (instanceTwo instanceof BillPughSingleton two) {
//                two.test();
//                instanceTwo.getClass().isInstance(BillPughSingleton.class);
//            }

            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = constructor.newInstance();
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
