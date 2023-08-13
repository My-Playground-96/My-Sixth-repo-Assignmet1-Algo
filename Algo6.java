
import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String text;
        char [] array;
        boolean flag;
        String str2 = "";
        do{
            flag = false;
            System.out.println("Enter your text(ASCII only): ");
            text = scanner.nextLine().strip();
            array = text.toCharArray();
            
            for (int i = 0; i < array.length; i++) {

                if ((array[i]>127) || (array[i]<0)){
                    System.out.println("Invalid input! Enter only ASCII\n");
                    flag = true;
                    break;
                }
            } 
                 
        }while(text.isBlank() || flag );

        String str = "";
        for (int j = 0 ; j < array.length ; j++) {
            if(array[j] != ' ' || j == array.length){
          
                str+= array[j];    
                ///System.out.println(str);
            } 
            if (array[j] == ' ' || j == array.length-1){
                str2 = String.format("%s "+str2, str.toString());
                str = "";  
                  
            }
            
        }
        System.out.println(str2);    
        
    } 

}
