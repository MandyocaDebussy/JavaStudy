import javax.swing.JOptionPane;

public class GerarSenha {
    public static void main(String[] args) {
        int senha = (int) (Math.random() * 10000) + 6000;

        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
        System.exit(0); // Fecha a janela após a mensagem ser exibida.

    }

}
