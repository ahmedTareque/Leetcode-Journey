class Duplicacy {
    public boolean containsDuplicate(int[] nums) {
        //After sorting given array compare next value
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}