package store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StoreServiceImpl implements StoreService {

    private Store innerStore;

//    private final Object object = new Object();

    @Override
    public void add(Integer integer) {
        synchronized (innerStore) {
            innerStore.getInnerStore().add(integer);
        }
    }
}
