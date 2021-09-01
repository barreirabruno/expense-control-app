package br.com.expensecontrolapplication.usecases.config;

import br.com.expensecontrolapplication.entity.Expense;
import br.com.expensecontrolapplication.usecases.port.ExpenseRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryExpenseRepository implements ExpenseRepository {

    private final Map<String, Expense> inMemoryDB = new HashMap<>();

    @Override
    public Expense create(Expense expense) {
        System.out.println("[IN MEMORY DATABASE]" + expense);
        inMemoryDB.put(expense.getExp_id(), expense);
        return expense;
    }

}
