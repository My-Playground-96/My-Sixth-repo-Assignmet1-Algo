import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        char[] chars ;
        boolean flag = false;
        String str;
        loop:{
        do{
            System.out.print("Enter the Telephone number: ");
            str = scanner.nextLine().strip();
            chars = str.toCharArray();
            if(str.isBlank()) {
                System.out.println("Telephone number can't be empty!!!");
                flag = true;
            }
            
            else if (!(chars.length == 11 || chars.length == 15)){
                System.out.println("Invalid telephone number!!!");
                flag = true;
            }
            
            if (chars.length == 11){
                if (chars[0] == '0' && chars[3] == '-'){
                    for (int i = 0; i < chars.length; i++) {
                        if ( i == 0 || i == 3 ) continue;
                        else if ( !Character.isDigit(chars[i])){
                            System.out.println("Invalid telephone number!!!");
                            flag = true;
                            break loop;
                        }
                    }
                    System.out.println("Number is validated");
                    break loop;
                
                }
                System.out.println("Invalid telephone number!!!");
                flag = true;
                break loop;
            }else if (chars.length==15){
                if (str.startsWith("+94") && chars[3] == ' ' && chars[6] == ' ' && chars [10]==' '){
                    for (int i = 4; i < chars.length; i++) {
                        if ( i==6 || i ==10 ) continue;
                        else if ( !Character.isDigit(chars[i])){
                            System.out.println("Invalid telephone number!!!");
                            flag = true;
                            break loop;
                        }
                    }
                    System.out.println("Number is validated");
                    break loop;
                }
                System.out.println("Invalid telephone number!!!");
                flag = true;
                break loop;

            }
        

        }while(str.isBlank() || flag );

    }
    }
    
}
