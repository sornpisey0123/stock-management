package ifeature;



import modules.Products;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class Display {
    public static void display(List<Products> products, int currentPage, int rowsPerPage) {
        int startIndex = (currentPage - 1) * rowsPerPage;
        int endIndex = Math.min(startIndex + rowsPerPage, products.size());

        Table tableDisplay = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
        tableDisplay.addCell(" ".repeat(2) + "ID" + " ".repeat(2));
        tableDisplay.addCell(" ".repeat(2) + "Name" + " ".repeat(2));
        tableDisplay.addCell(" ".repeat(2) + "Unit Price" + " ".repeat(2));
        tableDisplay.addCell(" ".repeat(2) + "Qty" + " ".repeat(2));
        tableDisplay.addCell(" ".repeat(2) + "Imported Date" + " ".repeat(2));

        for (int i = startIndex; i < endIndex; i++) {
            Products product = products.get(i);
            tableDisplay.addCell(" ".repeat(2) + product.getId().toString());
            tableDisplay.addCell(" ".repeat(2) + product.getName());
            tableDisplay.addCell(" ".repeat(2) + product.getPrice().toString());
            tableDisplay.addCell(" ".repeat(2) + product.getQty().toString());
            tableDisplay.addCell(" ".repeat(2) + product.getImportedDate().toString());
        }

        System.out.println(tableDisplay.render());
        System.out.println("~".repeat(70));
        int totalPages = (int) Math.ceil((double) products.size() / rowsPerPage);
        System.out.println("Page " + currentPage + " of " + totalPages + " ".repeat(40) + "Total records : " + products.size());
        System.out.println("~".repeat(70));
    }
}
