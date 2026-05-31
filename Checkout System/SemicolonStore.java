import java.util.Scanner;
import java.util.ArrayList;

public class SemicolonStore{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    ArrayList<String> items = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    
    System.out.println("Enter Customer's Name");
    String customerName = input.nextLine();
    
    String addMoreItems = "yes";
                                                //SHOOPING LOOP
    while (addMoreItems.equalsIgnoreCase("yes")){
    System.out.println("What did the Customer buy?");
    items.add(input.nextLine());
    
    System.out.println("How many Pieces?");
    quantities.add(input.nextInt());
    input.nextLine();                       
    
    System.out.println("How much per unit?");
    prices.add(input.nextDouble());
    input.nextLine();
    
    System.out.println("Add more items? (Yes/No)");
    addMoreItems = input.nextLine();
    
    }
    System.out.println("Enter cashier's Name:");
    String cashiersName = input.nextLine();
    
    System.out.println("How much Discount will Customer get (in %)? ");
    double discountPercent = input.nextDouble();
    
    //CALCULATIONS
    
    double subTotal = 0;
    
    for(int count = 0; count < items.size(); count = count + 1){
        subTotal += quantities.get(count) * prices.get(count);
    }
    
    // CALCULATE THE TAX AND DISCOUNT 
    double discountAmount = subTotal * (discountPercent / 100);
    double vat = subTotal * 0.175;
    double billTotal = (subTotal - discountAmount) + vat;
    
    //PRINTING INVOICE
    System.out.println("\n--- RECEIPT ---");
    System.out.println("Customer:" + customerName);
    System.out.println("Cashier:" + cashiersName);
    System.out.println("SubTotal:" + subTotal);
    System.out.println("Discount:" + discountAmount);
    System.out.println("Vat @ 17.5%:" + vat);
    System.out.println("BillTotal:" + billTotal);
    
    System.out.println("\nHow much did Customer pay?");
    double amountPaid = input.nextDouble();
    double balance = amountPaid - billTotal;
    
    System.out.println("Balance:" + balance);
    System.out.println("THANK YOU FOR YOUR PATRONAGE");
 
    }
}
