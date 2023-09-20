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
        this.setTitle("Janela");
        // Para utilizar um dos layouts remova os comentários do set e add respectivos e comente os outros
        // Ao utilizar mais de um layout ocupando a mesma area, prevalece aquele que foi acionado primeiro (Cima pra baixo)
        //this.setLayout(null);
        this.setLayout(new BorderLayout(2, 2));
        //this.setLayout(new GridLayout(2, 2));

        this.add(border);
        //this.add(grid);
        //nullLayout.setBounds(0, 0, 500, 500);

        // Configurando Border
        border.setLayout(new BorderLayout(2, 2));
        border.add(botaoBorderNorth, BorderLayout.NORTH);
        border.add(botaoBorderSouth, BorderLayout.SOUTH);
        border.add(botaoBorderCenter, BorderLayout.CENTER);
        border.add(botaoBorderEast, BorderLayout.EAST);
        border.add(botaoBorderWeast, BorderLayout.WEST);

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