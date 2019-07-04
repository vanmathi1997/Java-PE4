import java.util.Scanner;

public class CountOccurrence {


        public int countOccurence(String inputString, char character, int index, int count){

            inputString = inputString.toLowerCase(); //converts string to lower case
            if (index < inputString.length()) {
                if (character == inputString.charAt(index)) {
                    count++;
                }
                index++;
                count = countOccurence(inputString, character, index, count);
            }

            return count; //returns count value

        }


    }


