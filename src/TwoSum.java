public class TwoSum {
    public static void main(String[] args){
        //CASE 1
//        int[] num = {2,7,11,15};
//        int target = 9;

        //CASE 2
        int[] num = {3,2,4};
        int target = 6;

        //CASE 3
//        int[] num = {3,3};
//        int target = 6;

        TwoSum ts = new TwoSum();
        ts.twoSum(num, target);
    }

    public int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i < nums.length; i++){
            num1 = nums[i];
            for(j = i+1; j < nums.length; j++){
                num2 = nums[j];
                if((num1 + num2) == target){
                    System.out.println("[" + i + "," + j + "]");
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
