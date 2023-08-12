import java.util.Arrays;

public class Algo3 {

    public static void main(String[] args) {
        
        int[]nums = {10,20,30,40,50};
        int[]nums2 = new int[5];
        int j = 0;
        for (int i = 4; i >=0; i--) {
            nums2[j] = nums[i];
            //System.out.println(nums2[j]);
            j++;     
        }
        System.out.println(Arrays.toString(nums2));
    }
    
}