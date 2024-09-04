import java.util.*;
import java.io.*;
public class two_sum{
    Class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> numMap = new HashMap<>();
            int n=nums.length;
            for(int i=0;i<n;i++){
                int reqNum = target - nums[i];
                if(numMap.containsKey(reqNum)){
                    return new int[]{numMap.get(reqNum), i};
                }
                numMap.put(nums[i],i);
            }
            return new int[]{};
            // brute force
            // int n = nums.length;
            // for (int i = 0; i < n; i++) {
            // for (int j = i + 1; i < n; i++) {
            // if (nums[i] + nums[j] == target) {
            // return new int[] { i, j };
            // }
            // }
            // }
            // return new int[] {};// no solution found
            // hash map-creating hash map
    
        }
    }
    
    public static void main(String args[]){
        int array[];int target;
        
        Scanner sc=new Scanner(System.in);
        array[5]=sc.nextInt();
        target=sc.nextInt();
        Solution(array, target);
    }
}
