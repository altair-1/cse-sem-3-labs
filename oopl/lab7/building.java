import com.course.structure.q1;
import com.course.structure.q1.school;
import com.course.structure.q1.house;

import java.util.Scanner;

public class building {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1. building only\n2. house\n3. school\n");
        int input = sc.nextInt();
        q1 b = new q1();
        if (input == 1) {
            b.assign();
            b.display();
        }
        else if (input == 2) {
            q1.house h =  b.new house();
            b.assign();
            h.assign();
            h.display();
        }
        else if (input == 3) {
            q1.school s = b.new school();
            b.assign();
            s.assign();
            s.display();
        }
        
    }
}