package exception;

import java.util.Scanner;

class Bank
{
    double balance;

    public Bank(double balance) {
        this.balance=balance;
    }

    public void withdraw(double amount)
    {
        balance=balance-amount;
    }
    public double getBalance()
    {
        return balance;
    }
}
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
public class InsufficientBalanceExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank(1000);

        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        try
        {
            if(bank.getBalance()<amount)
            {
                throw new InsufficientBalanceException("In sufficient balance");
            }
            else {
                System.out.println("Please collect your money !!!!");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

}
