import javax.swing.*;

public class ExemploInterfaceGrafica {
    public static void main(String[] args) {
        // Criação da janela
        JFrame frame = new JFrame("Exemplo de Interface Gráfica");
        frame.setSize(300, 200); // Define o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar

        // Criação do botão
        JButton button = new JButton("Clique Aqui!");
        button.setBounds(50, 50, 200, 50); // Define a posição e tamanho do botão

        // Adiciona um ActionListener para lidar com o clique no botão
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Você clicou no botão!"));

        // Adiciona o botão à janela
        frame.add(button);

        // Define o layout como null para utilizar as coordenadas absolutas
        frame.setLayout(null);

        // Torna a janela visível
        frame.setVisible(true);
    }
}