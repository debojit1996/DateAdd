package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Date inputDate = new Date(2025, 12, 31);
        int daysToAdd = 366;
        System.out.println("Input Date is: " + inputDate + " and days to add is: " + daysToAdd);
        System.out.println("Calculated Date is: " + inputDate.addDaysToDate(daysToAdd));
    }
}