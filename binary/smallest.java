public class smallest{
    public static void main(String[] args) {
        int arr[]={2,3,4,5,9,14,16,18};
        int target =14;
        int ans=binarySearch(arr,target);
        System.out.println(arr[ans]);
    }
    
    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2; 
             if(target>arr[mid])
            start=mid+1;
            else if(target<arr[mid])
            end=mid-1;
        }
        return start;
    }
}
