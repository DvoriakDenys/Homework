import java.util.*;
import java.util.stream.IntStream;


class MyStreamWork<T> {

    public static void main(String[] args) {
        int array[] = new int[4];
        array[0] = -5;
        array[1] = 4;
        array[2] = -13;
        array[3] = 4;

        System.out.println("Average value of array : " +
                Arrays.stream(array).average().orElse(0));

        System.out.println("Minimum value of array : " +
                Arrays.stream(array).min().orElse(0));

        int min = Arrays.stream(array).min().getAsInt();

        System.out.println("Index of the smallest number in the array : " +
                IntStream.range(0, array.length).filter(d -> min == array[d]).findFirst().getAsInt());

        System.out.println("Number of values greater than 0 : " +
                Arrays.stream(array).filter(value -> value < 0).count());

        System.out.println("Number of values less than 0 : " +
                Arrays.stream(array).filter(value -> value > 0).count());

    }
}
