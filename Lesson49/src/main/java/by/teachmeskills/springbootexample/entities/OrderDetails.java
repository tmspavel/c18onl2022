package by.teachmeskills.springbootexample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Table(name = "order_details")
@Entity
public class OrderDetails {
    @EmbeddedId
    @JsonIgnore
    private OrderDetailsId orderDetailsId;

    @Column(nullable = false)
    private Integer quantity;
}
