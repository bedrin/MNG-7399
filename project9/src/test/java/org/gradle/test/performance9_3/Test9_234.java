package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_234 {
    private final Production9_234 production = new Production9_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}