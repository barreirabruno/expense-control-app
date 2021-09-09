package br.com.expensecontrolapp;

import br.com.expensecontrolapplication.entity.Expense;
import br.com.expensecontrolapplication.usecases.port.ExpenseRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

public class SpringJdbcExpenseRepository implements ExpenseRepository {

    private JdbcTemplate jdbcTemplate;

    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql").build();
    }

    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(this.dataSource());
    }

    public SpringJdbcExpenseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Expense create(Expense expense) {

        String sql = new StringBuilder().append("INSERT INTO ")
                .append(" EXPENSE_CONTROL(exp_price, exp_description, exp_date)")
                .append(" VALUES(?, ?, ?)").toString();

        jdbcTemplate.update(sql, expense.getExp_price(), expense.getExp_description(), expense.getExp_date());

        return expense;
    }

}
