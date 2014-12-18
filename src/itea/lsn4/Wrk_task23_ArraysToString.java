package itea.lsn4;

public class Wrk_task23_ArraysToString {

    //Написать свой вариант функции Arrays.toString() для int[]

    static String toString(int[] a) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < a.length; i++) {
            if (i < a.length -1)
                sb.append(a[i]).append(", ");
            else
                sb.append(a[i]);
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};

        System.out.println(toString(a1));
    }
}