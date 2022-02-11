package org.gradle.test.performance5_5;

public class Production5_432 extends org.gradle.test.performance4_5.Production4_432 {
    private final String property;

    public Production5_432() {
        this.property = "foo";
    }

    public Production5_432(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
