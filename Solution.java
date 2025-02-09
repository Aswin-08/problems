class Solution {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)    cnt++;
        }
        System.out.println(nums.length-cnt);
    }
}