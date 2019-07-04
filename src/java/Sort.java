public class Sort {
    public String[] sort(String string) {

        //checking string is empty

        if (string != "") {

            //spliting string

            String array[] = string.split(" ");

            //sorting the words in asscending order

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareToIgnoreCase(array[i]) < 0) {
                        String t = array[i];
                        array[i] = array[j];
                        array[j] = t;
                    }
                }
            }
            return array;
        } else {
            String array[] = {"Error Empty String"};
            return array;
        }
    }
}
