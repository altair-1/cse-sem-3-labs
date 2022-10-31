import java.util.*;

class Table {
    public static synchronized void printTable (int n, int k) throws InterruptedException {
        for (int i = 1; i <= k; ++i) {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
            Thread.sleep(200);
            if (i == k)
                System.out.println();
        }
    }
}

class TableThread extends Thread {
    Table table;
    int n;
    int k;
    public TableThread (String threadName, int n, int k, Table table) {
        super(threadName);
        this.n = n;
        this.k = k;
        this.table = table;
        start();
    }

    @Override
    public void run () {
        try {
            Table.printTable(n, k);
        }
        catch (InterruptedException e) {
            System.err.println("thread interrupted: " + e);
        }
    }
}

public class multiplicationTable {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of tables: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.print("enter table numbers: \n");
        for (int i = 0; i < l; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter table limit: ");
        int k = sc.nextInt();
        System.out.println();
        Table table = new Table();
        TableThread tableThreads[] = new TableThread[l];
        for (int i = 0; i < l; ++i){
            tableThreads[i] = new TableThread("thread"+arr[i], arr[i], k, table);
        }
    }
}