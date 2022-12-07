package by.tms.model;

public enum Type {

    ONE(1, "один"), TWO(2);

    private int value;
    private String string;

    Type(int value) {
        this.value = value;
    }

    Type(int value, String string) {
        this.value = value;
        this.string = string;
    }
}
