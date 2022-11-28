package stat3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class External {
    private int value;

    @Getter
    @Setter
    @AllArgsConstructor
    static class Inner {
        private int value;
    }
}
