import java.util.Scanner;

public class Algo1{
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        

        boolean flag = true;
        do{
            System.out.println("Enter your number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num > 0){
                int fn1 = 1;
                int fn2 = 1;
                int fn3 = 1;
                int fn4 = 1;
                System.out.print(fn1);
                while(true){ 
                    System.out.print(" " + fn3);
                        fn3 = fn1+fn2;
                        fn2 = fn1;
                        fn1 = fn3;
                    if (fn3-fn1 > num - fn3)
                        break;
                    
                }
                System.out.println();
                
                flag = false;

            }


        }while(flag);

    }

}