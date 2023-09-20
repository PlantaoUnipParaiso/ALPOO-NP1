package listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCardLayout extends JFrame implements ActionListener {
    // Componentes
    JPanel painelCard = new JPanel();
    // Cartão 1
    JPanel card1 = new JPanel();
    JLabel label1 = new JLabel("Cartão 1");
    // Cartão 2
    JPanel card2 = new JPanel();
    JLabel label2 = new JLabel("Cartão 2");
    // Botões
    JPanel buttonPanel = new JPanel(); // Serve para organização dos botões
    JButton voltar = new JButton("Voltar");
    JButton proximo = new JButton("Proximo");


    // Construtor
    public MyCardLayout() {
        this.setBounds(0, 0, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Titulo");
        painelCard.setLayout(new CardLayout());

        card1.add(label1);
        card2.add(label2);

        painelCard.add(card1, "Cartão 1");
        painelCard.add(card2, "Cartão 2");

        voltar.addActionListener(this);
        proximo.addActionListener(this);

        buttonPanel.add(voltar);
        buttonPanel.add(proximo);

        this.add(painelCard, BorderLayout.CENTER); // Adicione o painel de cartões ao centro
        this.add(buttonPanel, BorderLayout.SOUTH); // Adicione o painel de botões na parte inferior

        this.setVisible(true);
    }

    // Ações
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        // Ela está obtendo o gerenciador de layout atualmente definido para o painel painelCard, que é um CardLayout,
        // e armazenando esse gerenciador de layout em uma variável chamada cardLayout, que é do tipo CardLayout.
        CardLayout cardLayout = (CardLayout) painelCard.getLayout(); // Obtenha o CardLayout do painel

        if (obj.equals(proximo)) {
            cardLayout.show(painelCard, "Cartão 2"); // Mostra o "Cartão 2"
        } else if (obj.equals(voltar)) {
            cardLayout.show(painelCard, "Cartão 1"); // Mostra o "Cartão 1"
        }
    }

    // Main
    public static void main(String[] args) {
        MyCardLayout myCardLayout = new MyCardLayout();
    }
}
