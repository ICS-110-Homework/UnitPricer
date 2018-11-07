/** UnitPricer.java calculates the unit prices of two different items, given their prices and units.
 *  @author Phillip Turner
 *  @version for Alice+Java, Alice 3 edition
 */

import java.util.Scanner;

public class UnitPricer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the price of the first item: "+"\n");
        System.out.print("Price:");
        double price1 = keyboard.nextDouble();
        System.out.print("How many units are in the first item?" + "\n");
        System.out.print("Units: ");
        double units1 = keyboard.nextDouble();
        
        System.out.print("Enter the price of the second item: "+"\n");
        System.out.print("Price:");
        double price2 = keyboard.nextDouble();
        System.out.print("How many units are in the second item?" + "\n");
        System.out.print("Units: ");
        double units2 = keyboard.nextDouble();
        
        double unitPrice1 = price1/units1;
        double unitPrice2 = price2/units2;
        
        System.out.printf("%nItem 1 unit price: $%7.2f", unitPrice1);
        System.out.printf("%nItem 2 unit price: $%7.2f", unitPrice2);
    }
}
