import javax.swing.JOptionPane;

public class Vi {
    public static void main(String[] args) {
        String None = JOptionPane.showInputDialog("qual é o seu nome?");

        if (None.equalsIgnoreCase("Amanda")) { // Aceita maiuscula e minuscula
            JOptionPane.showMessageDialog(null, "Ola, Amanda!");
        } else if (None.equalsIgnoreCase("Marcio")) {
            JOptionPane.showMessageDialog(null, "Te amo coisa linda!!");
        }

    }
}
