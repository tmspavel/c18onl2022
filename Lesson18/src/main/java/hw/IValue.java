package hw;

@FunctionalInterface
public interface IValue<T> {
    T getValue(T a);
}