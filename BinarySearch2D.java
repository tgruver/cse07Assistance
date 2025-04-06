package cse007;
import java.util.Scanner;
public class BinarySearch2D 
{
    public static void main( String[] args ) {
        int row = 0, col = 0;
        int[][] matrix = new int[row][col];

        Scanner input = new Scanner(System.in);
        int key = userInput(input);
        //displayMatrix(matrix);
        //boolean isFound = searchMatrix(matrix, key);
    }
/*
 * Method to validate user input, insuring integer.
 * @param n is user input
 * @return user input once validated
 */
    static int userInput(Scanner n){
        while (true) {    
            if(n.hasNextInt()) return n.nextInt();
            else System.out.println("Not a integer"); 
        }
    }
/*
 *Method to display 2d array
 @param arr is array to be displayed thru terminal
 @return void
 */
    static void displayMatrix(int[][] twoDArr){

    } 

    /*
     * Method to search through presorted 2d array arr using binary search
     * @param arr is array that will be searched
     * @param k is the key value
     * @return true if found, false otherwise
     */
    static boolean searchMatrix(int[][] arr, int k){
        return true;
    }
}

