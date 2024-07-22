public class DuplicateContains {
    public static void main(String[] args) {
    //    char num[] = {'1','2','3','1'};
    //    char num[] = {'1','2','3','4'};
       int nums[] = {'1','1','1','3','3','4','3','2','4','2'};
       
       boolean count = containsDuplicate(nums);
       System.out.println(" Number of Islands are "+ count);
    }


       public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i] == nums[i + 1]) return true;
            }
            return false;
    }
}