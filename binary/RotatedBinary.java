import java.util.*;
public class RotatedBinary {
    public static void main(String[] args) {  
        System.out.println("Enter the length of array u wanna insert ");
        try (Scanner Sc = new Scanner(System.in)) {
          int n=Sc.nextInt();
          if(n==0)
          System.out.println("Nothing was entered");
          else{
              int arr[]=new int[n];
          System.out.println("Enter the mountain list ");
           for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
            System.out.println("Enter the target ");
            int target=Sc.nextInt();
            
            int m=max(arr);
           
            if(arr[m]==target)
            System.out.println("Target is at index "+(m+1));      
             else if(target>=arr[0])
              System.out.println("Target is at index "+(BinarySearch(arr,target,0,m-1)+1));      
            else if(target<arr[0])
            System.out.println("Target is at index "+(BinarySearch(arr,target,m+1,n-1)+1));
           
          }
      }
    
    }

    static int max(int array[]){
        int start=0;
        int end=array.length-1;
        int mid;
        if (end==0)
        return start;
        else{
        while(start<end)
                    { 
        mid = start + (end - start) / 2;
        if ( array[mid] > array[mid+1]) {
            end = mid;
        } else  if(array[mid] < array[mid+1]) 
            start = mid + 1; 
            }
         return start;
         }
    }
    static int BinarySearch(int arr[],int target,int start,int end){
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
             if(target==arr[mid]){
                return mid;
            }
            
            else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } 
        }
        return -1;
    }
}

