package org.gradle.test.performance2_2;

import static org.junit.Assert.assertEquals;

public class Test2_172 {
    private final Production2_172 production = new Production2_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}