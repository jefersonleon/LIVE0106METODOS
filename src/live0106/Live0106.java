package live0106;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Live0106 {

    public static void main(String[] args) {
        double a, b;
        int x, y;
        Scanner ler = new Scanner(System.in);
        Metodos calc = new Metodos();

        calc.escreverSaudacao();
        a = Double.parseDouble(JOptionPane.showInputDialog("Fracionario 1"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Fracionario 2"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Inteiro 1"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Inteiro 2"));

        calc.dividir(x,y);
        calc.dividir(a,b);
        

    }

}
