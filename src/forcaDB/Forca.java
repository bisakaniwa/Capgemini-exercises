package forcaDB;

public class Forca {
//lógica
    private int vidas = 6;
    private String palavraSecreta;
    private char [] palavra = palavraSecreta.toCharArray();

    static boolean contem(char caractere, char[] palavra) {
        for (char letra : palavra) {
            if (letra == caractere) {
                return true;
            }
        } return false;
    }

    public Forca(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
    }


    //método chutar
    public String chutar(char letra) {
return null;
    }
    //método buscarEstado
    public String buscarEstado() {
        return null;
    }

    //método buscarDadosDoJogo


}
