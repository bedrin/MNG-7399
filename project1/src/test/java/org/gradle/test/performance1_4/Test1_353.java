package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_353 {
    private final Production1_353 production = new Production1_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}