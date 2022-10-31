import java.util.Scanner;

class MyExceptions extends Exception {
    private String errorCode;
    MyExceptions(String err) {
        errorCode = err;
    }
    
    String getCode() {
        return errorCode;
    }
}

class CurrentDate {
    int day,month,year;
    void createDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day: ");
        day = sc.nextInt();
        System.out.print("enter month: ");
        month = sc.nextInt();
        System.out.print("enter year: ");
        year = sc.nextInt();
    }
}

class date {
    public static void main(String args[]) throws MyExceptions {
        MyExceptions invalMonth = new MyExceptions("InvalidMonthException");
        MyExceptions invalDay = new MyExceptions("InvalidDayException");
        CurrentDate cd = new CurrentDate();
        try {
            cd.createDate();
            if (cd.month > 12 || cd.month < 1) 
                throw invalMonth;
            else if (cd.month == 1 || cd.month == 3 || cd.month == 5 || cd.month == 7 || cd.month == 8 || cd.month == 10 || cd.month == 12) {
                if (cd.day > 31 || cd.day < 1) 
                    throw invalDay;
            }
            else if (cd.month == 2) {
                if (cd.year % 4 == 0) {
                    if (cd.day > 29 || cd.day < 1)
                        throw invalDay;
                }
                else {
                    if (cd.day > 28 || cd.day < 1)
                        throw invalDay;
                }
            }
            else {
                if (cd.day > 30 || cd.day < 1)
                    throw invalDay;
            }
            System.out.println("displaying valid current date entered\n"+cd.day+"/"+cd.month+"/"+cd.year);
        }
        catch(MyExceptions e) {
            System.out.println("exception thrown: "+e.getCode());
        }
    }
}