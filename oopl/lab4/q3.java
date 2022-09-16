import java.util.Scanner;

class BankAccount {
    
    String name;
    int accno;
    String type;
    int bal;
    static int rate;

    BankAccount() {
        name="";
        accno=0;
        type="";
        bal=0;
        rate=0;
    }

    BankAccount(String nam,int accnum, String acctype,int balance,int roi) {
        name=nam;
        accno=accnum;
        type=acctype;
        bal=balance;
        rate=roi;
    }

    void deposit(int val) {
        bal += val;
        System.out.println(val+" was deposited into your account, the current balance is "+bal);
    }

    void withdraw(int val) {
        if (bal-val < 0) {
            System.out.println("error, the amount asked to be withdrawn is more than the available balance. the current balance is "+bal);
        }
        else {
            bal-=val;
            System.out.println(val+" was withdrawn from your account. the current balance is "+bal);
        }
    }

    void display() {
        System.out.println("name of account holder: "+name+"\naccount number: "+accno+"\ntype of account: "+type+"\nbalance: "+bal);
    }

    static void roiDisplay() {
        System.out.println("the rate of interest is "+rate);
    }
}

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc2 = new BankAccount();
        System.out.println("the default constructor has been called, the details of the account are: ");
        acc2.display();

        System.out.print("enter name of the depositor: ");
        String nam = sc.next();
        System.out.print("enter account number: ");
        int accnum = sc.nextInt();
        System.out.print("enter type of account: ");
        String acctype = sc.next();
        System.out.print("enter balance amount in the account: ");
        int balance = sc.nextInt();
        System.out.print("enter the ROI offered by the bank: ");
        int roi = sc.nextInt();

        BankAccount acc = new BankAccount(nam,accnum,acctype,balance,roi);
        int input = 0;
        int temp;
        do {
            System.out.println("1. deposit, 2. withdraw, 3. display account details, 4. display ROI, -1. exit");
            input=sc.nextInt();
            if(input == 1) {
                System.out.print("enter the amount of money you want to deposit: ");
                temp = sc.nextInt();
                acc.deposit(temp);
            }
            else if(input == 2) {
                System.out.print("enter the amount of money you want to withdraw: ");
                temp = sc.nextInt();
                acc.withdraw(temp);
            }
            else if(input == 3) {
                acc.display();
            }
            else if(input == 4) {
                acc.roiDisplay();
            }
            else {
                input=-1;
            }
        } while(input != -1);

    }
}