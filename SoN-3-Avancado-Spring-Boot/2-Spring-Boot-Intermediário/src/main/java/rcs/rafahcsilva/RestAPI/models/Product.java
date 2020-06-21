package rcs.rafahcsilva.RestAPI.models;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "Name can't be empty")
    @Length(min = 4, max = 255)
    private String name;

    @Column
    @Min(value = 0)
    @Max(value = 1000)
    private Integer quantity;

    @Column
    private Date dateCreated;

    public Product() {
    }

    public Product(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", quantity=" + this.quantity +
                ", dateCreated=" + this.dateCreated +
                '}';
    }
}
