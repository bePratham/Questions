import java.util.*;
public class mountain {
    
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
        if (array[mid] > array[mid+1]) {
            end = mid;
        } else {
            // you are in asc part of array
            start = mid + 1; // because we know that mid+1 element > mid element
        }
    }
    // in the end, start == end and pointing to the largest number because of the 2 checks above
    // start and end are always trying to find max element in the above 2 checks
    // hence, when they are pointing to just one element, that is the max one because that is what the checks say
    // more elaboration: at every point of time for start and end, they have the best possible answer till that time
    // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
    return start;
 } // or return end as both are =
}








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
              System.out.println("Maximum no. is "+arr[max(arr)]);
            }
        }
     }
}