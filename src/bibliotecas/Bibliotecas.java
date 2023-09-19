package bibliotecas;
// Importando bibliotecas
import javax.swing.*;
import java.awt.*;

// A classe JFrame é uma classe abstrata que fornecerá funcionalidades para criar e gerenciar janelas gráficas.
// Nós a extendemos (herdamos) para utilizar seus métodos e criar uma janela personalizada.
public class Bibliotecas extends JFrame {

    // Swing
    JFrame janela = new JFrame();
    JButton botao = new JButton();

    // AWT
    Button botao2 = new Button();

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
