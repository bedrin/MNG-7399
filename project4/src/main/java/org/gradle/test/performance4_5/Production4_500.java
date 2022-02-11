package org.gradle.test.performance4_5;

public class Production4_500 extends org.gradle.test.performance2_5.Production2_500 {
    private final String property;

    public Production4_500() {
        this.property = "foo";
    }

    public Production4_500(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
