
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
       // String pass = "log In";
       // String name = "Please,Enter Your Name?";
       // int ok;
        String my = System.getProperty("user.name");
        JOptionPane.showMessageDialog(calculator, "Welcome " + my);
        calculator.setVisible(true);
//        while (true) {
//            String user = JOptionPane.showInputDialog(null, name, pass, JOptionPane.PLAIN_MESSAGE);
//            ok = JOptionPane.OK_OPTION;
//            int cancel = JOptionPane.CANCEL_OPTION;
//            if (user != null) {
//                if (ok == JOptionPane.OK_OPTION) {
//                    if (user.length() > 0) {
//                        JOptionPane.showMessageDialog(calculator, "Welcome " + user);
//                        calculator.setVisible(true);
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(calculator, "Wrong Name", "Warning", JOptionPane.INFORMATION_MESSAGE);
//
//                    }
//                }
//            } else {
//                System.exit(0);
//            }
//        }
    }

}
