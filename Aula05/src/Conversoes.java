public class Conversoes {

    public static void main(String[] args) {
    /*
    inteiros: byte, short, int, long
    quebrados: float, double

    é possivel colocar as strings menores dentro das maiores, "byte --> short"
    mas short --> byte só fazendo o casting (forçando)
    */

        byte digito = 1;
        int digitoInt = digito;

        int numero = 1;
        byte numeroByte = (byte) numero; //cast, força o tipo de dado a ser o tipo escolhido

    }

}
