import java.util.Scanner;

public class Algo5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;

        do{
         System.out.print("Enter a Text ASCII only: ");

         input = scanner.nextLine();

         char [] chars = input.toCharArray();
        //System.out.println(chars);

        for (int i = chars.length-1; i >= 0; i--) {
        System.out.print(chars [i]);
        }

        }while (input.isEmpty());

        System.out.println();
        
    }
}
