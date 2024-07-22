public class Testing {
    public static void main(String[] args){
        //    char num[] = {'1','2','3','1'};
        //    char num[] = {'1','2','3','4'};
           int nums[] = {'1','1','1','3','3','4','3','2','4','2'};
        Duplicacy a = new Duplicacy();
        boolean n = a.containsDuplicate(nums);
        System.out.println(n);
    }
}
