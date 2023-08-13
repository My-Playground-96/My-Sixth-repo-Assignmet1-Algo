import java.util.Arrays;

public class Algo8 {

    public static void main(String[] args) {
        
        int[] numA = {5,7,-2,3,4,6,-8};
        int[] numB = {7,8,-8,2,1,-9,6};
        
        int[] array0 = new int[0];
        loop:
        for (int i = 0; i < numB.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]){
                    for (int j2 = 0; j2 < array0.length; j2++) {
                        if (numA[i] == array0[j2])
                        continue loop;
                    }

                    int [] temp = new int[array0.length+1];
                    for (int j2 = 0; j2 < array0.length; j2++) {
                        temp[j2] = array0[j2];    
                    }
                    temp[temp.length-1] = numA[i];
                    array0 = temp;  
                }
                
            }
            
        }
        System.out.println(Arrays.toString(array0));


        int[] array = new int[0];

        loop:
        for (int i = 0; i < (numA.length+numB.length) ; i++) {
            if(i<numA.length){
                for (int j = 0; j < array.length; j++) {
                    if(numA[i]==array[j]){
                        continue loop;
                    }
                }
                int [] temp = new int[array.length+1];
                for (int j = 0; j < array.length; j++) {
                    temp[j]=array[j];
                }
                temp[temp.length-1]=numA[i];
                array=temp;
                //System.out.println(Arrays.toString(array));
            }

            if(i>=numA.length){
                for (int j = 0; j < array.length; j++) {
                    if(numB[i-numA.length]==array[j]){
                        continue loop;
                    }
                }
                int [] temp = new int[array.length+1];
                for (int j = 0; j < array.length; j++) {
                    temp[j]=array[j];
                }
                temp[temp.length-1]=numB[i-numA.length];
                array=temp;
        
            }
        }
        System.out.println(Arrays.toString(array));
        



        int[]array2 = new int[0];
        
        loop:
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < array0.length; j++) {
                if (!(numA[i] == array0[j])){
                    for (int j2 = 0; j2 < array2.length; j2++) {
                        if(numA[i] == array2[j2]){
                            continue loop;
                        }
                         
                    }

                    int [] temp = new int[array2.length+1];
                    for (int k = 0; k < array2.length; k++) {
                        temp[k] = array2 [k];
                        
                    }
                    temp[temp.length-1] = numA[i];
                    array2 = temp;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(array2));

        int[]array3 = new int[0];
        
        loop:
        for (int i = 0; i < numB.length; i++) {
            for (int j = 0; j < array0.length; j++) {
                if (!(numB[i] == array0[j])){
                    for (int j2 = 0; j2 < array3.length; j2++) {
                        if(numB[i] == array3[j2]){
                            continue loop;
                        }
                         
                    }

                    int [] temp = new int[array3.length+1];
                    for (int k = 0; k < array3.length; k++) {
                        temp[k] = array3 [k];
                        
                    }
                    temp[temp.length-1] = numB[i];
                    array3 = temp;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(array3));
        }
                

    }
        
    
    

