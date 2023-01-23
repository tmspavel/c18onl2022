package store;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        Store store = new Store();
        StoreService storeService = new StoreServiceImpl(store);
//        storeService.setInnerStore(store);

        AddThread target = new AddThread();
        target.setStoreService(storeService);
        Thread thread = new Thread(target);
        thread.start();

        Thread thread2 = new Thread(new AddThread(storeService));
        thread2.start();

        Thread thread3 = new Thread(new AddThread(storeService));
        thread3.start();

        thread.join();
        thread2.join();
        thread3.join();

        System.out.println(store.getSize());
    }

}
