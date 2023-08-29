package iterator;

//// we can make this a generic class
//public interface Iterator<T> {
//    boolean hasNext();
//    T current();
//    void next();
//}

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}
