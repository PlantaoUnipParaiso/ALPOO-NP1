package layout;

import javax.swing.*;
import java.awt.*;

public class MyLayouts extends JFrame {
    // Componentes para Border
    JPanel border = new JPanel();
    JButton botaoBorderNorth = new JButton("North");
    JButton botaoBorderSouth = new JButton("South");
    JButton botaoBorderCenter = new JButton("Center");
    JButton botaoBorderEast = new JButton("East");
    JButton botaoBorderWeast = new JButton("Weast");

    // Componentes para Card
    JPanel card = new JPanel();
    JButton botaoCard1 = new JButton("Card1");
    JButton botaoCard2 = new JButton("Card2");

    // Componentes para Grid
    JPanel grid = new JPanel();
    JButton botaoGrid = new JButton("Grid1");
    JButton botaoGrid2 = new JButton("Grid2");
    JButton botaoGrid3= new JButton("Grid3");
    JButton botaoGrid4 = new JButton("Grid4");

    // Componentes para nullLayout
    JPanel nullLayout = new JPanel();
    JButton botaoNull = new JButton("Botão");

    public MyLayouts(){
        this.setBounds(0, 0, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Para este exemplo estaremos utilizando no frame o null e nos paineis configuraremos os layouts de forma independente
        this.setLayout(null);
        this.setTitle("Janela");

        // Para utilizar um dos layouts remova os comentários da linha que deseja utilizar
        // Ao utilizar mais de um layout ocupando a mesma area, prevalece aquele que foi acionado primeiro (Cima pra baixo)
        //this.add(border);
        //border.setBounds(0, 0, 500, 500);

        //this.add(card);
        //card.setBounds(0, 0, 500, 500);

        //this.add(grid);
        //grid.setBounds(0, 0, 500, 500);

        //nullLayout.setBounds(0, 0, 500, 500);

        // Configurando Border
        border.setLayout(new BorderLayout(2, 2));
        border.add(botaoBorderNorth, BorderLayout.NORTH);
        border.add(botaoBorderSouth, BorderLayout.SOUTH);
        border.add(botaoBorderCenter, BorderLayout.CENTER);
        border.add(botaoBorderEast, BorderLayout.EAST);
        border.add(botaoBorderWeast, BorderLayout.WEST);

        // Configurando Card
        card.setLayout(new CardLayout(2, 2));
        card.add(botaoCard1);
        card.add(botaoCard2);

        // Configurando Grid
        grid.setLayout(new GridLayout(2, 2));
        grid.add(botaoGrid);
        grid.add(botaoGrid2);
        grid.add(botaoGrid3);
        grid.add(botaoGrid4);

        // Configurando nullLayout
        nullLayout.setLayout(null);
        nullLayout.add(botaoNull);
        botaoNull.setBounds(10, 10, 100, 100);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyLayouts layouts = new MyLayouts();
    }
}