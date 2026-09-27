package com.danagar.FinCore.model;

import com.danagar.FinCore.model.Enums.RateCategory;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "interest_rates",
        indexes = @Index(name = "idx_rates_category", columnList = "category, active")
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InterestRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private RateCategory category;

    @Column(name = "scheme_name", length = 150, nullable = false)
    private String schemeName;

    @Column(name = "tenure_or_slab", length = 100)
    private String tenureOrSlab;

    @Column(name = "rate_percent", precision = 5, scale = 2, nullable = false)
    private BigDecimal ratePercent;

    @Column(name = "effective_from", nullable = false)
    private LocalDate effectiveFrom;

    @Column(name = "active", nullable = false)
    @Builder.Default
    private Boolean active = true;

    @UpdateTimestamp
    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;
}