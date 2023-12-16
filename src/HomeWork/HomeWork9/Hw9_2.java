package HomeWork9;

public class Hw9_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread momThread = new Thread(new Mom(account));
        Thread bearThread = new Thread(new Bear(account));

        momThread.start();
        bearThread.start();
    }
}

class BankAccount {
    private int balance = 0;

    public synchronized void deposit() {
        if (balance > 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            return;
        }
        balance += 2000;
        System.out.println("媽媽存了2000元，帳戶共有: " + balance + "元");
        notifyAll(); // 通知等待的線程（熊大）
    }

    public synchronized void withdraw() {
        while (balance < 1000) {
            System.out.println("熊大看到帳戶沒錢，暫停提款/n" + "媽媽被熊大要求匯款");
            try {
                wait(); // 等待媽媽的匯款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= 1000;
        System.out.println("熊大提款 1000元，當前餘額: " + balance + "元");
    }

    public int getBalance() {
        return balance;
    }
}

class Mom implements Runnable {
    private BankAccount account;

    public Mom(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit();
            try {
                Thread.sleep(1000); // 假設匯款間隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Bear implements Runnable {
    private BankAccount account;

    public Bear(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw();
            try {
                Thread.sleep(500); // 假設提款間隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
