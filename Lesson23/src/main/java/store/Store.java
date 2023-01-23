package store;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Store {

    //безопастные коллекции.
//    CopyOnWriteArrayList
//    private AtomicReference innerStore = new AtomicReference<List<Integer>>(new ArrayList<>());//Collections.synchronizedList(new ArrayList<>());
    private List<Integer> innerStore = new ArrayList<>();

    public int getSize() {
        return innerStore.size();
    }
}
