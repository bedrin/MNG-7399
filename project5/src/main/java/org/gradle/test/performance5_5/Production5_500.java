package org.gradle.test.performance5_5;

public class Production5_500 extends org.gradle.test.performance2_5.Production2_500 {
    private final String property;

    public Production5_500() {
        this.property = "foo";
    }

    public Production5_500(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
