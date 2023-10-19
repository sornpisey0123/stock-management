package ifeature;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class Help {
    public static void help(){
        Table tableShowHelp = new Table(1, BorderStyle.CLASSIC_COMPATIBLE_LIGHT_WIDE, ShownBorders.SURROUND);
        tableShowHelp.addCell("1. \tPress\t * : Display all record of products");
        tableShowHelp.addCell("2. \tPress\t w : Add new product");
        tableShowHelp.addCell("   \tPress\t w   #proName-unitPrice-qty : shortcut to add new product");
        tableShowHelp.addCell("3. \tPress\t r : Read Content any content");
        tableShowHelp.addCell("   \tPress\t r   #proID : shortcut to read product by ID");
        tableShowHelp.addCell("4. \tPress\t u : Update data");
        tableShowHelp.addCell("5. \tPress\t d : Delete data");
        tableShowHelp.addCell("   \tPress\t d   #proID : shortcut to delete product by ID");
        tableShowHelp.addCell("6. \tPress\t f : Display first page");
        tableShowHelp.addCell("7. \tPress\t p : Display previous page");
        tableShowHelp.addCell("8. \tPress\t n : Display next page");
        tableShowHelp.addCell("9. \tPress\t l : Display last page");
        tableShowHelp.addCell("10.\tPress\t s : Search product by name");
        tableShowHelp.addCell("11.\tPress\t h : Help");
        System.out.println(tableShowHelp.render());
    }
}
