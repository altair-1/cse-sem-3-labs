import java.util.Scanner;

interface Sports {
    void putGrade(int a);
    int getGrade();
}

class Student {
    int num,marks;
    void putNumber(int a) {
        num = a;
    }
    void putMarks(int a) {
        marks = a;
    }
    int getNumber() {
        return num;
    }
    int getMarks() {
        return marks;
    }

    class Result implements Sports {
        int sportsGrade;
        public void putGrade(int a) {
            sportsGrade = a;
        }
        public int getGrade() {
            return sportsGrade;
        }
        public void display() {
            System.out.println("roll number: "+getNumber()+"\nmarks: "+getMarks()+"\nsports grade: "+getGrade());
        }
    }
}

public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        Student.Result ssp = s.new Result();

        System.out.print("enter roll number: ");
        s.putNumber(sc.nextInt());
        System.out.print("enter marks: ");
        s.putMarks(sc.nextInt());
        System.out.print("enter sports grade: ");
        ssp.putGrade(sc.nextInt());
        System.out.println("\n//displaying results//\n");
        ssp.display();
    }
}