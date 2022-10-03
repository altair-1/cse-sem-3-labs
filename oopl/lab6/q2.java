import java.util.Scanner;

class Building {
    Scanner sc = new Scanner(System.in);

    double sqFootage;
    int stories;

    Building() {
        sqFootage = -1;
        stories = -1;
    }

    void assign() {
        System.out.print("enter the square footage: ");
        double sq = sc.nextDouble();
        System.out.print("enter number of stories: ");
        int s = sc.nextInt();
        sqFootage = sq;
        stories = s;
    }

    void display() {
        System.out.println("square footage: "+sqFootage+"\nstories: "+stories);
    }

    class House {
        int numOfBed,numOfBath;

        House() {
            numOfBed = -1;
            numOfBath = -1;
        }

        void assign() {
            System.out.print("enter number of bedrooms: ");
            int n1 = sc.nextInt();
            System.out.print("enter number of bathrooms: ");
            int n2 = sc.nextInt();
            numOfBed = n1;
            numOfBath = n2;
        }

        void display() {
            System.out.println("square footage: "+sqFootage+"\nstories: "+stories+"\nnumber of bedrooms: "+numOfBed+"\nnumber of bathrooms: "+numOfBath);
        }
    }

    class School {
        int numOfClassRooms;
        String gradeLev;

        School() {
            numOfClassRooms = -1;
            gradeLev = "default";
        }

        void assign() {
            System.out.print("enter number of classrooms: ");
            int n = sc.nextInt();
            String dump = sc.nextLine();
            System.out.print("enter grade level: ");
            String glev = sc.next();
            numOfClassRooms = n;
            gradeLev = glev;
        }

        void display() {
            System.out.println("square footage: "+sqFootage+"\nstories: "+stories+"\nnumber of classrooms: "+numOfClassRooms+"\ngrade level: "+gradeLev);
        }
    }
}

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. building only, 2. house, 3. school ");
        int input = sc.nextInt();
        Building b = new Building();
        if (input == 1) {
            b.assign();;
            b.display();
        }
        if (input == 2) {
            Building.House h =  b.new House();
            b.assign();
            h.assign();
            h.display();
        }
        if (input == 3) {
            Building.School s = b.new School();
            b.assign();
            s.assign();
            s.display();
        }
    }
}