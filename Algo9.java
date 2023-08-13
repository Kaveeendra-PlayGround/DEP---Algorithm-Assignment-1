import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        label:
        do{
        System.out.print("Enter a Single Word: ");
        String input = scanner.next();

        if(!scanner.nextLine().trim().isEmpty()) continue;

        //System.out.println(input);

        char [] chars = input.toCharArray();
        int j;
        
        for (int i = 0; i < chars.length; i++) {
            j = chars.length-1-i;
            
            if (chars[i] != chars[j]) {
                    System.out.println("The word is not palindrome");
                    continue label;

            }

        }
        System.out.println("The Word is Palindrome");

        } while (true);
        
    }
}
