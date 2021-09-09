drop table if exists EXPENSE_CONTROL;

create table IF NOT EXISTS EXPENSE_CONTROL (
    exp_pk bigint auto_increment,
    exp_id uuid default random_uuid(),
    exp_price decimal,
    exp_description varchar(200),
    exp_date date,
    created_at timestamp,
    updated_at timestamp
  );