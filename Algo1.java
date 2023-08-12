import java.util.Scanner;

public class Algo1{

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = 0;
        do{
        System.out.print("Enter the Number to calculate Fibonacci Sequence: ");
        number = scanner.nextInt();
        scanner.nextLine();

            if (number>=0){

            int fab1=0;
            int fab2=1;
            int i =1;
            int total =0;

                do{

                    if (number ==0){
                        total=0;
                        i=0;

                    }else if (number==1){
                        total =1;
                        i=1;

                    }else{
                    total = fab1 + fab2;
                    fab1=fab2;
                    fab2=total;
                    i++;
                    }

                }while (i<number);
            System.out.printf("Fibonacci Sequence up to %d is : %d\n",number, total );
            }

            else if (number<0) {
                System.out.println("Enter a Positive Number");
                continue;
            }   
                   
        } while (true )  ;  
    }
}