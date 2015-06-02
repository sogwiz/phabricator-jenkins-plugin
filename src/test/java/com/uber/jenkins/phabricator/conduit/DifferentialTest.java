package com.uber.jenkins.phabricator.conduit;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

public class DifferentialTest {
    @Test
    public void testGetRevisionID() {
        Differential diff = new Differential("123");
        assertEquals(diff.getRevisionID(), "123");
    }
}