public abstract class Action<T> {
    abstract protected T function(T a, T b) throws Exception;
}
