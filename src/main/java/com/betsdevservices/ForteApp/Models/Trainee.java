package com.betsdevservices.ForteApp.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "trainees")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String genre;

    private int edad;

    private double height;

    private double weight;

    private String objectives;

    private String base64Img;

}
