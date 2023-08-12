public class Algo4 {
    public static void main(String[] args) {
        
        int [ ] nums = {10,20,30,40,50};

        System.out.print("{");
        for (int i = 0; i < nums.length; i++) System.out.printf("%d,",nums[nums.length-1-i]);    
      
        System.out.print("\b");
        System.out.println("}");
    }
    
}
