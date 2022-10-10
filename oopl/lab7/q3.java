import java.util.Scanner;

interface Series {
    int getNext();
    void reset();
    void setStart(int a);
}

class ByTwos implements Series {
    int a;
    public int getNext() {
        a+=2;
        return (a);
    }
    public void setStart(int x) {
        a = x;
    }
    public void reset() {
        a = 0;
    }
}

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("default start is set as 0");
        ByTwos obj = new ByTwos();
        obj.setStart(0);
        int inp=-1;
        System.out.print("1. get next\n2. reset\n3. set start\n");
        do {
            System.out.print("\nenter choice: ");
            inp = sc.nextInt();
            if (inp == 1) 
                System.out.print(obj.getNext());
            else if(inp == 2) {
                obj.reset();
                System.out.println("series was reset");
            }
            else if(inp == 3) {
                System.out.print("enter start: ");
                obj.setStart(sc.nextInt());
            }
            else {
                inp = -1;
            }
        } while(inp != -1);
    }
}