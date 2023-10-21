public class BinarySearch {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int k=4;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==k){
            System.out.println("k is Present at index "+mid);
            return;
        }
        else if(arr[mid]<k){
          low=mid+1;
        }
        else{
          high=mid-1;
        }
     }
}
}
