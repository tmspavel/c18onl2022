package hw;

public class Service {

    public Object getValue(int value, Data data, String message) {
        switch (value) {
            case 1 -> {
                IValue<String> result = this::reverse;
                data.callBack().execute(message);
                return result.getValue((String) data.supplier().get());
            }
            case 2 -> {
                IValue<Integer> result = this::factorial;
                data.callBack().execute(message);
                return result.getValue((Integer) data.supplier().get());
            }
        }
        return null;
    }

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
