package Homework.Branching.If_Else;

public class Money500k {
    public static void main(String[] args) {
        double moneyArea = 152*65;
        double floorArea = 12*80*1000*1000;
        double floors = 72;

        System.out.println("Number of 500k money: " + Math.ceil(floorArea*floors/moneyArea));
        System.out.println("Total money: " + Math.ceil(floorArea*floors/moneyArea) * 500000);
    }
}
