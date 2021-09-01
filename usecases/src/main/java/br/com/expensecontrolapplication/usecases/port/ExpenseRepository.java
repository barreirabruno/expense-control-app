package br.com.expensecontrolapplication.usecases.port;

import br.com.expensecontrolapplication.entity.Expense;

public interface ExpenseRepository {

    Expense create(Expense expense);
}
