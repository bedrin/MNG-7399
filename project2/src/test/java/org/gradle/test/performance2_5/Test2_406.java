package org.gradle.test.performance2_5;

import static org.junit.Assert.assertEquals;

public class Test2_406 {
    private final Production2_406 production = new Production2_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}