import java.util.Scanner;

public class Algo6 {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String input = null;
        
        do{
        System.out.print("Enter a Sentence : ");
        input = scanner.nextLine();

        char [] chars = input.toCharArray();

        int x;
        int y = chars.length -1;
        char space = ' ';

        for (int i = chars.length-1; i >= 0; i--) {


            
            if (space == chars [i] || i==0){
                if (i==0) x=0;
                else x = i+1;
                for (int j = x; j <=y; j++) {
                    System.out.print(chars[j]);                    
                }
                y = x-2;
            System.out.print(" ");  

            }
            if (y<=0) break;
            
            
        }
        System.out.println();

        }while (input.isEmpty());

        
    }
}
