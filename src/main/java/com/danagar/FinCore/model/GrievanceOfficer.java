package com.danagar.FinCore.model;

import com.danagar.FinCore.model.Enums.OfficerLevel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "grievance_officers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GrievanceOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "designation", length = 150, nullable = false)
    private String designation;

    @Enumerated(EnumType.STRING)
    @Column(name = "level", nullable = false)
    private OfficerLevel level;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "display_order", nullable = false)
    @Builder.Default
    private Integer displayOrder = 0;
}
