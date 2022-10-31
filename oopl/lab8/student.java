import java.util.Scanner;
import java.util.GregorianCalendar;

class SeatsFilledExc extends Exception {
    String err;
    SeatsFilledExc() {
        err = "SeatsFilledException";
    }
    String getCode() {
        return err;
    }
}

class Student {
    int regno;
    String fName;
    GregorianCalendar DOJ;
    short sem;
    float gpa,cgpa;
    static int count=1;

    Student() {
        count+=1;
    }

    Student(String name,int d,int m, int y,short semester,float gpavg,float cgpavg) throws SeatsFilledExc {
        SeatsFilledExc sfe = new SeatsFilledExc();
        if (count >= 25) {
            throw sfe;
        }
        GregorianCalendar gcal = new GregorianCalendar(y,m,d);
        String st = Integer.toString(gcal.get(1));
        String yst = st.substring(2,4);
        String n = Integer.toString(count);
        String regnumString = yst+n;
        regno = Integer.parseInt(regnumString);
        fName = name;
        DOJ = gcal;
        sem=semester;
        gpa=gpavg;
        cgpa=cgpavg;
        count+=1;
    }

    void display() {
        System.out.println("\nname of student: "+fName+"\nregistration number: "+regno+"\ndate of joining: "+DOJ.get(5)+"/"+DOJ.get(2)+"/"+DOJ.get(1)+"\nsemester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa);
    }
}

class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of students (minimum 5): ");
        int n = sc.nextInt();
        sc.nextLine();
        Student stds[] = new Student[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter details for student number "+(i+1));
            System.out.print("enter name: ");
            String fName = sc.nextLine();
            System.out.print("enter day of DOJ: ");
            int d = sc.nextInt();
            System.out.print("enter month of DOJ: ");
            int m = sc.nextInt();
            System.out.print("enter year of DOJ: ");
            int y = sc.nextInt();
            System.out.print("enter semester: ");
            short semester = sc.nextShort();
            System.out.print("enter gpa: ");
            float gpavg = sc.nextFloat();
            System.out.print("enter cgpa: ");
            float cgpavg = sc.nextFloat();
            sc.nextLine();
            try {
                stds[i] = new Student(fName,d,m,y,semester,gpavg,cgpavg);
            }
            catch(SeatsFilledExc e) {
                System.out.println("exception thrown: "+e.getCode());
            }
        }

        System.out.println("\n//displaying details of all students//\n");
        for(int i=0;i<n;i++) {
            System.out.println("displaying details for student number "+(i+1));
            stds[i].display();
        }
    }
}