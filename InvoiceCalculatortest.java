package com.example.invoice;

public class InvoiceCalculatortest {

    public double calculateProductAmount(double price, int quantity) {
        return price * quantity;
    }

    public double calculateDiscount(double amount) {
        if (amount >= 5000) {
            return amount * 0.10;
        } else if (amount >= 3000) {
            return amount * 0.05;
        } else {
            return 0;
        }
    }

    public double calculateGST(double amount) {
        return amount * 0.18;
    }

    public double calculateFinalAmount(double amount) {
        double discount = calculateDiscount(amount);
        double amountAfterDiscount = amount - discount;
        double gst = calculateGST(amountAfterDiscount);

        return amountAfterDiscount + gst;
    }
}
