package net.javaguides.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")

public class Search {
    @Id
    private long id;
    private String name;
    private String description;
    private String details;
    private long price;
    private String imageurl;
//    private long id;
//    private String name;
//    private String description;
//    private String imageurl;
//    @CreationTimestamp
//    private LocalDateTime dateCreated;
//    @UpdateTimestamp
//    private LocalDateTime dateUpdated;
}
