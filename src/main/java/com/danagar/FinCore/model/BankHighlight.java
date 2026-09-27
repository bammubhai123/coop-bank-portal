package com.danagar.FinCore.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bank_highlights")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankHighlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "label", length = 100, nullable = false)
    private String label;

    @Column(name = "value", length = 50, nullable = false)
    private String value;

    @Column(name = "unit", length = 30)
    private String unit;

    @Column(name = "display_order", nullable = false)
    @Builder.Default
    private Integer displayOrder = 0;

    @Column(name = "active", nullable = false)
    @Builder.Default
    private Boolean active = true;
}