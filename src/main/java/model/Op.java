package model;
public class Op {

    public static Polinom add(Polinom a, Polinom b)
    {
        Polinom sum = new Polinom();
        int maxGrade = 0;
        if(a.getPolinom().get(0).getGrad() > b.getPolinom().get(0).getGrad())
            maxGrade = a.getPolinom().get(0).getGrad();
        else
            maxGrade = b.getPolinom().get(0).getGrad();

        while(maxGrade >= 0)
        {
            int sumCoef = 0;
            for(Monom i : a.getPolinom())
                if(i.getGrad() == maxGrade)
                    sumCoef += i.getCoef();
            for(Monom i : b.getPolinom())
                if(i.getGrad() == maxGrade)
                    sumCoef += i.getCoef();
            sum.add(new Monom(sumCoef, maxGrade));

            maxGrade -= 1;
        }


        return sum;
    }

    public static Polinom sub(Polinom a, Polinom b)
    {
        Polinom sum = new Polinom();
        int maxGrade = 0;
        if(a.getPolinom().get(0).getGrad() > b.getPolinom().get(0).getGrad())
            maxGrade = a.getPolinom().get(0).getGrad();
        else
            maxGrade = b.getPolinom().get(0).getGrad();

        while(maxGrade >= 0)
        {
            int sumCoef = 0;
            for(Monom i : a.getPolinom())
                if(i.getGrad() == maxGrade)
                    sumCoef += i.getCoef();
            for(Monom i : b.getPolinom())
                if(i.getGrad() == maxGrade)
                    sumCoef -= i.getCoef();
            sum.add(new Monom(sumCoef, maxGrade));

            maxGrade -= 1;
        }


        return sum;
    }

    public static Polinom derivare( Polinom a )
    {

        Polinom der = new Polinom( );

        for( Monom m : a.getPolinom() )
        {
            m.setCoef( m.getCoef() * m.getGrad() );
            m.setGrad( m.getGrad() - 1 );

            der.add( m );
        }
        return der;
    }
    public static Polinom integrare( Polinom a )
    {

        Polinom inte = new Polinom( );

        for( Monom m1 : a.getPolinom() )
        {
            m1.setCoef( m1.getCoef()/ (m1.getGrad()+1));
            m1.setGrad( m1.getGrad() +1 );

           inte.add( m1 );
        }
        return inte;
    }
    public static Polinom produs( Polinom a,Polinom b )
    {

        Polinom inmul = new Polinom( );
        Monom m5;

        for( Monom k : a.getPolinom() )
        {
            for( Monom l : b.getPolinom() )
            {
                m5= new Monom( k.getCoef() * l.getCoef(),k.getGrad() + l.getGrad() ) ;
                inmul.add( m5);
            }
        }
        return inmul;
    }
}