package br.com.expensecontrolapplication.entity;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ExpenseTest {
    @Test
    public void should_create_a_new_expense() {
        var expense = Expense.builder()
                .price(new BigDecimal("99.70"))
                .description("any_description")
                .expenseDate("2021-08-31")
                .category("Food")
                .build();

        assertEquals("any_description", expense.getExp_description());
        assertEquals("2021-08-31", expense.getExp_date());
        assertEquals(Category.FOOD, expense.getExp_category());
    }
}
