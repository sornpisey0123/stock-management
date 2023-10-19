package pagination;

import modules.Products;

import java.util.List;

import static ifeature.Display.display;

public class Next {
    public static int next(List<Products> products, int currentPage, int rowsPerPage) {
        int totalPages = (int) Math.ceil((double) products.size() / rowsPerPage);
        if (currentPage < totalPages) {
            currentPage++;
            display(products, currentPage, rowsPerPage);
        } else {
            System.out.println("You are already on the last page.");
        }
        return currentPage;
    }
}
