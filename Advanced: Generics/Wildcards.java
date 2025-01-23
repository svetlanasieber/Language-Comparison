interface Producer<? extends T> {
    T produce();
}

interface Consumer<? super T> {
    void consume(T item);
}
