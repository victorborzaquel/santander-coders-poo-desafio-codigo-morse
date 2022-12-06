import java.util.ArrayList;
import java.util.List;

public class Traduzir {
    private static final List<String> MORSE = new ArrayList<>(List.of("/",".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"));
    private static final List<String> PORTUGUES = new ArrayList<>(List.of(" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));

    public static String morse(String portugues) {
        StringBuilder morse = new StringBuilder();

        for (String letter : portugues.toLowerCase().split("")) {
            morse.append(MORSE.get(PORTUGUES.indexOf(letter))).append(" ");
        }
        return morse.toString();
    }

    public static String portugues(String morse) {
        StringBuilder portugues = new StringBuilder();

        for (String letter : morse.split(" ")) {
            portugues.append(PORTUGUES.get(MORSE.indexOf(letter)));
        }
        return portugues.toString();
    }
}
