package store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddThread implements Runnable {

    private StoreService storeService;

    public AddThread() {
    }

    public AddThread(StoreService storeService) {
        this.storeService = storeService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            storeService.add(i);
        }
    }
}
