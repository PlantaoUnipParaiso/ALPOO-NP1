package listeners;

import javax.swing.*;
// Lembre sempre de importar essas duas bibliotecas ou java.awt.* para não ter problemas com o ActionEvent e ActionListener
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A interface ActionListener é implementada para habilitar a detecção de eventos de ação, como cliques de botão.
// Ao implementar essa interface em nossa classe, podemos responder aos eventos de ação de componentes, como botões.
public class MyListeners extends JFrame implements ActionListener{
    JFrame janela = new JFrame("Janela");
    JButton botao = new JButton("Botão1");
    JButton botao2 = new JButton("Botão 2");

    public MyListeners() {
        // Configurando janela (this)
        this.setBounds(0, 0, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 2));

        // Adicionando componentes
        this.add(botao);
        this.add(botao2);

        // Adicionando ações -> componente.addActionListener(this);
        botao.addActionListener(this);
        botao2.addActionListener(this);

        this.setVisible(true);
    }

    // O método abstrato da interface ActionListener chamado de actionPerformed() é chamado automaticamente sempre que um evento de ação ocorre.
    public void actionPerformed(ActionEvent e) {
        // Pegando o objeto que disparou o evento
        Object obj = e.getSource();
        if(obj.equals(botao)){
            System.out.println("Botão1 clicado");

        // Outra forma de fazer a mesma coisa, a anterior é mais recomendada
        }else if (e.getSource() == botao2){
            System.out.println("Botão2 clicado");
        }
    }

    public static void main(String[] args) {
        MyListeners myListeners = new MyListeners();
    }
}