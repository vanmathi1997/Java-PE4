public class ReplaceCharacters {
        public String replaceCharacters(String input) {
            if(input==""){
                return null;
            }
            String result = input.toLowerCase(); //converts to lower case
            result = result.replaceAll("d","f"); //replaces character 'd' with 'f'
            result = result.replaceAll("l","t"); //replaces character 'l' with 't'
            return result;
        }

    }

