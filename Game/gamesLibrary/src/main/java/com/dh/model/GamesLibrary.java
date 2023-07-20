package com.dh.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class GamesLibrary {
    @Id
    private Integer id;
    private String name;
    private String classification;
    private String developer;
    private String distributor;
}
