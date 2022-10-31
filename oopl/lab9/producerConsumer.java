import java.util.Scanner;

class NewThread implements Runnable {
    static int goods,end;
    String name;
    Thread t;
    int type,rate;

    NewThread(String s,int ty,int r,int g) {
        name = s;
        type = ty;
        rate = r;
        goods = g;
        end = -1;
        t = new Thread(this,name);
        t.start();
    }

    public void run() {
        // producerConsumer obj = new producerConsumer();
        if (type == 1) {
            //producer
            while (end == -1) {
                try {
                    Thread.sleep(rate);
                    if (end != -1)
                        break;
                    goods+=1;
                    System.out.println("producer produced a good, goods = "+goods);
                }
                catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }
        else {
            //consumer
            while (end == -1) {
                try {
                    Thread.sleep(rate);
                    if (goods == 0) {
                        System.out.println("goods ran out");
                        end = 1;
                        break;
                    }
                    goods-=1;
                    System.out.println("consumer consumed a good, goods = "+goods);
                }
                catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }
    }
}

public class producerConsumer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of initial goods available: ");
        int g = sc.nextInt();
        System.out.print("enter speed of producer (in ms): ");
        int pr = sc.nextInt();
        System.out.print("enter speed of consumer (in ms): ");
        int cr = sc.nextInt();

        NewThread producer = new NewThread("producer",1,pr,g);
        NewThread consumer = new NewThread("consumer",2,cr,g);
    }   
}