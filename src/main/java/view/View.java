package view;
import javax.swing.*;
public class View {


    public static void main(String []args){
        ViewJFrame R=new ViewJFrame();
        R.setTitle(" Calculator polinomial ");
    }
}
class ViewJFrame extends JFrame {

    ViewJPanel P=new ViewJPanel();
    ViewJFrame(){
        setDefaultCloseOperation(ViewJFrame.EXIT_ON_CLOSE);
        setSize(700,300);
        setLocationRelativeTo(null);
        setResizable(false);
        add(P);
        setVisible(true);
    }
}

