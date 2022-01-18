/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class Enigma {

    //Setting up the alphabet so the shift and rotators can work.
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUWXYZ";

    /**
     * TODO - Implement the Encrypt method
     * Steps in brief
     * 1. Apply the CAESAR shift using the increment number
     * 2. For each rotor in the list rotors
     * 2.1 Translate the message using the rotor
     * 3. Return the encrypted string
     */

    public static String Encrypt(String message, int incrementNumber,List<String> rotors ){

        //Getting parameters and transforming in variables
        //The message has being transformed to Upper Case
        String initialMessage = message.toUpperCase(Locale.ROOT);
        String resultMessage = "";
        int increment = incrementNumber;
        ArrayList<String> rotorsValues = new ArrayList<>(rotors);
        String tester = " ";
        int arrLength = alphabet.length();

        //iterates over the initial message
        for(int i=0; i < initialMessage.length(); i++){

            //receives the letter on the loop index
            char letter = initialMessage.charAt(i);

            //tests if the letter is a space
            if (letter == tester.charAt(0)){
                //add a space to the result
                resultMessage += tester;
            } else {
                //loop through the alphabet to shift the letters
                for(int j=0; j < alphabet.length(); j++){

                    int letterPointer = j + increment;
                    //
                    if(letter == alphabet.charAt(j)){
                        System.out.println(alphabet.charAt(j));

                        //System.out.println(alphabet.charAt(letterPointer)); For some reason the added int is not working, give errors.
//                      resultMessage += String.valueOf(alphabet.charAt(letterPointer));
//                      System.out.println("First Stage second loop: "+resultMessage);
                    }

                }
            }

            System.out.println("First Stage first loop: "+resultMessage);
        }

        System.out.println("First Stage out of loop: "+resultMessage);


        System.out.println(rotorsValues);


        return "Implement the encrypt method";
    }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
