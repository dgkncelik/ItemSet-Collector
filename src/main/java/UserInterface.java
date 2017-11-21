import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
    private JPanel panel1;
    private JButton araButton;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;


    public UserInterface() {
        araButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(){
        JFrame frame = new JFrame();
        JLabel l123 = new JLabel();

        JPanel t = new UserInterface().panel1;
        l123.setText("sdfsdfsdfsdf");
        l123.setVisible(true);

//        t.add(l123);
        frame.setContentPane(t);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public void show(){

    }
}
