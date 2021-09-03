package br.com.expensecontrolapplication.db;

import br.com.expensecontrolapplication.entity.Expense;
import br.com.expensecontrolapplication.usecases.port.ExpenseRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements ExpenseRepository {

    private final Map<String, Expense> inMemoryDb = new HashMap<>();

    @Override
    public Expense create(Expense expense) {
        inMemoryDb.put(expense.getExp_id(), expense);
        return expense;
    }
}
