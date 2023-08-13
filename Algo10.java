import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        label:
        do{
            System.out.print("Enter the Phone Number: ");
            String input = scanner.nextLine();

            char [] chars = input.toCharArray();

            if (input.strip().isEmpty()){
                System.out.println("Telephone number can't be empty");
                continue;
            }
            if (input.startsWith("0") && input.length() == 11 && chars[3] == '-'){
                for (int i = 0; i < input.length(); i++) {
                    if (i != 3){
                    boolean flag = Character.isDigit(chars[i]);
                        if(flag == false) {
                            System.out.println("Phone Number is not validated ");
                            break;
                        } 
                    }
                }
                System.out.println("Phone Number is Validated");
                break;
            }
                
            if (input.startsWith("+94 ") && input.length() == 14 && chars[6]==' ')  {
                for (int i = 4; i < input.length(); i++) {
                    if (i != 6 ){
                    boolean flag = Character.isDigit(chars[i]);
                        if(flag == false) {
                            System.out.println("Phone Number is not validated ");
                            break;
                        } 
                    }                 
                    
                }
                System.out.println("Phone Number is Validated");
                break;

            }else System.out.println("Phone number is not validated..");

        }while (true);
        
    }
}
