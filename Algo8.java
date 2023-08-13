public class Algo8 {
    public static void main(String[] args) {
    
    int[] numA = {5, 7, -2, 3, 4, 6, -8};
    int[] numB = {7, 8, -8, 2, 1, -9, 6};

    System.out.print("numA \u2229 numB = {");

    label1:
    for (int i = 0; i < numA.length; i++) {
        for (int j = 0; j < i; j++) { 
            if (numA[i]==numA[j]) continue label1;   
        }
        for (int j = 0; j < numB.length; j++) {
            if (numA[i] == numB[j]){
                System.out.printf("%d, ",numA[i]);
                break;
            }  
        } 
    }
    System.out.print("\b\b}\n");

    System.out.print("numA \u222A numB = {");

    int [ ]numC = new int [numA.length+numB.length]; 
    for (int i = 0; i < numC.length; i++) {
        if (i<numA.length) numC[i] = numA[i];
        else numC[i] = numB[i-numA.length];
    }
    label2:
    for (int i = 0; i < numC.length; i++) {
        for (int j = 0; j < i; j++) {
            if (numC[i]==numC[j]) continue label2;  
        }
        System.out.printf("%d, ", numC[i]);  
    }
    System.out.print("\b\b}\n"); 

    System.out.print("numA \\ numB = {");

    label3:
    for (int i = 0; i < numA.length; i++) {
        for (int j = 0; j < numB.length; j++) {

            if (numA[i]== numB[j]) continue label3;
        }
        System.out.printf("%d, ", numA[i]);         
    }
    System.out.print("\b\b}\n"); 

    System.out.print("numB \\ numA = {");

    label4:
    for (int i = 0; i < numB.length; i++) {
        for (int j = 0; j < numA.length; j++) {

            if (numB[i]== numA[j]) continue label4;
        }
        System.out.printf("%d, ", numB[i]);         
    }
    System.out.print("\b\b}\n"); 

    System.out.print("numA \u25B3 numB = {");
    label5:
    for (int i = 0; i < numC.length; i++) {
        for (int j = 0; j < numC.length; j++) {

            if(i!=j)  if (numC[i]== numC[j]) continue label5;
        }
        System.out.printf("%d, ", numC[i]);         
    }
    System.out.print("\b\b}\n");  
    
    } 

}
