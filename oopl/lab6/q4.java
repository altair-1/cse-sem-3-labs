import java.util.Scanner;

class Student {
    String name;
    int id;

    Student() {
        name = "default";
        id = -1;
    }
    class Sports {
        int s_grade;
    
        Sports() {
            s_grade = -1;
        }
    }


    class Exam {
        int e_grade;

        Exam() {
            e_grade = -1;
        }
    }
}

class Result extends Student {
    String res="";
    Student s1 = new Student();
    Student.Sports ss1 = s1.new Sports();
    Student.Exam se1 = s1.new Exam();
    Result() {
        res=name+"\n"+"ID: "+id+"\nsports grade: "+ss1.s_grade+"\nexam grade: "+se1.e_grade;
    }

    void display() {
        System.out.println(res);
    }
}

class q4 {
    public static void main(String args[]) {
        Result obj = new Result();
        obj.display();
    }
}