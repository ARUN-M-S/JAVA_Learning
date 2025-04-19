
public class ArrayRevision {

    static int linerSearch(int [] arr,int key){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
   
    static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,4,2,5,6,8,9,03};
        int result = linerSearch(arr, 9);

        int[] nums = {1, 3, 5, 7, 9, 12, 17};
int target = 9;
        System.out.println(result);
    }
}
