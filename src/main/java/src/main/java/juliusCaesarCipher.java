
package src.main.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class juliusCaesarCipher {


    /***********
     * Gets String of Letters For Encoding OR Decoding
     **********/
    static String getInput(){
        Scanner inputer = new Scanner (System.in);
        String inputerReturnVal = inputer.nextLine();                       // gets in a string from a user

        System.out.println("Your Input is: " + inputerReturnVal);
        System.out.println("Is this fine or would you like to change your Input? (Y/N)");

        boolean cont= false;
        Scanner decision = new Scanner (System.in);                         // Confirms if the string is correct or to be changed
        String returnedDecision = decision.nextLine();
        switch (returnedDecision){
            case "y":
                cont = true;
                System.out.println("continuing!");
                break;

            case "n":
                System.out.println("Restarting");
                getInput();
        }
        return inputerReturnVal;                                            // Returns String Value to main program
    }

    /***********
     * Gets Shift Value For Encoding OR Decoding
     **********/
    static int getShiftInput(){
        System.out.println("Type a shift value");
        Scanner inputer = new Scanner (System.in);
        int shiftReturnVal = inputer.nextInt();
        return shiftReturnVal; // Returns Shift Value to Main program
    }

    /***********
     * Converts user String Input to an array of numbers using stringToNumber.java class
     **********/
    static int[] getStringToNumber(String userTextInput){
        stringToNumber stringToNumber= new stringToNumber(userTextInput);
        int[] userNumberInput= stringToNumber.convertToNumber();
        System.out.println(userNumberInput);
        return userNumberInput;
    }

    /***********
     * Converts user Number Input to an array of Letters using numberToString.java class
     **********/
    static String getNumberToString(int[] userDecodedInput){
        numberToString numberToString= new numberToString(userDecodedInput);
        String numberToStringInput = numberToString.convertToString();
        System.out.println(numberToStringInput);
        return numberToStringInput;
    }

    /***********
     * Takes Shift value input and shifts its value using encoder.java class
     **********/
    static int[] getEncodedNumbers(int[]userNumberInput, int userShiftInput){
        encoder encoder = new encoder(userNumberInput, userShiftInput);
        int[] shiftedInput= encoder.convertToEncode();
        System.out.println(shiftedInput);
        return shiftedInput;
    }

    /***********
     * Takes Shift value input and deshifts its value using encoder.java class
     **********/
    static int[] getDecodedNumbers(int[]userNumberInput, int userShiftInput){
        encoder encoder = new encoder(userNumberInput, userShiftInput);
        int[] shiftedInput= encoder.convertToEncode();
        System.out.println(shiftedInput);
        return shiftedInput;
    }

    static int chooseUserTask() {
        Scanner input = new Scanner (System.in);
        System.out.println("Would you like to encode or decode a message? Type 0 for encode, 1 for decode");
        int userTaskChoice = input.nextInt();                               // Sets whether user is going to encode or decode a message - 0 for Encoding, 1 for Decoding
        return userTaskChoice;
    }

    public static void main(String[] args){
        //Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the Julius Caesar Cipher App!");

        int userTaskChoice=chooseUserTask();

        if(userTaskChoice == 0){                                            // Begins Encoding Process

            String userTextInput= getInput();                               //Asks user for some text
            int userShiftInput = getShiftInput();                           // Asks user for a shift value
            int[] userStringToNumberInput = getStringToNumber(userTextInput);
            System.out.println("Your message is: " + userTextInput);
            int[] userShiftedInput = getEncodedNumbers(userStringToNumberInput, userShiftInput);
            System.out.println("Your encoded Message is: " + Arrays.toString(userShiftedInput));

        }

        if (userTaskChoice == 1){                                           // Begins Decoding Process

            String userNumberInput = getInput();                            //Asks user for some text
            int[] userNumberInputArr = new int[userNumberInput.length()];   // Converts String input into Array
            for (int i = 0; i < userNumberInput.length(); i++) {
                userNumberInputArr[i] = userNumberInput.charAt(i) - '0';
            }
            System.out.println("Encoded message is" + Arrays.toString(userNumberInputArr));
            int userShiftInput = getShiftInput();                           // Asks user for a shift value
            int[] userDecodedInput = getDecodedNumbers(userNumberInputArr, userShiftInput);
            System.out.println("Your decoded Message is: " + Arrays.toString(userDecodedInput));
            String userNumberToStringInput = getNumberToString(userDecodedInput);
            System.out.println("Your interpreted Message is: " + userNumberToStringInput);


            //int[] userShiftedInput = userShiftInput.toArray;
            //int userShiftedInput = getDecodedNumbers(userNumberInput, userShiftInput);
        }

        else{
            System.out.println("PLEASE ENTER A VALID OPTION - 0 for encoding, 1 for decoding");
            chooseUserTask();
        }

        //char[] userTextInputArray = userTextInput.toCharArray(); // Converts string into an array of characters

    }
}
