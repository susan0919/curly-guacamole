package com.example.degsignmodel.bankProxy;

public interface IBank {
    String openAccount(String name, String password);

    String saveMoney(int money, String account);

    String takeMoney(int money, String account, String password);

    String closeAccount(String account, String password);
}
