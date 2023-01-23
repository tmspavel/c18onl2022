package thread;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class BlockedThread extends Thread {

    private List<BlockedThread> allThreads;
    private BlockedService service;

    public BlockedThread(String name, BlockedService service) {
        super(name);
        this.service = service;
    }

    @SneakyThrows @Override
    public void run() {
        System.out.println("run " + this.getName() + " " + getState());
        service.serveThread(this);
    }
}
