public abstract class Action<T> {
    abstract protected T function(T a, T b, int action) throws Exception;
}
