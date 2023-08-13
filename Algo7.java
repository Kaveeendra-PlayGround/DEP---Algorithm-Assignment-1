import java.util.Scanner;

public class Algo7 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input;

        do{

        System.out.print("Enter a Sentence : ");
        input = scanner.nextLine().strip();
        if (input.isEmpty()) continue;
        char [] chars = input.toCharArray();
        int letters =0;
        int maximum =0;
        int shortest = 1000;
        char space = ' ';
        int maxStartAt =0;
        
        for (int i = 0; i < chars.length; i++) {
            
            letters = letters + 1;
 
            if (' ' == chars[i]){
                
                if (maximum > letters-1);
                else maximum = letters-1;
                letters =0; 
            } else if (i== chars.length-1){
                if (maximum > letters);
                else maximum = letters;
                letters =0;
            }
            
        }

        System.out.printf("Length of Longest Word is %d \n",maximum);

        for (int i = 0; i < chars.length; i++) {
            
            letters = letters + 1;

            if (' ' == chars[i]){
                
                if (shortest < letters-1);
                else shortest = letters-1;
                letters =0; 
            } else if (i== chars.length-1){
                if (shortest < letters);
                else shortest = letters;
                letters =0;
            }
            
        }

        System.out.printf("Length of Longest Word is %d \n",shortest);
        } while (input.isEmpty());
        
    }
}
