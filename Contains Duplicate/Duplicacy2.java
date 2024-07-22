class Duplicacy2 {
    public boolean containsDuplicate(int[] nums) {
        //Creating a new Set of integers with the length of given array
        Set<Integer> numbers = new HashSet<>(nums.length);
        for (int i: nums) {
            if (numbers.contains(i)) return true;
            numbers.add(i);
        }
        return false;
    }
}