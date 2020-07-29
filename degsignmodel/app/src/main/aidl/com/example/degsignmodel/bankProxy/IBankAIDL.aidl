// IBankAIDL.aidl
package com.example.degsignmodel.bankProxy;

// Declare any non-default types here with import statements

interface IBankAIDL {
       String openAccount(String name, String password);

       String saveMoney(int money, String account);

       String takeMoney(int money, String account, String password);

       String closeAccount(String account, String password);
}
