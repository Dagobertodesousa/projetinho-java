package Ferramenta;

public class Gerador {
    private static int numeroCaractere = 16;
    public String code;
    
    public Gerador() {
        this.code = "";
    }

    public String gerarCode(){
        String[] caractere = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", ",", ".", "~", "]", "[", "(", ")", "'", "!", "@", "#", "$", "%", "¨", "&", "*", "-", "=", "+", "_","/", "?", "°", ";", ":", "º", "ª", "´", "^", "¹", "²", "³", "£", "¢", "¬", "\\", "|"};
        return "";
        double limite = (double) caractere.length;
        for (int i = 0; i < numeroCaractere; i++){
            int index = Math.floor(Math.random() * limite);
            this.code = caractere[index];
        }
    }
    public static void main(String[] args) {
        Gerador gerador = new Gerador();
        System.out.println();
    }
}
