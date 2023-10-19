package pagination;

import modules.Products;

import java.util.List;
import java.util.Scanner;

import static ifeature.Display.display;

public class Goto {
    public static int goTo(List<Products> products, int currentPage, int rowsPerPage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the page number you want to go to: ");

        int targetPage = scanner.nextInt();
        int totalPages = (int) Math.ceil((double) products.size() / rowsPerPage);

        if (targetPage >= 1 && targetPage <= totalPages) {
            currentPage = targetPage;
            display(products, currentPage, rowsPerPage);
        } else {
            System.out.println("Invalid page number. Please enter a page number between 1 and " + totalPages + ".");
        }
        return currentPage;
    }
}
