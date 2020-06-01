package live0106;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Metodos {
    //MÉTODO SEM RETORNO (VOID) E SEM PASSAGEM DE PARÂMETROS

    public void escreverSaudacao() {
        JOptionPane.showMessageDialog(null, "Método 1 - Olá, "
                + JOptionPane.showInputDialog("Qual seu nome?"));
    }
//MÉTODO SEM RETORNO (VOID) E COM PASSAGEM DE PARÂMETROS
    public void escreverSaudacao(String nome) {
        JOptionPane.showMessageDialog(null, "Método 2 - Olá, "
                + nome);
    }
//MÉTODO SEM RETORNO (VOID) E COM PASSAGEM DE PARÂMETROS
    public void somar(String nome, int a, int b) { //métodos - sub-Algoritmos
        JOptionPane.showMessageDialog(null,nome+", O resultado "
                + "da Soma: " + (a + b));
    }
//MÉTODO SEM RETORNO (VOID) E COM PASSAGEM DE PARÂMETROS
    public void subtrair(int a, int b) { //métodos - sub-Algoritmos
        JOptionPane.showMessageDialog(null, "O resultado "
                + "da Subtração: " + (a - b));
    }
//MÉTODO SEM RETORNO (VOID) E COM PASSAGEM DE PARÂMETROS
    public void multiplicar(int a, int b) { //métodos - sub-Algoritmos
        JOptionPane.showMessageDialog(null, "O resultado "
                + "da Multiplicação: " + (a * b));
    }
//MÉTODO SEM RETORNO (VOID) E COM PASSAGEM DE PARÂMETROS
    public void dividir(double a, double b) { //métodos - sub-Algoritmos
        if (b != 0) {
            JOptionPane.showMessageDialog(null, "O resultado "
                    + "da Subtração: " + (a / b));
        } else {
            JOptionPane.showMessageDialog(null,
                    "Impossivel dividir por zero!");
        }
    }

    public void calcularMediaAritmetica(double n1, double n2) {
        JOptionPane.showMessageDialog(null, "O resultado "
                + "da média é: " + ((n1 + n2) / 2));
    }
}
