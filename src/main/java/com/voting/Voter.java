package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String checkEligibility() {
        if (age < 18) {
            return "Ineligible: Underage (Must be at least 18 years old).";
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            return "Ineligible: Not an Indian citizen.";
        }
        if (voterId == null || voterId.trim().isEmpty() || !isIdValid) {
            return "Ineligible: Does not possess a valid Voter ID.";
        }
        return "Eligible: Criteria met successfully.";
    }

    public String getName() { return name; }
}
