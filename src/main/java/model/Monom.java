package model;

public class Monom {
    private int grad;
    private double coef;
    public Monom(double coef, int grad) {
        this.grad = grad;
        this.coef = coef;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    @Override
    public String toString() {
        return "Monom{" +
                "grad=" + grad +
                " coeficient=" + coef +
                '}';
    }

}



