package org.gradle.test.performance2_1;

import static org.junit.Assert.assertEquals;

public class Test2_49 {
    private final Production2_49 production = new Production2_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}