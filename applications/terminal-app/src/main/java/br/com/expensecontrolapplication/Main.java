package br.com.expensecontrolapplication;

import br.com.expensecontrolapplication.config.ManualConfig;
import br.com.expensecontrolapplication.presenter.ExpensePresenter;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("----WELCOME, TO THE EXPENSE APP----");
        System.out.println("-----------------------------------");

        System.out.println("ARGUMENTS WERE PROVIDED VIA IDE, RECORDING EXPENSE ON MEMORY...");
        var config = new ManualConfig();
        var createExpense = config.createExpense();
        var controller = new ExpenseController(createExpense);

        var expenseModel = new ExpensePresenter();
        expenseModel.setExp_price(args[0]);
        expenseModel.setExp_description(args[1]);
        expenseModel.setExp_category(args[2]);
        expenseModel.setExp_date(args[3]);

        final var expenseCreated = controller.createExpense(expenseModel);

        System.out.println("[EXPENSE CREATED]");
        System.out.println(expenseCreated);

        System.out.println("DONE, BYE!");
    }
}
