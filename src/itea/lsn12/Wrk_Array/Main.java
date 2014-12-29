package itea.lsn12.Wrk_Array;

/**
 *
 */
public class Main {

    public static class Item<T> {
        private T object;
        public T getObject() {
            return object;
        }
        public void setObject(T object) {
            this.object = object;
        }
    }

    public static void main(String[] args) {

        Item[] arr1 = new Item[10];
        int i = 0;
        do {
            Item<Integer> integerBox = new Item<Integer>();
            integerBox.setObject(100 + i);
            arr1[i++] = integerBox;
            Item<String> strBox = new Item<String>();
            strBox.setObject("text1" + i);
            arr1[i++] = strBox;
        } while (i < arr1.length);
        for (Item o : arr1)
            System.out.println(o.getObject());
    }
}
