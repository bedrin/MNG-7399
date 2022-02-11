package org.gradle.test.performance2_1;

public class Production2_3 extends org.gradle.test.performance1_1.Production1_3 {
    private final String property;

    public Production2_3() {
        this.property = "foo";
    }

    public Production2_3(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
