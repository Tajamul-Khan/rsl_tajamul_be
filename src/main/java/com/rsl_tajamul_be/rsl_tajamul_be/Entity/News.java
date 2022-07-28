package com.rsl_tajamul_be.rsl_tajamul_be.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String newsTitle;

    @Column
    private String newsDescription;

    @Column
    private String newsDetails;

    @Column
    private Integer categoryId;


    private Integer locationId;
}
