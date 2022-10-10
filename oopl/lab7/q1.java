package com.course.structure;
import java.util.Scanner;

public class q1 {
    Scanner sc = new Scanner(System.in);

    double sqFootage;
    int stories;
 
    public class building {
        double sqFootage = -1;
        int stories = -1;
    }

    public void assign() {
        System.out.print("enter the square footage: ");
        double sq = sc.nextDouble();
        System.out.print("enter number of stories: ");
        int s = sc.nextInt();
        sqFootage = sq;
        stories = s;
    }

    public void display() {
        System.out.println("square footage: "+sqFootage+"\nstories: "+stories);
    }

    public class house {
        int numOfBed,numOfBath;

        public house() {
            numOfBed = -1;
            numOfBath = -1;
        }

        public void assign() {
            System.out.print("enter number of bedrooms: ");
            int n1 = sc.nextInt();
            System.out.print("enter number of bathrooms: ");
            int n2 = sc.nextInt();
            numOfBed = n1;
            numOfBath = n2;
        }

        public void display() {
            System.out.println("square footage: "+sqFootage+"\nstories: "+stories+"\nnumber of bedrooms: "+numOfBed+"\nnumber of bathrooms: "+numOfBath);
        }
    }

    public class school {
        int numOfClassRooms;
        String gradeLev;

        public school() {
            numOfClassRooms = -1;
            gradeLev = "default";
        }

        public void assign() {
            System.out.print("enter number of classrooms: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print("enter grade level: ");
            String glev = sc.next();
            numOfClassRooms = n;
            gradeLev = glev;
        }

        public void display() {
            System.out.println("square footage: "+sqFootage+"\nstories: "+stories+"\nnumber of classrooms: "+numOfClassRooms+"\ngrade level: "+gradeLev);
        }
    }
}