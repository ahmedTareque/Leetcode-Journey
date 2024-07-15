class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] both = new int[nums1.length + nums2.length];  //resultant array of size first array and second array  
        System.arraycopy(nums1, 0, both, 0, nums1.length);  
        System.arraycopy(nums2, 0, both, nums1.length, nums2.length); 
        Arrays.sort(both);
        System.out.println(Arrays.toString(both));
        double median;
        if((both.length % 2) == 0){
            double a= both[both.length/2];
            double b= both[(both.length/2)-1];
            median = (a+b)/2;
            System.out.println("Checking a & b" + a + b + median);
        }else{
            median = both[both.length/2];
        }
        
        return median;
    }
}