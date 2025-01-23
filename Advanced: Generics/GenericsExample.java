public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

Box<Integer> intBox = new Box<>();
intBox.setValue(42);
System.out.println(intBox.getValue());
