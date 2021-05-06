/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodechallenge;

/**
 *
 * @author Davessenn
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] sumElement = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
//            System.out.println("i "+ i);
            for (int j = i + 1; j < nums.length; j++) {
//            System.out.println("j "+ j);
                if (nums[i] + nums[j] == target) {
                    sumElement[0] = i;
                    sumElement[1] = j;
                    return sumElement;
                }
            }
        }
        return null;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sum = twoSum(nums, 9);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
