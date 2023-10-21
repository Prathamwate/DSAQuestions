public class SplitWords {
    public static void main(String[] args) {
        String sentence = "I am Software Developer.";
        
        String[] words = sentence.split("\\s+");
        
        for (String word : words) {
            System.out.print(word+" ");
        }
    }
}
