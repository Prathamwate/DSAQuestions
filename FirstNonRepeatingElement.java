import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,5,3,2};
         HashMap<Integer, Integer> intCount = new HashMap<>();
        for (int c : arr) {
            intCount.put(c, intCount.getOrDefault(c, 0) + 1);
        }
        for(int c : arr) {
            if (intCount.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
    }
}
