package iterator;

import java.util.ArrayList;
import java.util.List;


// implementation one
//public class BrowseHistory {
//
//    // this is implementation for the ArrayList
//    //
//
//    private List<String> urls  = new ArrayList<>();
//
//    public void push(String url){
//        urls.add(url);
//    }
//
//    public String pop(){
//        int lastIndex = urls.size() - 1;
//        String lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//        return lastUrl;
//    }
//
//    public Iterator createIterator(){
//        return new ListIterator(this);
//}
//
//    public class ListIterator implements Iterator{
//
//        private final BrowseHistory history;
//
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//
//            return (index < history.urls.size()) ;
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index );
//        }
//
//        @Override
//        public void next() {
//index ++;
//        }
//    }
//}


// implementation two
public class BrowseHistory{

    // this is implementation for a fixed length array
    private String[] urls = new String[10];
    private int count;

    public void push(String url){
        urls[count++] = url;
    }

    public  String pop(){
        return urls[--count];
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator{

        private BrowseHistory history;

        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
