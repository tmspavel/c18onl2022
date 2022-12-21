package p2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generics custom
 */
@ToString
public class Practice {
    private String name;

    public Practice(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        byte[] bytes = new byte[12];
//        Generic<Integer, Long> objectGeneric = new Generic<>(12, 12L);
//        objectGeneric.print();

        //1
//        String obj = "123";
//        Generic<String> generic = new Generic<>(obj);
//        generic.print();
//        Integer pd = 12;
//        String value = generic.getValue("pd");
//        System.out.println(value.replace("1", "0"));
//        //2
//        Generic<Integer> integerGeneric = new Generic<>(18888);
//        integerGeneric.print();
//        //3
//        Generic<Object> practiceGeneric = new Generic<>();
//        practiceGeneric.print(new Practice("Ivan"));
//        practiceGeneric.print(Integer.valueOf(12));
//        practiceGeneric.print(new Long(5));

        List<String> strings = Arrays.asList("12", "134");
        List<Integer> lists = new ArrayList<>(Arrays.asList(12, 34));
        lists.add(123);
        System.out.println(lists.get(0));
//        lists.add(new Object());
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                '}';
    }
}
