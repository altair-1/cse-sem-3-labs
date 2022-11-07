import java.util.*;

class Stack<T> {
    List<T> st;
    int tos,max;
    Stack(int n) {
        tos=-1;
        st = new ArrayList<>(n);
        max = n;
    }

    void push(T data) {
        if (tos+1 == max) {
            System.out.println("stack overflow error");
            return;
        }
        tos+=1;
        st.add(tos,data);
    }

    T pop() {
        if (tos == -1) {
            System.out.println("stack underflow error");
            return null;
        }
        else{
            T data;
            data = st.remove(tos);
            tos-=1;
            return data;
        }
    }
}

class Student {
    String name;
    int rollno;
    Student(String n, int r) {
        name = n;
        rollno = r;
    }
}

class Employee {
    String name;
    int id;
    Employee(String n, int i) {
        name = n;
        id = i;
    }
}

public class genStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter max stack size: ");
        int n = sc.nextInt();
        Stack<Student> studentStack = new Stack<>(n);
        Stack<Employee> employeeStack = new Stack<>(n);
        System.out.println("1. push student, 2. pop student, 3. push employee, 4. pop employee, -1. exit");
        int inp;
        Student temp1;
        Employee temp2;
        do {
            System.out.print("enter choice: ");
            inp = sc.nextInt();
            if (inp == 1) {
                System.out.print("enter student's name: ");
                String t = sc.next();
                System.out.print("enter student's roll number: ");
                temp1 = new Student(t, sc.nextInt());
                studentStack.push(temp1);
            }
            else if (inp == 2) {
                temp1 = studentStack.pop();
                System.out.println("popped name: "+temp1.name+"\troll no.: "+temp1.rollno);
            }
            else if (inp == 3) {
                System.out.print("enter employee's name: ");
                String t = sc.next();
                System.out.print("enter employee's id: ");
                temp2 = new Employee(t, sc.nextInt());
                employeeStack.push(temp2);
            }
            else if (inp == 4) {
                temp2 = employeeStack.pop();
                System.out.println("popped name: "+temp2.name+"\temployee id: "+temp2.id);
            }
            else
                System.out.println("invalid input");
        } while (inp != -1);
        sc.close();
    }
}