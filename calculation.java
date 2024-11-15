import javax.swing.JOptionPane;

public class calculation { // isso é a function em Java

    // minha chamada para calcular
    public int soma(int a, int b) {
        return a + b;
    }

    public int menos(int c, int d) {
        return c - d;
    }

    public int multiplica(int e, int f) {
        return e * f;
    }

    public int divide(int g, int h) {
        return g / h;
    }

    public static void main(String[] args) {

        calculation calc = new calculation(); // criando meu objeto calculado
        String ValorRecebido = JOptionPane.showInputDialog("digita ai um operador");
        String imputa = JOptionPane.showInputDialog("digite um valor");
        String imputa2 = JOptionPane.showInputDialog("digite um valor");

        int number = Integer.parseInt(imputa);
        int number2 = Integer.parseInt(imputa2);
        int resultado; // variavel que foi chamada depois do if;
        // int resultado = calc.soma(number, number2);

        // JOptionPane.showMessageDialog(null, "Sum: " + resultado);

        if (ValorRecebido.equals("+")) {
            resultado = calc.soma(number, number2);// vem do new calculation
            JOptionPane.showMessageDialog(null, "Sum: " + resultado);

        } else if (ValorRecebido.equals("-")) {
            resultado = calc.menos(number, number2);
            JOptionPane.showMessageDialog(null, "Difference: " + resultado);
        } else if (ValorRecebido.equals("*")) {
            resultado = calc.multiplica(number, number2);
            JOptionPane.showMessageDialog(null, "Product: " + resultado);

        } else if (ValorRecebido.equals("/")) {
            resultado = calc.divide(number, number2);
            JOptionPane.showMessageDialog(null, "Quotient: " + resultado);
        }
    }
}
