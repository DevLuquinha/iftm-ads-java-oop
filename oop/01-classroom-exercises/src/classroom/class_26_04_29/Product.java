package classroom.class_26_04_29;

import java.time.LocalDateTime;

public class Product implements Cloneable {
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(int id, String name, String description, double price, boolean active, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.active = active;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public Product clone() throws CloneNotSupportedException{
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Product:");
        s.append("\n- id: ").append(id);
        s.append("\n- name: '").append(name).append('\'');
        s.append("\n- description: ").append(description).append('\'');
        s.append("\n- price: ").append(price);
        s.append("\n- active: ").append(active);
        s.append("\n- createdAt: ").append(createdAt);
        s.append("\n- updatedAt: ").append(updatedAt);

        return s.toString();
    }
}
