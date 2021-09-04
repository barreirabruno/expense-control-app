package br.com.expensecontrolapplication.usecases;

import br.com.expensecontrolapplication.entity.Expense;
import br.com.expensecontrolapplication.usecases.port.ExpenseRepository;

public class CreateExpense {

    private final ExpenseRepository repository;

    public CreateExpense(ExpenseRepository repository) {
        this.repository = repository;
    }

    public Expense create(final Expense expense) {
        var createdExpense = repository.create(expense);
        return createdExpense;
    }
}
