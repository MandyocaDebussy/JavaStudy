import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        String[] itens = { "lapis", "borracha", "papel" };// uma array com objetos
        for (int i = 0; i < itens.length; i++) {

            System.out.println(itens[i]);
        }

        float sum = 5f, meno = 3;

        float[] numeros = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f };

        sum = sum / meno;
        System.out.println(sum);
        System.out.println(Arrays.toString(numeros));
    }

}
