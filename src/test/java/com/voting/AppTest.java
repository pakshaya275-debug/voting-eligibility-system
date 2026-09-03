package com.voting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void testEligibleVoter() {
        Voter voter = new Voter("Akshaya P", 22, "Indian", "VOT12345", true);
        assertEquals("Eligible: Criteria met successfully.", voter.checkEligibility());
    }

    @Test
    public void testUnderageVoter() {
        Voter voter = new Voter("Neha Sharma", 16, "Indian", "VOT67890", true);
        assertTrue(voter.checkEligibility().contains("Underage"));
    }

    @Test
    public void testNonCitizenVoter() {
        Voter voter = new Voter("John Doe", 30, "American", "VOT11223", true);
        assertTrue(voter.checkEligibility().contains("Not an Indian citizen"));
    }

    @Test
    public void testInvalidIdVoter() {
        Voter voter = new Voter("Rahul Verma", 25, "Indian", "INVALID_ID", false);
        assertTrue(voter.checkEligibility().contains("valid Voter ID"));
    }
}
