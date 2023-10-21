import java.util.Arrays;

public class FindThirdLowest {
     public static void main(String[] args) {
        int[] array = {1,2,34,6,0};
        
        int thirdLowest = Arrays.stream(array)
                .distinct() 
                .sorted()   
                .skip(2)
                .findFirst() 
                .orElse(-1); 
        
        System.out.println(thirdLowest);
    }
}
