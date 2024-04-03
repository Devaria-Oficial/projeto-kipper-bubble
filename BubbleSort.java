
import java.io.*;

public class BubbleSort {

    private static void bubbleSort(int array[]){
        int first, second, temp;
        boolean swapped;

        for(first = 0; first < array.length - 1; first++){
            swapped = false;

            for(second = 0; second < array.length - first - 1; second++){
                if(array[second] > array[second + 1]){
                    temp = array[second];
                    array[second] = array[second + 1];
                    array[second + 1] = temp;
                    swapped = true;
                }
            }   

            if(swapped == false){
                break;
            }
        }
    }

    private static void printArray(int array[]){
        int i; 
        
        for(i = 0; i < array.length; i++){
                 System.out.println(array[i] + " ");
        }
    }

    public static void main (String args []){
        int array[] = {99, 22, 65, 12, 35, 45, 2, 100, 123, 982, 923};

        bubbleSort(array);
        System.out.println("Sorted array:");
        printArray(array);
    }
}