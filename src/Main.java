/*
Question : Given an array of size N. The task is to find the maximum and the minimum element
of the array using the minimum number of comparisons.
________________________________________________________________________________________________
I/O = {3,5,4,1,9}
O/P = min - 1 and max - 9
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,ArraySize,Maximum = 0;
        System.out.println("Enter the size of array :");
        ArraySize = input.nextInt();
        int[] array = new int[ArraySize];
        System.out.println("Enter the number in array :");
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("First finding the maximum number in array :");
        for (start = 0; start < array.length; start++){
            if (Maximum <= array[start]){
                Maximum = array[start];
            }
        }
        System.out.println("Printing the maximum number in given array : " + Maximum);
        for (start = 0; start < array.length; start++){
            if (Maximum >= array[start]){
                Maximum = array[start];
            }
        }
        System.out.println("Printing the maximum number in given array : " + Maximum);

    }
}