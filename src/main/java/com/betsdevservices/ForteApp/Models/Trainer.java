package com.betsdevservices.ForteApp.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "trainers")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lname;
    private String phone;
    @Column(unique = true)
    private String email;
    private String pass;
    @Column(columnDefinition = "TEXT")
    private String base64Image;

    private boolean isActivate;


}
