public class tabuada { // objeto criado para tabuada

    public int tabuada3(int a) {
        return a;
    }

    public int tabuada4(int b) {
        return b;
    }

    public static void main(String[] args) {

        // tabuada de 2
        int Tabuada = 0;
        for (int i = 2; i < 22; i = i + 2) {
            Tabuada = i;
            System.out.println(" valor é " + Tabuada);
        }

        // tabuada de 3
        String Divisor = "------------------------------";
        System.err.println(Divisor);

        tabuada resul = new tabuada(); // objeto criado
        int resultado = resul.tabuada3(32);// Chamando o método tabuada3 que é tabuada de 3

        // os atributos que foram construido com os objetos/metodos de cima
        for (int e = 0; e < resultado; e = e + 3) {
            System.out.println(" Tabuada de 3 é " + e);//
        }

        // tabuada de 4
        String Divisor2 = "------------------------------";
        System.err.println(Divisor2);

        tabuada resul4 = new tabuada();
        int resultado4 = resul4.tabuada4(42);

        for (int f = 0; f < resultado4; f = f + 4) {
            System.out.println(" a tabuada de 4 é " + f);
        }

    }

}
