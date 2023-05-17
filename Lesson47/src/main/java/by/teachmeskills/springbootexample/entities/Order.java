package by.teachmeskills.springbootexample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Table(name = "orders")
@Entity
public class Order extends BaseEntity {
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DATE")
    private LocalDateTime date;
    @ManyToOne
    private User user;
}
