public class countMBinary{
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
       int rotate = search(arr);
       System.out.println("the number of times array rotated is " + (rotate+1));
    }


    public static  int search(int array[]){
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

        }
        return start;
    }
}