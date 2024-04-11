import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 23, 235, 18, 1085, 20245, 115,20246};
        Arrays.sort(array);
        System.out.println("The smallest member of the array is :" + " "+array[0]);
        System.out.println("The biggest member of the array is :" + " "+array[array.length - 1]);
    }
}