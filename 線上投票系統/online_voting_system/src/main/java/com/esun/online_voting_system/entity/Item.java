package com.esun.online_voting_system.entity;

import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item_Id")
    private long id;

    @Column(name = "itemName", nullable = false)
    private String itemName;

}
