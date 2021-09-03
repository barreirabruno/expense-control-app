package br.com.expensecontrolapplication.presenter;

import br.com.expensecontrolapplication.entity.Category;
import br.com.expensecontrolapplication.entity.Expense;

import java.math.BigDecimal;

public class ExpensePresenter {

    private String exp_price;
    private String exp_description;
    private String exp_date;
    private String exp_category;

    public static ExpensePresenter mapToExpenseModel(Expense expense) {

        var expenseModel = new ExpensePresenter();
        expenseModel.exp_price = expense.getExp_price().toString();
        expenseModel.exp_description = expense.getExp_description();
        expenseModel.exp_date = expense.getExp_date();
        expenseModel.exp_category = expense.getExp_category().toString();

        return expenseModel;
    }

    public static Expense mapToExpense(ExpensePresenter expensePresenter) {
        return Expense.builder()
                .price(new BigDecimal(expensePresenter.getExp_price()))
                .description(expensePresenter.getExp_description())
                .expenseDate(expensePresenter.exp_date)
                .category(expensePresenter.exp_category)
                .build();
    }

    @Override
    public String toString() {
        return "ExpensePresenter{" +
                "exp_price='" + exp_price + '\'' +
                ", exp_description='" + exp_description + '\'' +
                ", exp_date='" + exp_date + '\'' +
                ", exp_category='" + exp_category + '\'' +
                '}';
    }

    public String getExp_price() {
        return exp_price;
    }

    public String getExp_description() {
        return exp_description;
    }

    public String getExp_date() {
        return exp_date;
    }

    public String getExp_category() {
        return exp_category;
    }
}
