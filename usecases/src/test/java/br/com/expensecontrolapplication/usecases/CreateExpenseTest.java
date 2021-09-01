package br.com.expensecontrolapplication.usecases;

import br.com.expensecontrolapplication.entity.Expense;
import br.com.expensecontrolapplication.usecases.config.InMemoryExpenseRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class CreateExpenseTest {

    private InMemoryExpenseRepository repository;
    private CreateExpense createExpense;
    private Expense expense;

    @BeforeEach
    void setup() {
        expense = Expense.builder()
                .price(new BigDecimal("99.70"))
                .description("any_description")
                .expenseDate("2021-08-31")
                .category("Food")
                .build();

        repository = new InMemoryExpenseRepository();
        createExpense = new CreateExpense(repository);
    }

    @Test
    public void should_create_an_expense_on_success() {
        CreateExpense createExpenseMock = Mockito.mock(CreateExpense.class);
        createExpenseMock.create(expense);

        Mockito.verify(createExpenseMock, Mockito.times(1)).create(expense);
    }

}
