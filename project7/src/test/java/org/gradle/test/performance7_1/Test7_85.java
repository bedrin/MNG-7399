package org.gradle.test.performance7_1;

import static org.junit.Assert.assertEquals;

public class Test7_85 {
    private final Production7_85 production = new Production7_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}