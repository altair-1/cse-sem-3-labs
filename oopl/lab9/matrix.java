import java.util.Scanner;

class NewThread implements Runnable {
    String name;
    Thread t;
    int row[];
    int sum,completed;

    NewThread(String s,int r[]) {
        name=s;
        row=r;
        completed=-1;
        t = new Thread(this,name);
        t.start();
    }
    public void run() {
        sum=0;
        for(int i=0;i<row.length;i++) {
            sum+=row[i];
        }
        System.out.println("sum of "+name+" = "+sum);
        completed=1;
    }

    int getSum() {
        return sum;
    }
    int getCompleted() {
        return completed;
    }
}

class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("enter number of columns: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.printf("enter element at (%d,%d): ",i,j);
                mat[i][j] = sc.nextInt();
            }
        }

        NewThread rows[] = new NewThread[r];
        for (int i=0;i<r;i++) {
            String t = "row "+i;
            rows[i] = new NewThread(t, mat[i]);
        }
        try{
            System.out.println("sleeping for 0.5 seconds");
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        	System.out.println("interrupted");
        }
        while (true) {
            int flag=-1;
            for (int i=0;i<r;i++) {
                flag=1;
                if (rows[i].getCompleted() == -1)
                    flag=-1;
            }
            if (flag == 1)
                break;
        }    

        for (int i=0;i<r;i++) {
            sum+=rows[i].getSum();
        }
        
        System.out.println("total sum = "+sum);
    }
}