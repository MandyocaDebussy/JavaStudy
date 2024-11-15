
// import java.util.Scanner;
import javax.swing.JOptionPane;

public class DayWeek {
    public static void main(String[] args) {

        String quisDay = JOptionPane.showInputDialog("Enter a number from 1 to 7 to select a day of the week:");

        // Scanner scanner = new Scanner(System.in);

        // int nome = scanner.nextInt();
        // dayName = ("Você tem " + idade + " anos.");
        // if (nome == "seila") {
        // dayName = ("Olá Amanda!");
        // }

        // int dia = scanner.nextInt();

        int dia = Integer.parseInt(quisDay); // Integer.parseInt() é utilizado para converter uma string em um número
                                             // inteiro.
        String dayName;

        switch (dia) {

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input. Please enter a number between 1 and 7.";
        }
        JOptionPane.showMessageDialog(null, dayName);
        // scanner.close();

    }
}
