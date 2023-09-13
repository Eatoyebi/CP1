public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        //Declarations
        int itemPrice;
        double totalPrice;
        double shippingCost;
        double taxPrice;
        System.out.println("Enter item price?");
        itemPrice=222;
        System.out.println("My item price is " + itemPrice);
        shippingCost=.02;
        if (itemPrice >= 100)
        {
            System.out.println("Your shipping cost =0");
            totalPrice = itemPrice;
            System.out.println("Your total price is " + totalPrice);
        }
        else
        {
            taxPrice = shippingCost * itemPrice;
            totalPrice = taxPrice + itemPrice;
            System.out.println("Your shipping price is " + taxPrice);
            System.out.println("The total price is " + totalPrice);
        }


    }
}
