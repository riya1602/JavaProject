package threadsEx;

/**
 * Created by expert on 19/7/18.
 */

    class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw");
        if (this.amount < amount) {
            System.out.println("less balance;waiting for deposit");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed");
    }


        synchronized void deposit(int amount){
            System.out.println("going to deposit");
            this.amount+=amount;
            System.out.println("deposit completed");
            notify();
        }
    }
    class Thread3 extends Thread{
        Customer c;
        Thread3(Customer c){
            this.c=c;
        }
        public void run(){
            c.withdraw(15000);
        }
    }
    class Thread4 extends Thread{
        Customer c;
        Thread4(Customer c){
            this.c=c;
        }
        public void run(){
            c.deposit(10000);
        }
    }
    public class Test{
        public static void main(String[] args) {
            Customer obj=new Customer();
            Thread3 t1=new Thread3(obj);
            Thread4 t2=new Thread4(obj);
            t1.start();
            t2.start();


        }
    }


