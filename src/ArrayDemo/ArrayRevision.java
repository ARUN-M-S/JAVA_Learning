
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

static void moveZero(int[] nums){
    int snow=0;
    int i =0;
    while(i<nums.length){
        if(nums[i]==0){
            snow++;
        }else if(snow>0){
            int temp = nums[i];
            nums[i]=0;
            nums[i-snow]=temp;
        }
        i++;
    }
}
  

// static int firstBadVersion(int n) {
// int low=0;
// int high = n;

// while(low<high){
//     int mid = low+ (high-low)/2;
//     if(isBadVersion(mid)){
//         high = mid;
//     }else{
//         low= mid+1;
//     }
// }
// return low;
// }

static int searchInRotated(int[] nums,int target){
    int low = 0;
    int high = nums.length -1;

    while(low<=high){
        int mid = low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[low] < nums[mid]  ){
            if(target > nums[low] && target <=nums[mid]){

                high= mid;
            }else{
                low= mid+1;
            }

        }else{
            if(target > nums[mid] && target <nums[high]){
                low= mid+1;
            }else{
                high= mid;
            }

        }
    }
    return -1;
}
public static void main(String[] args) {
        int [] arr={1,4,2,5,6,8,9,03};
        int result = linerSearch(arr, 9);

        int[] nums = {4,5,6,7,0,1,2};
         int target = 7;
        System.out.println(searchInRotated(nums,target));
    }
}
