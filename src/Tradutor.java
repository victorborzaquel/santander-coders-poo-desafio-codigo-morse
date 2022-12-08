import java.util.HashMap;
import java.util.Locale;

//.--- --- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .- ! ! !
public class Tradutor {

    public final   String[] alfabetoMorse = {"/", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----","!","?"};
    public final   String[] alfabeto      = {" ", "a" ,   "b" ,   "c" ,  "d" , "e",  "f"  ,  "g" ,   "h" , "i" ,   "j" ,  "k" ,   "l" , "m" ,  "n",  "o" ,   "p" ,   "q" ,  "r" ,  "s" , "t",  "u" ,   "v" ,  "w" ,   "x" ,   "y" ,   "z" ,    "1" ,    "2" ,    "3" ,   "4"  ,   "5"  ,   "6"  ,    "7" ,    "8" ,   "9"  ,    "0" ,"!","?"};
    public final HashMap<String,String> morseMap;
    public final HashMap<String,String> portuguesMap;
    public Tradutor()
    {
        this.morseMap       = alimentarHashMap(alfabetoMorse,alfabeto);
        this.portuguesMap   = alimentarHashMap(alfabeto,alfabetoMorse);
    }
    public String traduzirDoMorse(String fraseMorse)
    {
        StringBuilder frasePortugues = new StringBuilder();
        String[] fraseMorseSeparada = fraseMorse.split(" ");
        for (String sequenciaMorse : fraseMorseSeparada)
        {
            frasePortugues.append(morseMap.get(sequenciaMorse));
        }
        return frasePortugues.toString();
    }
    public String traduzirDoPortugues(String frasePortugues)
    {
        StringBuilder fraseMorse = new StringBuilder();
        String[] frasePortuguesSeparada = frasePortugues.toLowerCase().split("");
        for (String caracterPortugues : frasePortuguesSeparada)
        {
            fraseMorse.append(portuguesMap.get(caracterPortugues));
            fraseMorse.append(" ");
        }
        return fraseMorse.toString();
    }
    private HashMap<String,String> alimentarHashMap(String[] chave, String[] valor)
    {
        HashMap<String, String> morseMap = new HashMap<>();
        for (int i = 0 ; i < chave.length ; i++)
        {
            morseMap.put(chave[i],valor[i]);
        }
        return morseMap;
    }
}
