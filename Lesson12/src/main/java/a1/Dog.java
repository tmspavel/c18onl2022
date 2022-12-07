package a1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("вышли на улицу");
        } else {
            throw new DogIsNotReadyException("Нельзя идти гулять");
        }
    }

    public void test() {
        throw new RuntimeException("test");
    }
}
