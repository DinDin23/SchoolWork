public class Runner {
    public static void main(String[] args) {
        Monomial first = new Monomial(1.0, 2);
        Monomial second = new Monomial(2.0, 1);
        Monomial third = new Monomial(3.0, 0);
        Polynomial poly = new Polynomial(first, second, third);
        System.out.println(poly.evaluate(4.5));
        System.out.println(poly.toString());
    }
}
class Monomial{
    double coefficient;
    int exponent;

    public Monomial(double coefficient, int exponent){
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
}
class Polynomial{
    Monomial firstTerm;
    Monomial secondTerm;
    Monomial thirdTerm;

    public Polynomial(){
        firstTerm = null;
        secondTerm = null;
        thirdTerm = null;
    }
    public Polynomial(Monomial firstTerm, Monomial secondTerm, Monomial thirdTerm){
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
        this.thirdTerm = thirdTerm;
    }

    public double evaluate(double x){
        double sum = 0;
        sum += (Math.pow(x, firstTerm.exponent) * firstTerm.coefficient);
        sum += (Math.pow(x, secondTerm.exponent) * secondTerm.coefficient);
        sum += thirdTerm.coefficient;
        return sum;
    }
    public String toString(){
        return firstTerm.coefficient + "x^" + firstTerm.exponent + " + " + secondTerm.coefficient + "x + " + thirdTerm.coefficient;
    }
}