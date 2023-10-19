package pagination;

import modules.Products;

import java.util.List;

import static ifeature.Display.display;

public class First {
    public static int first(List<Products> products, int currentPage, int rowsPerPage) {
        if (currentPage == 1) {
            System.out.println("You are already on the first page.");
        } else {
            currentPage = 1;
            display(products, currentPage, rowsPerPage);
        }
        return currentPage;
    }

}
