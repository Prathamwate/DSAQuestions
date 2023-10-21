public class FibbonaciSeries {
    public static void findFibonnaci(int n,int f1,int f2){
        if(n==2){
            return;
        }
        
        int f3=f1+f2;
        System.out.print(f3+" ");
        findFibonnaci(n-1, f1=f2, f2=f3);   
         
    }
    public static void main(String[] args) {
        System.out.print(0+" "+1+" ");
        findFibonnaci(10,0,1);
    }
}
