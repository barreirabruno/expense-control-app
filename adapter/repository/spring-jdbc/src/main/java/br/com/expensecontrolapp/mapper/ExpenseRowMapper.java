package br.com.expensecontrolapp.mapper;

import br.com.expensecontrolapp.entity.ExpenseEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ExpenseRowMapper implements RowMapper<ExpenseEntity> {

    @Override
    public ExpenseEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        ExpenseEntity entity = new ExpenseEntity();

        entity.setExp_id(UUID.randomUUID().toString());
        entity.setExp_price(resultSet.getBigDecimal("PRICE"));
        entity.setExp_description(resultSet.getString("DESCRIPTION"));
        entity.setExp_date(resultSet.getString("DATE"));
        entity.setExp_category(resultSet.getString("CATEGORY"));

        return entity;
    }
}
