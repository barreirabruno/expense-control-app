package br.com.expensecontrolapplication.entity;

import java.math.BigDecimal;

public class ExpenseBuilder {

    private BigDecimal exp_price;
    private String exp_description;
    private String exp_date;
    private Category exp_category;
    private String exp_public_category;

    public ExpenseBuilder() {
    }

    public ExpenseBuilder price(BigDecimal exp_price) {
        this.exp_price = exp_price;
        return this;
    }

    public ExpenseBuilder description(String exp_description) {
        this.exp_description = exp_description;
        return this;
    }

    public ExpenseBuilder expenseDate(String exp_date) {
        this.exp_date = exp_date;
        return this;
    }

    public ExpenseBuilder category(String category) {
        this.exp_category = Category.of(category);
        this.exp_public_category = this.discoverCategoryType(this.exp_category);
        return this;
    }

    public Expense build() {
        return new Expense(this.exp_price, this.exp_description, this.exp_date, this.exp_category, this.exp_public_category);
    }

    private String discoverCategoryType(Category exp_category) {
        switch (exp_category) {
            case FOOD:
                return "Food";
            case MOBILITY:
                return "Mobility";
            case HOBBY:
                return "Hobby";
            case OTHER:
                return "Other";
            default:
                return "";
        }
    }
}
