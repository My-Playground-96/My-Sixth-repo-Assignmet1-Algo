import java.util.Arrays;

public class Algo4 {

    public static void main(String[] args) {

        int[]nums = {10,20,30,40,50};
        int j = 0;
        for (int i = nums.length-1; i > (nums.length-1)/2; i--) {
            int num1 = nums[i];
            nums[i]= nums[j];
            nums[j] = num1;
            j++;   
         
        }
        System.out.println(Arrays.toString(nums));

    }
    
}
