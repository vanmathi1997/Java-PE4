public class Transpose {
        public String reverseString(String string)
        {
            String reverseString;

            if(string==""){
                return "Error:Empty String";
            }

            reverseString = "";
            String[] words = string.split(" "); //splits the input string into a string array of words
            for (int i = 0; i < words.length; i++)
            {
                reverseString += reverseWord(words[i] + " "); //reverses each element of the string array
            }
            return reverseString.trim();
        }
        public String reverseWord(String word)
        {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) //loop for reversing the input string
            {
                reverseWord += word.charAt(i);
            }
            return reverseWord;
        }


    }

