package iterator.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public  Product delete(){
        int lastIndex = products.size() - 1;
        Product lastProduct = products.get(lastIndex);
        products.remove(lastProduct);
        return lastProduct;
    }

    public Iterator createIterator(){
        return new ListIterator( this);
    }

    public class ListIterator implements Iterator {
        private ProductCollection productCollection;
        private int index;
        public ListIterator(ProductCollection productCollection){
            this.productCollection = productCollection;
        }

        @Override
        public void nextProduct() {
            index++;
        }

        @Override
        public Product currentProduct() {

            return products.get(index) ;
        }

        @Override
        public boolean isDone() {
            return (index >= products.size());
        }
    }
}
