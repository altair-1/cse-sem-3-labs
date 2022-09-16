import java.util.Scanner;

class complex {
    double real;
    double imag;

    complex() {
        real=0.0;
        imag=0.0;
    }

    complex(double r, double i) {
        real=r;
        imag=i;
    }

    void display() {
        System.out.println(real+" + "+imag+"i");
    }

    void add(complex c1, complex c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    void subtract(complex c1, complex c2) {
        if (c2.real > c1.real) {
            real = c2.real - c1.real;
            imag = c2.imag - c1.imag;
        }
        else {
            real = c1.real - c2.real;
            imag = c1.imag - c2.imag;
        }
    }
}

class q1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        
        complex c3 = new complex();
        System.out.println("the default constructor has been called, the values are: ");
        c3.display();

        System.out.print("enter the real part of complex number 1: ");
        double r1 = sc.nextDouble();
        System.out.print("enter the complex part of complex number 1: ");
        double i1 = sc.nextDouble();
        System.out.print("enter the real part of complex number 2: ");
        double r2 = sc.nextDouble();
        System.out.print("enter the complex part of complex number 2: ");
        double i2 = sc.nextDouble();
        
        // c1.assign(r1,i1);
        // c2.assign(r2,i2);

        complex c1 = new complex(r1,i1);
        complex c2 = new complex(r2,i2);

        System.out.println("the first complex number is: ");
        c1.display();

        System.out.println("the second complex number is: ");
        c2.display();

        c3.add(c1,c2);

        System.out.println("the complex number after addition is: ");
        c3.display();

        c3.subtract(c1,c2);

        System.out.println("the complex number after subtraction is: ");
        c3.display();
    }
}