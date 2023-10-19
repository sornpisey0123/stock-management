package modules;


import java.time.LocalDate;
import java.util.Objects;

public class Products {
    private Integer id;
    private String name;
    private Double price;
    private Integer qty;
    private LocalDate importedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public LocalDate getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(LocalDate importedDate) {
        this.importedDate = importedDate;
    }

    public Products(Integer id, String name, Double price, Integer qty, LocalDate importedDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.importedDate = importedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products products)) return false;
        return Objects.equals(getId(), products.getId()) && Objects.equals(getName(), products.getName()) && Objects.equals(getPrice(), products.getPrice()) && Objects.equals(getQty(), products.getQty()) && Objects.equals(getImportedDate(), products.getImportedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getQty(), getImportedDate());
    }
}
