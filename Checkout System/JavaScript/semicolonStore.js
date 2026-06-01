const prompt = require("prompt-sync")()
    
    let customerName = prompt("Enter Customer's Name: ");
    
    let addMoreItems = "yes";
    
    const items = []
    const quantities = []
    const prices = []
                                                //SHOOPING LOOP
    while (addMoreItems.toLowerCase()==="yes"){
    
        items.push(prompt("what did the customer buy? "));
        
        quantities.push(prompt("How many Pieces? "));
 
        prices.push(prompt("How much per unit? "));
 
        addMoreItems = prompt("Add more items? (Yes/No) ");
    
    }
    
    let cashiersName = prompt("Enter cashier's Name: ")
    
    let discountPercent = prompt("How much Discount will Customer get (in %)? ");
    
    //CALCULATIONS
    
    let subTotal = 0;
    
    for(count = 0; count < items.length; count = count + 1){
        
        subTotal += quantities[count] * prices[count];
    }
    
    // CALCULATE THE TAX AND DISCOUNT 
    let discountAmount = subTotal * (discountPercent / 100);
    let vat = subTotal * 0.175;
    let billTotal = (subTotal - discountAmount) + vat;
    
    //PRINTING INVOICE
   console.log("\n--- RECEIPT ---");
   console.log("Customer:" + customerName);
   console.log("Cashier:" + cashiersName);
   console.log("SubTotal:" + subTotal);
   console.log("Discount:" + discountAmount);
   console.log("Vat @ 17.5%:" + vat);
   console.log("BillTotal:" + billTotal);

    let amountPaid = prompt("\nHow much did Customer pay? ");
    let balance = amountPaid - billTotal;
    
   console.log("Balance:" + balance);
   console.log("THANK YOU FOR YOUR PATRONAGE");
 
 

