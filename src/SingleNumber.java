public class SingleNumber {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num ^= nums[i];
        }
        return num;
    }
    static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] arr = {4,2,1,2,1};
        int num = singleNumber.singleNumber(arr);
        System.out.println(num);
    }
}
