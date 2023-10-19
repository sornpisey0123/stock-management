package ifeature;

import modules.Products;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Write {
    public static void write(List<Products> products){
        Products lastProduct = products.get(products.size() - 1);
        Integer productID = lastProduct.getId()+1;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Product ID : "+productID);
            System.out.print("Product name : ");
            String productName = scanner.nextLine();
            System.out.print("Product Price : ");
            Double productPrice = Double.parseDouble(scanner.nextLine());
            System.out.print("Product Quantity : ");
            Integer productQty = Integer.parseInt(scanner.nextLine());

            Products product = new Products(productID, productName, productPrice, productQty, LocalDate.now());
            products.add(product);

            do {
                Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                table.addCell(" ID            : "+productID+" ".repeat(10));
                table.addCell(" Name          : "+productName+" ".repeat(10));
                table.addCell(" Unit price    : "+productPrice+" ".repeat(10));
                table.addCell(" Qty           : "+productQty+" ".repeat(10));
                table.addCell(" Imported Date : "+LocalDate.now()+" ".repeat(10));
                System.out.println(table.render());
                System.out.print( "Are you sure to add this record? [Y/y] or [N/n] : ");
                String options = scanner.nextLine();
                switch (options) {
                    case "y","Y" -> {
                        System.out.println("~".repeat(50));
                        System.out.println("Product added successfully.");
                        System.out.println("~".repeat(50));
                        return;
                    }
                    case "n","N" -> {
                        products.remove(product);
                        System.out.println("Product is not added");
                        return;
                    }
                    default -> System.out.println("Invalid options.");
                }
            }while (true);
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

}