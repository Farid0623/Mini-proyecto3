package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {
    private Long id;
    private String type;
    private String brand;
    private String model;
    private String name;
    private Category category;
    private int price;
    private String available;

    public Product(Long id, String typeC, String type, String brand, String model, String name, int price, String available) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.name = name;
        Category category = new Category();
        category.setName(typeC);
        this.category = category;
        this.price = price;
        this.available = available;
    }
}
