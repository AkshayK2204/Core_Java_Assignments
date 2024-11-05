import java.util.Arrays;

public class Challenge_2 {

    public static int sumOfSquares(int[] numbers){
        return Arrays
                .stream(numbers)
                .map(n -> n*n)
                .sum();
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,9};
        int output = sumOfSquares(numbers);
        System.out.println(output);

    }
}
