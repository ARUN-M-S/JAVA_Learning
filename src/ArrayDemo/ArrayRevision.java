
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
    public static void main(String[] args) {
        int [] arr={1,4,2,5,6,8,9,03};
        int result = linerSearch(arr, 9);
        System.out.println(result);
    }
}
