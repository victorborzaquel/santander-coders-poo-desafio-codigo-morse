public class Main {
    public static void main(String[] args) {
        //testes:
        Tradutor tradutor   = new Tradutor();
        String emMorse      = ".--- --- .- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .- ! ! !";
        String emPortugues  = tradutor.traduzirDoMorse(emMorse);
        String emMorseDnv   = tradutor.traduzirDoPortugues(emPortugues);

        System.out.println(emMorseDnv);
        System.out.println(emPortugues);
    }
}
