import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                pos.offer(nums[i]);
            }else neg.offer(nums[i]);
        }

        for(int i = 0;i < n; i++){
            if(i % 2 == 0){
                nums[i] = pos.poll();
            }else{
                nums[i] = neg.poll();
            }
        }
        return nums;
    }
    private void swap(int i1, int i2, int[] nums){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
