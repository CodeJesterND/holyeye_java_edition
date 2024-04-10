package oop1.ex;

public class Account {
    //잔액
    int balance = 0;

    //입금 메서드
    void deposit(int amount) {
        balance+=amount;
    }

    //출금 메서드
    void withdraw(int amount){
        if (balance >= amount) {
            balance-=amount;
        } else {
             System.out.println("잔액 부족");
        }
    }
}
