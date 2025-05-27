package com.lesson;

public class DiscountCalculator {
    public enum MembershipLevel {
        GOLD(0.20),
        SILVER(0.15),
        BRONZE(0.10);

        private final double discount;

        MembershipLevel(double discount) {
            this.discount = discount;
        }

        public double getDiscount() {
            return discount;
        }
    }

    public double calculateDiscount(String membershipLevel) {
        try {
            return MembershipLevel.valueOf(membershipLevel).getDiscount();
        } catch (IllegalArgumentException e) {
            return 0.0; // Default discount for invalid membership levels
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Discount for GOLD: " + calculator.calculateDiscount("GOLD"));
        System.out.println("Discount for SILVER: " + calculator.calculateDiscount("SILVER"));
        System.out.println("Discount for BRONZE: " + calculator.calculateDiscount("BRONZE"));
        System.out.println("Discount for UNKNOWN: " + calculator.calculateDiscount("UNKNOWN"));
    }
}
