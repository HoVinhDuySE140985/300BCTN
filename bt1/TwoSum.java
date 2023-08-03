import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {   

    public static int[] twoSum(int[] nums, int target) {     
        // code sinh viên 
        // int[] output = new int[2];
        // if(2<=nums.length && Math.pow(10,4) >= nums.length){
        //     if(Math.pow(-10,9)<=target && target<=Math.pow(10,9)){
        //         for(int j=0;j<nums.length-1;j++){
        //             if(Math.pow(-10, 9)<=nums[j] && nums[j]<=Math.pow(10, 9)){
        //                 int tmp = target - nums[j];
        //                 for(int k=1;k<nums.length;k++){
        //                     if(nums[k] == tmp && k != j ){
        //                         output[0] = j;
        //                         output[1] = k;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        // code tối ưu 
        Map<Integer, Integer> map = new HashMap<>();
        int tmp;
        for(int i = 0; i<nums.length;i++){
            tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[] { map.get(tmp), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2,6,11,7};
        int target = 9;

        // int[] nums = {3,2,4};
        // int target = 6;

        // int[] nums = {3,3};
        // int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));


  
    }
}
