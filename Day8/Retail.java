

public interface Retail {
    double getTotalcost(double tax, double cost, int number);
    double getTotalextendedcost(double cosmetics, double perfume, double clothes);
    double getTotalDiscount(double totalcost);
 }