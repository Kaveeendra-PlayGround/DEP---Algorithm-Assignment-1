public class Algo4 {
    public static void main(String[] args) {
        
        int [ ] nums = {10,20,30,40,50};

        //System.out.print("{");
        //for (int i = 0; i < nums.length; i++) System.out.printf("%d,",nums[nums.length-1-i]);    
      
        //System.out.print("\b");
        //System.out.println("}");

        for (int i = 0; i < nums.length; i++) {
            if (nums.length-1-i < i) break;
            int x = nums [i];
            nums [i] = nums [nums.length-1-i];
            nums [nums.length-1-i] = x;            
        }
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d,",nums[i]);            
        }
        System.out.print("\b}");



    }
    
}
