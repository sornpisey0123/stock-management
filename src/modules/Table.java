package modules;


import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;

public class Table {
    public static void table(){
        org.nocrala.tools.texttablefmt.Table table = new org.nocrala.tools.texttablefmt.Table(9, BorderStyle.UNICODE_BOX_HEAVY_BORDER, ShownBorders.SURROUND);
        table.addCell(" ".repeat(2)+"| *)Display"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| W)rite"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| R)ead"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| U)pdate"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| D)elete"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| F)irst"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| P)revious"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| N)ext"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| L)ast"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| S)earch"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| G)o to"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| Se)t row"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| H)elp"+" ".repeat(2));
        table.addCell(" ".repeat(2)+"| E)xit"+" ".repeat(2));
        System.out.println(table.render());
    }

}
