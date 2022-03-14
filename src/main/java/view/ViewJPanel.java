package view;

import controller.Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewJPanel extends JPanel implements ActionListener {
    View v=new View();
    Controller controller=new Controller(this);
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    JButton b3=new JButton("*");
    JButton b5=new JButton(" Integrare ");
    JButton b6=new JButton(" Derivare");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JLabel l1=new JLabel(" Polinomul 1:");
    JLabel l2=new JLabel(" Polinomul 2:");
    JLabel l3=new JLabel(" Rezultatul este:");
    JLabel l5=new JLabel("=");

    ViewJPanel(){
        setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b1.setBounds(20,20,60,20);
        b2.setBounds(20,80,60,20);
        b3.setBounds(20,140,60,20);
        b5.setBounds(20,200,100,20);
        b6.setBounds(100,200,100,20);
        l1.setBounds(100,20,350,20);
        t1.setBounds(200,20,300,20);
        l2.setBounds(100,80,350,20);
        t2.setBounds(200,80,300,20);
        l3.setBounds(100,140,350,20);
        t3.setBounds(200,140,300,20);
        l5.setBounds(360,110,20,20);
        b1.setActionCommand("+");
        b1.addActionListener(this.controller);
        b2.setActionCommand("-");
        b2.addActionListener(this.controller);
        b5.setActionCommand("Integrare");
        b5.addActionListener(this.controller);
        b6.setActionCommand("Derivare");
        b6.addActionListener(this.controller);
        b3.setActionCommand("*");
        b3.addActionListener(this.controller);
        add(b1);
        add(b2);
        add(b3);
        add(b5);
        add(b6);
        add(t1);
        add(t2);
        add(t3);
        add(l1);
        add(l2);
        add(l3);
        add(l5);
    }


    public JTextField getT3() {
        return t3;
    }
    public JTextField getPolinom1(){
        return  t1;
    }
    public JTextField getPolinom2(){
        return t2;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
