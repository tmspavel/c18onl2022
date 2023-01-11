package p1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainThread extends Thread {
    private final int index;

    @Override
    public void run() {
        //код который будет выполняться в потоке
        method();
    }

    private void method() {
        System.out.println("start MainThread " + index + getName());
    }

}
