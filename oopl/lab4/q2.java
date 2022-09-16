import java.util.Scanner;

class time {
    int hrs, mins, sec, day;

    time() {
        hrs=0;
        mins=0;
        sec=0;
        day=0;
    }

    time(int h, int m, int s) {
        hrs = h;
        mins = m;
        sec = s;
    }

    void display() {
        System.out.println(hrs+":"+mins+":"+sec);
    }

    
    time add(time t1) {
        time tAns = new time();
        tAns.sec = t1.sec + sec;
        tAns.mins = t1.mins + mins;
        tAns.hrs = t1.hrs + hrs;
        if (tAns.sec >= 60) {
            tAns.mins += 1;
            tAns.sec = tAns.sec-60;
        }
        if (tAns.mins >= 60) {
            tAns.hrs += 1;
            tAns.mins = tAns.mins-60;
        }
        if (tAns.hrs >= 24) {
            tAns.hrs = tAns.hrs-24;
            tAns.day = 1;
        }
        return tAns;
    }

    int calcValue(time t1) {
        return ((t1.hrs * 3600) + (t1.mins * 60) + t1.sec);
    }

    boolean compare(time t1, time t2) {
        int val1 = calcValue(t1);
        int val2 = calcValue(t2);
        return (val1 > val2 ? true:false);
    }

    time convert(int val) {
        double temp = (double) val/3600;
        int hrs = (int) temp;
        temp=temp-hrs;
        temp = temp*60;
        int mins = (int) temp;
        temp = temp-mins;
        temp = temp * 60;
        int sec = (int) temp;
        time tAns = new time();
        tAns.hrs=hrs;
        tAns.mins=mins;
        tAns.sec=sec;
        return tAns;
    }

    time subtract(time t1) {
        int val1 = calcValue(t1);
        int val2 = (hrs * 3600) + (mins * 60) + sec;
        int val3;
        time tAns = new time();
        if (val1 > val2) {
            val3 = val1 - val2;
            tAns = convert(val3);
        }
        else {
            val3 = val2 - val1;
            tAns = convert(val3);
        }
        
        return tAns;
    }
}

class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        time t3 = new time();
        System.out.println("the default constructor has been called, the values are: ");
        t3.display();

        System.out.print("enter hrs for time 1: ");
        int hrs1 = sc.nextInt();
        System.out.print("enter mins for time 1: ");
        int mins1 = sc.nextInt();
        System.out.print("enter seconds for time 1: ");
        int sec1 = sc.nextInt();
        System.out.print("enter hrs for time 2: ");
        int hrs2 = sc.nextInt();
        System.out.print("enter mins for time 2: ");
        int mins2 = sc.nextInt();
        System.out.print("emter seconds for time 2: ");
        int sec2 = sc.nextInt();

        time t1 = new time(hrs1,mins1,sec1);
        time t2 = new time(hrs2,mins2,sec2);

        System.out.println("time 1 is: ");
        t1.display();
        System.out.println("time 2 is: ");
        t2.display();

        t3=t1.add(t2);        
        System.out.println("the result time after addition is: ");
        if (t3.day == 1) {
            System.out.println("the result time is on the next day");
        }
        t3.display();

        t3=t1.subtract(t2);
        System.out.println("the result time after subtraction is: ");
        t3.display();

        System.out.println("the comparison of both times results in");
        boolean b=t3.compare(t1,t2);
        if (b) {
            System.out.println("the first time is more than the second");
        }
        else {
            System.out.println("the second time is more than the first");
        }    
    }
}