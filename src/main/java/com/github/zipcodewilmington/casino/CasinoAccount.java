package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
        private String accountName;
        private String accountPassword;
        private int userAge = 1;
        private int accountBalance = 1000;

        public CasinoAccount(String accountName, String accountPassword, int userAge, int accountBalance) {
            this.accountName = accountName;
            this.accountPassword = accountPassword;
            this.userAge = userAge;
            this.accountBalance = accountBalance;
        }

        public CasinoAccount(String accountName, String accountPassword, int userAge) {
            this.accountName = accountName;
            this.accountPassword = accountPassword;
            this.userAge = userAge;
        }

        public CasinoAccount(String accountName, String accountPassword) {
            this.accountName = accountName;
            this.accountPassword = accountPassword;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getAccountName() {
            return accountName;
        }

        public void setAccountPassword(String accountPassword) {
            this.accountPassword = accountPassword;
        }

        public String getAccountPassword() {
            return accountPassword;
        }

        public void setUserAge(int userAge) {
            this.userAge = userAge;
        }

        public int getUserAge() {
            return userAge;
        }

        public void setAccountBalance(int accountBalance) {
            this.accountBalance = accountBalance;
        }

        public double getAccountBalance() {
            return accountBalance;
        }

        public boolean canGamble(int userAge) {
            return userAge >= 21;
        }
    }
     

