import java.util.Scanner;

public class Algo5 {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    
        String text;
        char [] array;
        boolean flag = false;
        char char1;

        do{
            System.out.println("Enter your text(ASCII only): ");
            text = scanner.nextLine().strip();
            array = text.toCharArray();
            //char char1;
            loop:{
            for (int i = 0; i < array.length; i++) {

                if ((array[i]>127) || (array[i]<0)){
                    System.out.println("Invalid input! Enter only ASCII\n");
                    flag = true;
                    break loop;
                }
            }
                for (int j = array.length-1 ; j >= 0; j--) {
                    char1 = array[j];
                    System.out.print(char1);   
                }
                flag = false;
             
            
            //System.out.print(char1); 
            System.out.println(); 
            }  
        }while(text.isBlank() || flag );

        

    }
    
}
