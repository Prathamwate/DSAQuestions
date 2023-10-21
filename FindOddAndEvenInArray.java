import java.util.Arrays;
import java.util.stream.IntStream;

class FindOddAndEvenInArray{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        IntStream stream = Arrays.stream(arr);
        stream.filter(x->x%2==0).forEach(System.out::println);
    }
}