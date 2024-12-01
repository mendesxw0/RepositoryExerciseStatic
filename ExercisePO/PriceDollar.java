package OOP.ExercisePO;

public class PriceDollar {

    private double priceDolar;
    private double valueDolarUser;

    public static double IOF = 0.06;

    public double getPriceDolar() {
        return priceDolar;
    }

    public double getValueUser() {
        return valueDolarUser;
    }

    public static double calcularPriceDollar(double taxa, double valueDolar) {
        double result = taxa * valueDolar * (1 + IOF);
        return result;

    }

}