public class Algo3 {
    public static void main(String[] args) {
        
        int [ ] nums = {10,20,30,40,50};
        int [ ] nums2 =  new int [nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            j = nums.length-1-i;
            nums2 [i] = nums [j];                     
        }

        nums = nums2;
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) System.out.printf("%d,",nums[i]);            
        System.out.print("\b");
        System.out.println("}");

    }
}
