package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_416 {
    private final Production8_416 production = new Production8_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}