package br.com.expensecontrolapplication.entity;

import java.util.Arrays;

public enum Category {

    FOOD("Food"),
    MOBILITY("Mobility"),
    HOBBY("Hobby"),
    OTHER("Other");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public static Category of(String value) {
        return Arrays.stream(values()).filter(type -> type.category.equalsIgnoreCase(value)).findFirst().orElse(null);
    }

    public String getCategory() {
        return category;
    }
}
