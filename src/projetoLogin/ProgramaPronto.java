package projetoLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramaPronto extends JFrame implements ActionListener {
    // Login
    JLabel labelLogin = new JLabel("Login");
    JTextField login = new JTextField();

    // Senha
    JLabel labelSenha = new JLabel("Senha");
    JPasswordField senha = new JPasswordField();

    // Botões
    JButton logar = new JButton("Login");
    JButton sair = new JButton("Sair");

    public ProgramaPronto(){
        this.setBounds(0, 0, 300, 300);
        // A escolha do grid foi feita pois este adiciona os elementos de forma organizada com base na ordem de adição,
        // como estamos adicionando 6 elementos, o grid 3x2 é o mais adequado
        this.setLayout(new GridLayout(3, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login");

        // 1 linha
        this.add(labelLogin);
        this.add(login);

        // 2 linha
        this.add(labelSenha);
        this.add(senha);

        // 3 linha
        this.add(sair);
        this.add(logar);

        logar.addActionListener(this);
        sair.addActionListener(this);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(logar)){
            // A verificação abaixo não foi explicada em aula e nem no material, estou a utilizando para fins de mostrar
            // um if dentro de ações
            if (login.getText().equals("Plantao")  && new String(senha.getPassword()).equals("123")) { // O JPassowordField retorna um array de char, por isso a conversão para String
                System.out.println("Bem vindo ao sistema");
            }else {
                System.out.println("Usuário ou senha incorretos");
            }
        }else if(obj.equals(sair)){
            System.out.println("Fechando o programa");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        ProgramaPronto programa = new ProgramaPronto();
    }
}
