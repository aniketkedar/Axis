

import java.util.*;

 public class RetailShop implements Retail {
    public double getTotalcost(double tax, double cost, int number) {
       return cost + cost * tax / 100;
    }
 
    public double getTotalextendedcost(double cosmetics, double perfume, double clothes) {
       return cosmetics + perfume + clothes;
    }
 
    public double getTotalDiscount(double totalcost) {
       return totalcost * 0.02;
    }
 
    public static void main(String[] args) {
       RetailShop shop = new RetailShop();
       double cosmeticsCost = 10000;
       double perfumeCost = 5000;
       double clothesCost = 7000;
       int cosmeticsQty = 3;
       int perfumeQty = 2;
       int clothesQty = 1;
       double cosmeticsTax = 7;
       double perfumeTax = 12;
       double clothesTax = 4;
       double cosmeticsTotal = shop.getTotalcost(cosmeticsTax, cosmeticsCost, cosmeticsQty);
       double perfumeTotal = shop.getTotalcost(perfumeTax, perfumeCost, perfumeQty);
       double clothesTotal = shop.getTotalcost(clothesTax, clothesCost, clothesQty);
       double totalExtendedCost = shop.getTotalextendedcost(cosmeticsTotal, perfumeTotal, clothesTotal);
       double totalDiscount = shop.getTotalDiscount(totalExtendedCost);
       double totalCost = totalExtendedCost - totalDiscount;
       System.out.println("Total cost: " + totalCost);
    }
 }
 