public class for_loop_for_array {
    public static void main(String[] args) {
        int nums[]= new int[4];
        nums[0]=4;
        nums[1]= 8;
        nums[2]=3;
        nums[3]=9;
       // for(int i =0;i<nums.length;i++){
       //   System.out.println(nums[i]);
        //}
        for(int n:nums)//this for loop will give one value at a time from the array till the end of array
        //this for each loop is applicable only for array
        {
            System.out.println(n);
        }
    }
}
