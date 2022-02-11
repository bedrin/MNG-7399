package org.gradle.test.performance5_2;

public class Production5_200 extends org.gradle.test.performance2_2.Production2_200 {
    private final String property;

    public Production5_200() {
        this.property = "foo";
    }

    public Production5_200(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
