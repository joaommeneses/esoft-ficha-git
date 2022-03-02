import javax.swing.*;

public class Experimental extends JFrame {
    private JLabel lblMensagem;
    private JPanel panel1;

    public Experimental(){
        setContentPane(panel1);
        pack();
    }

    public static void main(String[] args) {
        new Experimental().setVisible(true);
    }
}
