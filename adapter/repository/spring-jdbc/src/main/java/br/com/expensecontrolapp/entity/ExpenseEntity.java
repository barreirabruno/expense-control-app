package br.com.expensecontrolapp.entity;

import br.com.expensecontrolapplication.entity.Expense;

import java.math.BigDecimal;

public class ExpenseEntity {

    private String exp_id;
    private BigDecimal exp_price;
    private String exp_description;
    private String exp_date;
    private String exp_category;
    private String exp_public_category;

    public static Expense toExpense(ExpenseEntity entity) {
        var expense = Expense.builder()
                .price(entity.getExp_price())
                .description(entity.getExp_description())
                .expenseDate(entity.getExp_date())
                .category(entity.exp_public_category)
                .build();

        return expense;
    }

    public String getExp_id() {
        return exp_id;
    }

    public void setExp_id(String exp_id) {
        this.exp_id = exp_id;
    }

    public BigDecimal getExp_price() {
        return exp_price;
    }

    public void setExp_price(BigDecimal exp_price) {
        this.exp_price = exp_price;
    }

    public String getExp_description() {
        return exp_description;
    }

    public void setExp_description(String exp_description) {
        this.exp_description = exp_description;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getExp_category() {
        return exp_category;
    }

    public void setExp_category(String exp_category) {
        this.exp_category = exp_category;
    }

    public String getExp_public_category() {
        return exp_public_category;
    }

    public void setExp_public_category(String exp_public_category) {
        this.exp_public_category = exp_public_category;
    }
}
