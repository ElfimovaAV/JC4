package task1;

import task2.ecxeptions.AmountException;
import task2.ecxeptions.CustomerException;
import task2.ecxeptions.ProductException;
import task2.models.Customer;
import task2.models.Order;
import task2.models.Product;

import java.util.Scanner;

public class RegistrationForm {
    private String login;
    private String password;
    private String confirmPassword;
    private String regex;

    public void registration() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
            System.out.println("Подтвердите пароль: ");
            confirmPassword = scanner.nextLine();
            checkLogInInfo(login, password, confirmPassword, "[\\w]{1,20}");
            System.out.println("Login and password are correct!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex) || login.length() > 20) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword) ||
                password.length() > 20) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}