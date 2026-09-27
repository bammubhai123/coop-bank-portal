package com.danagar.FinCore.model;

import com.danagar.FinCore.model.Enums.ChargeType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "service_charges")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceCharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name", length = 150, nullable = false)
    private String serviceName;

    @Column(name = "charge_description", length = 300)
    private String chargeDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "charge_type", nullable = false)
    @Builder.Default
    private ChargeType chargeType = ChargeType.FLAT;

    @Column(name = "charge_value", precision = 10, scale = 2, nullable = false)
    private BigDecimal chargeValue;

    @Column(name = "active", nullable = false)
    @Builder.Default
    private Boolean active = true;

    @UpdateTimestamp
    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;
}
