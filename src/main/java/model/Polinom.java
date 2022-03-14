package model;

import java.util.*;

public class Polinom {
    private ArrayList<Monom> polinom = new ArrayList<>();
    public ArrayList<Monom> getPolinom() {
        return polinom;
    }
    public void add( Monom a )
    {
        polinom.add( a );
    }
    public Polinom constr(String inputP) {


        inputP = inputP.replaceAll("\\s+", "");
        inputP = inputP.replaceAll("-", "+-");
        Polinom rez=new Polinom();
        int coefff=0;
        int exponent=0;

        List<String> termeni = new ArrayList<>(Arrays.asList(inputP.split("\\+"))); // impartire dupa +
        termeni.removeAll(Arrays.asList("",null));

        for (String i : termeni)
        {

            if (i.matches("[+-]?\\d+"))
            { // constanta
                coefff = Integer.parseInt(i);
                exponent = 0;

            }
            else if (i.matches("[+-]?\\d*x"))
            { // gradul 1
                i = i.replace("x", "");
                exponent = 1;
                if (i.isEmpty())
                    coefff = 1;
                else
                    coefff = Integer.parseInt(i);


            }
            else if (i.matches("[+-]?\\d*x\\^\\d+"))
            { //termeni cu grad >1

                String[] exp = i.split("x\\^");
                exponent = Integer.parseInt(exp[1]);
                if (exp[0].equals("-"))
                    coefff = -1;
                else if (exp[0].isEmpty())
                    coefff = 1;
                else
                    coefff = Integer.parseInt(exp[0]);

            }


            Monom monomial = new Monom(coefff, exponent);
            rez.add(monomial);
        }

      return rez;
    }

    @Override
    public String toString() {
        String p = "";

        int index = 0;
        while(index <= this.getPolinom().size() - 1) {
            Monom m = this.getPolinom().get(index);
            if(m.getCoef()!=0) {
                if (index != 0) {
                    if (m.getCoef() > 0)
                        p += "+";
                }
                if (m.getGrad() > 1) {
                    if (m.getCoef() != 1)
                        p += m.getCoef() + "x^" + m.getGrad();
                    else
                        p += "x^" + m.getGrad();
                } else if (m.getGrad() == 1)
                    p += m.getCoef() + "x";
                else if (m.getGrad() == 0)
                    p += m.getCoef();
            }
                index++;
            }

        return p;
    }


}
