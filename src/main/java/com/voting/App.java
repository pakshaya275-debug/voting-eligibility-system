package com.voting;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      AUTOMATED VOTING ELIGIBILITY SYSTEM         ");
        System.out.println("==================================================");
        
        List<Voter> pipelineTestData = new ArrayList<>();
        pipelineTestData.add(new Voter("Akshaya P", 22, "Indian", "VOT12345", true));
        pipelineTestData.add(new Voter("Neha Sharma", 16, "Indian", "VOT67890", true));
        pipelineTestData.add(new Voter("John Doe", 30, "American", "VOT11223", true));
        pipelineTestData.add(new Voter("Rahul Verma", 25, "Indian", "INVALID_ID", false));

        for (Voter voter : pipelineTestData) {
            System.out.println("Processing Voter: " + voter.getName());
            System.out.println("Status Result... : " + voter.checkEligibility());
            System.out.println("--------------------------------------------------");
        }
    }
}
