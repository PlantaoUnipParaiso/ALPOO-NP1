package componentes;

import javax.swing.*;
import java.awt.*;

public class MyComponentes extends JFrame {

    // Componente de Janela
    JFrame janela = new JFrame("Janela");

    // Componente de Painel
    JPanel painel = new JPanel();

    // Componente de Botão
    JButton botao = new JButton("Botão");

    // Componente de Campo de Texto
    JTextField campo = new JTextField("Campo");

    // Componente de Rotulo
    JLabel rotulo = new JLabel("ROTULO");

    // Componente de Senha
    JPasswordField senha = new JPasswordField("Senha");

    // Componente de Barra de Menu
    JMenuBar barraMenu = new JMenuBar();

    // Componente de Menu
    JMenu menu = new JMenu("Menu");
    JMenu subMenu = new JMenu("subMenu");

    // Componente de Item de Menu
    JMenuItem itemMenu = new JMenuItem("Item");
    JMenuItem itemMenu2 = new JMenuItem("Item2");


    // Construtor
    public MyComponentes(){
        // Configurando janela (this)
        this.setBounds(0, 0, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(2, 2));
        this.setTitle("Janela");
        this.setJMenuBar(barraMenu);

        // Adicionando componentes a Janela
        // Adicionando um painel
        this.add(painel, BorderLayout.CENTER);
        //Adicionando componentes a um painel
        painel.add(botao);
        painel.add(campo);
        painel.add(senha);

        // Adicionando a barra de menu -> menu -> item de menu & subMenu -> item de menu2
        this.add(barraMenu, BorderLayout.NORTH);
        barraMenu.add(menu, BorderLayout.NORTH);
        menu.add(itemMenu);
        menu.add(subMenu);
        subMenu.add(itemMenu2);

        this.add(rotulo, BorderLayout.SOUTH);
        // Fim da adição de componentes

        // Não é obrigatorio, mas é uma boa pratica coloca-lo no final do construtor
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Estamos instanciando a classe para que o construtor seja executado
        MyComponentes componentes = new MyComponentes();
    }
}