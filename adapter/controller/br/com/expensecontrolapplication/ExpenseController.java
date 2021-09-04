package br.com.expensecontrolapplication;

import br.com.expensecontrolapplication.presenter.ExpensePresenter;
import br.com.expensecontrolapplication.usecases.CreateExpense;

public class ExpenseController {

    private final CreateExpense createExpense;

    public ExpenseController(CreateExpense createExpense) {
        this.createExpense = createExpense;
    }

    public ExpensePresenter createExpense(ExpensePresenter expensePresenter) {
        var expense = createExpense.create(ExpensePresenter.mapToExpense(expensePresenter));

        return ExpensePresenter.mapToExpenseModel(expense);
    }
}
