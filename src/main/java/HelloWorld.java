import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(){
        panel1 = new JPanel();
        JLabel lblAdicional = new JLabel();
        lblAdicional.setText("O João Santos esteve aqui!");
        panel1.add(lblAdicional);
        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}
