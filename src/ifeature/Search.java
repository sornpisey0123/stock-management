package ifeature;

import modules.Products;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void search(List<Products> products, int currentPage, int rowsPerPage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search product by keyword: ");
        String searchKeyword = scanner.nextLine().toLowerCase();

        List<Products> matchingProducts = new ArrayList<>();

        for (Products product : products) {
            String productName = product.getName().toLowerCase();

            if (productName.contains(searchKeyword)) {
                matchingProducts.add(product);
            }
        }

        int totalPages = (int) Math.ceil((double) matchingProducts.size() / rowsPerPage);
        if (matchingProducts.isEmpty()) {
            System.out.println("No products found containing the keyword '" + searchKeyword + "'.");
        } else {
            if (currentPage < 1) {
                currentPage = 1;
            } else if (currentPage > totalPages) {
                currentPage = totalPages;
            }

            int startIndex = (currentPage - 1) * rowsPerPage;
            int endIndex = Math.min(startIndex + rowsPerPage, matchingProducts.size());

            Table tableDisplay = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
            tableDisplay.addCell(" ".repeat(2) + "ID" + " ".repeat(2));
            tableDisplay.addCell(" ".repeat(2) + "Name" + " ".repeat(2));
            tableDisplay.addCell(" ".repeat(2) + "Unit Price" + " ".repeat(2));
            tableDisplay.addCell(" ".repeat(2) + "Qty" + " ".repeat(2));
            tableDisplay.addCell(" ".repeat(2) + "Imported Date" + " ".repeat(2));

            for (int i = startIndex; i < endIndex; i++) {
                Products product = matchingProducts.get(i);
                tableDisplay.addCell(" ".repeat(2) + product.getId().toString());
                tableDisplay.addCell(" ".repeat(2) + product.getName());
                tableDisplay.addCell(" ".repeat(2) + product.getPrice().toString());
                tableDisplay.addCell(" ".repeat(2) + product.getQty().toString());
                tableDisplay.addCell(" ".repeat(2) + product.getImportedDate().toString());
            }

            System.out.println(tableDisplay.render());
            System.out.println("~ ".repeat(60));

            System.out.println("Page " + currentPage + " of " + totalPages + " ".repeat(40) + "Total matching products: " + matchingProducts.size());
            System.out.println("~ ".repeat(60));
        }
    }
}