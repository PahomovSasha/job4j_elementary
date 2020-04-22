package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            System.out.println("Пользователь не найден");
            return;
        }
        for (List<Account> accounts : users.values()) {
            if (!accounts.contains(account)) {
                accounts.add(account);
                break;
            }
        }
    }

    public User findByPassport(String passport) {
        User userFind = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userFind = user;
                break;
            }
        }
        return userFind;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account accountFind = null;
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        for (Account account : users.get(user)) {
            if (account.getRequisite().equals(requisite)) {
                accountFind = account;
                break;
            }
        }
        return accountFind;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc == null || accountDest == null) {
            return false;
        }
        if ((accountSrc.getBalance() - amount) < 0) {
            return false;
        }
        accountSrc.setBalance(accountSrc.getBalance() - amount);
        accountDest.setBalance(accountDest.getBalance() + amount);
        return true;
    }
}
