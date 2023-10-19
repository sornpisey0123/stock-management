import ifeature.*;
import modules.Logo;
import modules.Products;
import modules.Table;
import pagination.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ifeature.Help.help;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logo logo = new Logo();
        logo.logo();
        int currentPage = 1;
        int rowsPerPage = 2;
        List<Products> products = new ArrayList<>(){
            {add(new Products(1,"Sprite",3000.0,150, LocalDate.now())); }
            { add(new Products(2,"Spy",4500.0,50, LocalDate.now())); }
            { add(new Products(3,"Sting",2000.0,50, LocalDate.now()));}
            {add(new Products(4,"Pepsi",2000.0,180, LocalDate.now()));}
            { add(new Products(5,"Vital",1000.0,400, LocalDate.now())); }
            { add(new Products(6,"Colgate",7000.0,8, LocalDate.now()));}
        };

        do {
            Table.table();

            System.out.print("Command ---> ");
            String options = scanner.nextLine();

            switch (options) {
                case "*" -> Display.display(products, currentPage, rowsPerPage);
                case "w", "W" -> Write.write(products);
                case "r", "R" -> Read.read(products);
                case "u", "U" -> Update.update(products);
                case "d", "D" -> Delete.delete(products);
                case "f", "F" -> currentPage = First.first(products, currentPage, rowsPerPage);
                case "n", "N" -> currentPage = Next.next(products, currentPage, rowsPerPage);
                case "p", "P" -> currentPage =  Previous.previous(products, currentPage, rowsPerPage);
                case "l", "L" -> currentPage = Last.last(products, currentPage, rowsPerPage);
                case "g", "G" -> currentPage = Goto.goTo(products, currentPage, rowsPerPage);
                case "s", "S" -> Search.search(products, currentPage, rowsPerPage);
                case "se", "Se","SE","sE" -> rowsPerPage = SetRow.setRow(products, rowsPerPage);
                case "h", "H" -> help();
                case "e", "E" -> {
                    System.out.println("Thank you for using our services");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option!");
            }
        } while (true);
    }
}
