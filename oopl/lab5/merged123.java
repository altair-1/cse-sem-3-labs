import java.util.Scanner;
import java.util.GregorianCalendar;

class student {
    int regno;
    String fName;
    //string DOJ;
    GregorianCalendar DOJ;
    short sem;
    float gpa,cgpa;
    static int count=1;

    student() {
        count+=1;
    }

    String calcYear(String DOJ) {
        int c=0,i=0;
        int ind=-1;
        while(c!=2) {
            if(DOJ.charAt(i) == '/') {
                c+=1;
            }
            else {
                ind=i+1;
            }
            i+=1;
        }
        return (DOJ.substring(ind+1,DOJ.length()));
    }

    String manipulateName(String name) {
        int flag=0;
        String temp="";
        char initial=' ';
        String out ="";
        for(int i=0;i<name.length();i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                flag=1;
                initial=name.charAt(i);
            }
            if (flag == 1) {
                temp = temp + name.charAt(i);
            }
            if (name.charAt(i) == ' ') {
                flag = 0;
                out = out + initial + ". ";
                temp = "";
            }
            if (i == name.length()-1) {
                out = out + temp;
            }
        }
        return out;
    }

    student(String name,int d,int m, int y,short semester,float gpavg,float cgpavg) {
        GregorianCalendar gcal = new GregorianCalendar(y,m,d);
        //string y = calcYear(DateOJ);
        String st = Integer.toString(gcal.get(1));
        String yst = st.substring(2,4);
        String n = Integer.toString(count);
        String regnumString = yst+n;
        regno = Integer.parseInt(regnumString);
        // name = manipulateName(name);
        fName = name;
        DOJ = gcal;
        sem=semester;
        gpa=gpavg;
        cgpa=cgpavg;
        count+=1;
    }

    void sortBySem(student stds[],int n) {
        student temp = new student();
        for(int i = 0; i < n-1; i++) {
            for(int j= i; j < n; j++) {
                if ( stds[i].sem < stds[j].sem) {
                    temp = stds[i];
                    stds[i] = stds[j];
                    stds[j] = temp;
                }
                else if (stds[i].sem == stds[j].sem) {
                    if (stds[i].cgpa < stds[j].cgpa) {
                        temp = stds[i];
                        stds[i] = stds[j];
                        stds[j] = temp;
                    }
                }
            }
        }
    }

    void sortByName(student stds[],int n) {
        student temp = new student();
        for(int i=0;i<n-1;i++) {
            for(int j=i;j<n;j++) {
                if (((stds[i].fName).compareTo((stds[j].fName))) > 0) {
                    temp = stds[i];
                    stds[i] = stds[j];
                    stds[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("\nname of student: "+fName+"\nregistration number: "+regno+"\ndate of joining: "+DOJ.get(5)+"/"+DOJ.get(2)+"/"+DOJ.get(1)+"\nsemester: "+sem+"\nGPA: "+gpa+"\tCGPA: "+cgpa);
        //System.out.println("\nname of student: "+fName+"\nregistration number: "+regno+"\ndate of joining: "+DOJ+"\nsemester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa);
    }
}

class merged123 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of students (min 5): ");
        int n = sc.nextInt();
        sc.nextLine();
        student stds[] = new student[n];
        for(int i=0;i<n;i++) {
            System.out.println("\nenter details for student "+(i+1));
            System.out.print("enter full name: ");
            String fName = sc.nextLine();
            //System.out.print("enter date of joining in the format dd/mm/yy");
            //String DateOJ = sc.nextLine();
            System.out.print("enter day of DOJ: "); //2 digit int
            int d = sc.nextInt();
            System.out.print("enter month (1-12) of DOJ: "); //2 digit int
            int m = sc.nextInt();
            System.out.print("enter year of DOJ: "); //4 digit int
            int y = sc.nextInt();
            System.out.print("enter semester: ");
            short semester = sc.nextShort();
            System.out.print("enter GPA: ");
            float gpavg = sc.nextFloat();
            System.out.print("enter CGPA: ");
            float cgpavg = sc.nextFloat();
            sc.nextLine();

            stds[i] = new student(fName,d,m,y,semester,gpavg,cgpavg);
        }

        System.out.println("\n//displaying details of all students//\n");
        for(int i=0;i<n;i++) {
            System.out.println("\ndisplaying details for student "+(i+1));
            stds[i].display();
        }
        while (true){
            System.out.print("1. sort by sem and CGPA\n2. sort by name\n3. display names with char\n-1. exit ");
            int input = sc.nextInt();

            if (input == 1) {
                stds[0].sortBySem(stds, n);
                System.out.println("//details of students sorted by sem and CGPA//");
                for(int i=0;i<n;i++) {
                    stds[i].display();
                }
                
            }

            else if(input == 2) {
                stds[0].sortByName(stds, n);
                System.out.println("//details of students sorted by name//");
                for(int i=0;i<n;i++) {
                    stds[i].display();
                }
            }

            else if (input == 3){
                System.out.print("enter a character: ");
                char ch = sc.next().charAt(0);
                System.out.println("students with their name starting with same character are: ");
                for(int i=0;i<n;i++) {
                    if ( stds[i].fName.charAt(0) != '\0' && stds[i].fName.charAt(0) == ch){
                        stds[i].display();
                    }
                }
            }

            else if (input == -1){
                System.out.println("exiting");
                break;
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
}