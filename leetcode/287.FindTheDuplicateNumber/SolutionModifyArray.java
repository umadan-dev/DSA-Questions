class SolutionModifyArray {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i=0;i<nums.length;i++){
            nums[nums[i]%n] = nums[nums[i]%n]+n;
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]/n>1)
                return i;
        }
        return -1;
    }
}

