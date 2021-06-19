package com.company.alia;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Operation operation1 = new Operation("Add Client to Bank", 4);
        Operation operation2 = new Operation("Holidays",10);
        Operation operation3 = new Operation("Hakuna", 5);
        Operation operation4 = new Operation("Matata", 5);
        Operation operation5 = new Operation("Reading a book", 10);
        Operation operation6 = new Operation("Delete Client from the Bank", 4);
        Operation operation7 = new Operation("Google search", 3);
        Operation operation8 = new Operation("Download photo", 7);
        Operation operation9 = new Operation("Log in to Insta", 10);
        Operation operation10 = new Operation("Add money to Bank", 5);

        operation1.run();
        operation2.run();
        operation3.run();
        operation4.run();
        operation5.run();
        operation6.run();
        operation7.run();
        operation8.run();
        operation9.run();
        operation10.run();

    }
}
