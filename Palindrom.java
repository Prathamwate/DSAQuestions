public class Palindrom {
    public static void main(String[] args) {
        String str="naman";
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;end--;
            }
            else{
                System.out.println("Not a Palindrom");
                return;
            }
        }
          System.out.println("String is Palindrom");
    }
}
