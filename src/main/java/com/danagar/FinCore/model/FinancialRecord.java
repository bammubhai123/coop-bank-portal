package com.danagar.FinCore.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "financial_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "record_date", nullable = false, unique = true)
    private LocalDate recordDate;

    @Column(name = "share_capital", precision = 15, scale = 2)
    private BigDecimal shareCapital;

    @Column(name = "reserves", precision = 15, scale = 2)
    private BigDecimal reserves;

    @Column(name = "deposits", precision = 15, scale = 2)
    private BigDecimal deposits;

    @Column(name = "working_capital", precision = 15, scale = 2)
    private BigDecimal workingCapital;

    @Column(name = "loans_advances", precision = 15, scale = 2)
    private BigDecimal loansAdvances;

    @Column(name = "investments", precision = 15, scale = 2)
    private BigDecimal investments;

    @Column(name = "net_npa_pct", precision = 5, scale = 2)
    private BigDecimal netNpaPct;

    @Column(name = "crar_pct", precision = 5, scale = 2)
    private BigDecimal crarPct;

    @Column(name = "net_profit", precision = 15, scale = 2)
    private BigDecimal netProfit;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}