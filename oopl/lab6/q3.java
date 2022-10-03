import java.util.Scanner;

abstract class figure {
    int a,b;
    abstract int area();
}

class Rectangle extends figure {
    Rectangle(int x,int y) {
        a=x;
        b=y;
    }
    int area() {
        return (a*b);
    }
}

class Square extends figure {
    Square(int x) {
        a=x;
    }
    int area() {
        return (a*a);
    }
}

class Triangle extends figure {
    Triangle(int x,int y) {
        a=x;
        b=y;
    }
    int area() {
        return ( (int) a*b/2);
    }
}

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. rectangle, 2. square, 3. triangle ");
        int input = sc.nextInt();
        sc.nextLine();
        System.out.print("enter the first dimension: ");
        int a = sc.nextInt();
        System.out.print("enter the second dimension: ");
        int b = sc.nextInt();
        int area=0;
        if (input == 1) {
            Rectangle rect= new Rectangle(a,b);
            area = rect.area();
        }
        else if (input == 2) {
            Square sq = new Square(a);
            area = sq.area();
        }
        else if(input == 3) {
            Triangle t = new Triangle(a,b);
            area = t.area();
        }
        else {
            System.out.println("invalid input");
        }
        System.out.println("area = "+area);
    }
}