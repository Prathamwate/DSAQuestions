
public class HighestNumber {
    public static void main(String[] args) {
        int[] arr={1,2,34,97,3};
        int max=-1;
        for(Integer i:arr){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
}
