package com.danagar.FinCore.model;

public class Enums {

    public enum AdminRole {
        SUPER_ADMIN,
        EDITOR
    }

    public enum ProductCategory {
        DEPOSIT,
        LOAN,
        SERVICE
    }

    public enum RateCategory {
        DEPOSIT,
        LOAN,
        SAVINGS
    }

    public enum ChargeType {
        FLAT,
        PERCENT
    }

    public enum TimelineType {
        ACHIEVEMENT,
        MILESTONE
    }

    public enum NoticeType {
        NOTICE,
        NEWS,
        RECRUITMENT
    }

    public enum DownloadCategory {
        MORTGAGE,
        AUDIT,
        OMBUDSMAN,
        DEAF_LIST,
        RECRUITMENT,
        GENERAL
    }

    public enum OfficerLevel {
        PRINCIPAL_NODAL,
        NODAL
    }

    public enum MessageStatus {
        NEW,
        READ,
        RESOLVED
    }
}