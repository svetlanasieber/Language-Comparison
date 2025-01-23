public interface IProducer<out T> {
    T Produce();
}
public interface IConsumer<in T> {
    void Consume(T item);
}
