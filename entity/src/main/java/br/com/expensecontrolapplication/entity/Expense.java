package br.com.expensecontrolapplication.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Expense {

    private final String exp_id;
    private final BigDecimal exp_price;
    private final String exp_description;
    private final String exp_date;
    private final Category exp_category;
    private final String exp_public_category;

    public Expense(BigDecimal exp_price, String exp_description, String exp_date, Category exp_category, String exp_public_category) {
        this.exp_id = UUID.randomUUID().toString();
        this.exp_price = exp_price;
        this.exp_description = exp_description;
        this.exp_date = exp_date;
        this.exp_category = exp_category;
        this.exp_public_category = exp_public_category;
    }

    public static ExpenseBuilder builder() {
        return new ExpenseBuilder();
    }

    public String getExp_id() {
        return exp_id;
    }

    public BigDecimal getExp_price() {
        return exp_price;
    }

    public String getExp_description() {
        return exp_description;
    }

    public String getExp_date() {
        return exp_date;
    }

    public Category getExp_category() {
        return exp_category;
    }

    public String getExp_public_category() {
        return exp_public_category;
    }
}
