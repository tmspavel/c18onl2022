package stat4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class External {
    private int value;// если добавить статик то что?

    static class Inner {
        static int value;
    }
}
