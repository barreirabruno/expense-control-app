package br.com.expensecontrolappliccation.config;

import br.com.expensecontrolapplication.db.InMemoryExpenseRepository;
import br.com.expensecontrolapplication.usecases.CreateExpense;
import br.com.expensecontrolapplication.usecases.port.ExpenseRepository;

public class ManualConfigTest {

    private final ExpenseRepository database = new InMemoryExpenseRepository();

    public CreateExpense createExpense() {
        return new CreateExpense(database);
    }
}
