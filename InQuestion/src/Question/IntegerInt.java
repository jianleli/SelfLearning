package Question;

// Int  --> Integer


import java.util.Arrays;

public class IntegerInt {
    public static void main(String[] args) {

        int[] nums = {9,5,2,7,10,16};

        Integer[] integerNums= new Integer[nums.length];
        for (int i = 0; i < nums.length; i++){
            integerNums[i] = nums[i];
        }

        System.out.println(Arrays.toString(integerNums));
    }
}
