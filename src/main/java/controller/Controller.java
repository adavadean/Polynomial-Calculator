package controller;
import model.Polinom;
import model.Op;
import view.ViewJPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public  class Controller implements ActionListener{
    public Polinom a = new Polinom();
    public Polinom b = new Polinom();
    private final Op operatii=new Op();
    private final ViewJPanel pol;

    public Controller(ViewJPanel pol)
    {
        this.pol=pol;
    }


     public void actionPerformed(ActionEvent e) {

         String cmmd = e.getActionCommand();


         try {
             JTextField polinom1 = this.pol.getPolinom1();
             JTextField polinom2 = this.pol.getPolinom2();
             a = a.constr(polinom1.getText());
             b = b.constr(polinom2.getText());
         } catch (Exception ex) {
             ex.printStackTrace();
         }
         if (Objects.equals(cmmd, "+")) {

             Polinom sum = operatii.add(a, b);
             if (sum.toString().isEmpty())
                 pol.getT3().setText("0");
             else
                 pol.getT3().setText(sum.toString());
         }
         else if (Objects.equals(cmmd, "-")) {

             Polinom sub = operatii.sub(a, b);
             if (sub.toString().isEmpty())
                 pol.getT3().setText("0");
             else
                 pol.getT3().setText(sub.toString());
         }
         else  if (Objects.equals(cmmd, "Derivare")) {

             Polinom der = operatii.derivare(a);
             if (der.toString().isEmpty())
                 pol.getT3().setText("0");
             else
                 pol.getT3().setText(der.toString());
         }
         else  if (Objects.equals(cmmd, "Integrare")) {

             Polinom integrare = operatii.integrare(a);
             if (integrare.toString().isEmpty())
                 pol.getT3().setText("0");
             else
                 pol.getT3().setText(integrare.toString());
         }
         else  if (Objects.equals(cmmd, "*")) {

             Polinom prod = operatii.produs(a,b);
             if (prod.toString().isEmpty())
                 pol.getT3().setText("0");
             else
                 pol.getT3().setText(prod.toString());
         }

     }
}


