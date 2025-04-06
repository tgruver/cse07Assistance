package cse007;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

import java.io.InputStream; //to simulate testing with Scanner objects
import java.io.ByteArrayInputStream; //to simulate testing with Scanner objects
import java.util.Scanner;

public class BinarySearch2DTests
{

    @Test
    @DisplayName("Hello")

    @Timeout(1)
    void userInputValid(){
        BinarySearch2D binSearch = new BinarySearch2D();
/*
 *  Testing with Scanners can be tricky... 
 *  I dont want to use a scanner and call for user input in my tests because I want my testing script to be autonomous
 * 
 *  Scanner objects are the same type of object as System.in unless parsed to a different data type through methods like nextInt() and so on. 
 * 
 *   - Instead of system.in reading from the keyboard, it will instead read from a string that I define. System.in reads from a input stream of type byte array. 
 *   - Set this equal to a variable and call this varaible in the method argument.   
 */
       InputStream originalSystemIn = System.in; // like closing and opening a scanner. Want to restore what system.in was after test case

        //case 1
        String simulatedInputForCase1 = "2";
        ByteArrayInputStream sICase1 = new ByteArrayInputStream(simulatedInputForCase1.getBytes()); //byte  array of simulated input is sent to the input stream. 
        System.setIn(sICase1); //point System.in to the a new input stream that contains the array of byte  i created for this test case instead of the keyboard
        Scanner input = new Scanner(System.in);
        assertEquals(2, binSearch.userInput(input), "Test within bounds");

        //case 2
        String simulatedInputForCase2 = "input\nbad\n5";        
        ByteArrayInputStream sICase2 = new ByteArrayInputStream(simulatedInputForCase2.getBytes()); //byte array of simulated input is sent to the input stream. 
        System.setIn(sICase2); //point System.in to the a new input stream that contains the array of byte  i created for this test case instead of the keyboard
        Scanner input2 = new Scanner(System.in);
        //need to test for invalid input
        //Program will hang indefinitely unless user input is valid. I need to enter a invalid input followed by a valid input. This can be done using new lines in one string, because the input stream will read each new line as a new entry. 
        
        
       
        System.out.println("Starting second tase case: If invalid, then infinite loop will trigger.");
        
        //assertEquals(5, binSearch.userInput(input2), "If pass, then then handles incorrect tast case correctly.");
        System.setIn(originalSystemIn);
    }

    
}
