import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String tekst1 = "bomba";
        String tekst2 = "bmoab";
        boolean isAnagram = true;

        List<Character> listOfChar = new ArrayList<Character>();

        if (tekst1.length() != tekst2.length()) {
            isAnagram = false;
        }
        for (int i = 0; i < tekst1.length(); i++) {
            listOfChar.add(tekst1.charAt(i));
        }

        for (int i = 0; i < tekst2.length(); i++) {
            if (listOfChar.contains(tekst2.charAt(i))) {
                listOfChar.remove(listOfChar.indexOf(tekst2.charAt(i)));
            } else {
                isAnagram = false;
            }
        }
        System.out.println("Anagram: " + isAnagram);

    }
}