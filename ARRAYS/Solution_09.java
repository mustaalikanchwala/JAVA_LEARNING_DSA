// find kth max and min elemt of array
class Solution_09 {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        for(int i  = 0 ;i <  arr.length-1;i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr[k-1];
    }
    public static int kthLargest(int[] arr, int k) {
        // Your code here
        for(int i  = 0 ;i <  arr.length-1;i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr[k-1];
    }
}
