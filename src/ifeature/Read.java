package ifeature;

import modules.Products;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Read {
    public static void read(List<Products> products) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        try {
            System.out.print("Read by ID : ");
            Integer productID = Integer.parseInt(scanner.nextLine());
            for (Products product : products) {
                if (product.getId().equals(productID)) {
                    Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                    table.addCell(" ID            : "+productID+" ".repeat(10));
                    table.addCell(" Name          : "+product.getName()+" ".repeat(10));
                    table.addCell(" Unit price    : "+product.getPrice()+" ".repeat(10));
                    table.addCell(" Qty           : "+product.getQty()+" ".repeat(10));
                    table.addCell(" Imported Date : "+ LocalDate.now()+" ".repeat(10));
                    System.out.println(table.render());
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("~".repeat(30));
                System.out.println("\tID : "+productID+" is not found!");
                System.out.println("~".repeat(30));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
