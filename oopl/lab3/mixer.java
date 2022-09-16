import java.util.Scanner;

class Mixer {
    
    Scanner sc = new Scanner(System.in);
    int arr[];
    void accept() {
        System.out.print("enter the number of elements: ");
        int n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("enter element no. "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
    }
    
    Mixer mix(Mixer m) {
        int size = arr.length + m.arr.length;
        Mixer mAns = new Mixer();
        mAns.arr = new int[size];
        int ind=0;
        int flag = 1;
        for(int i=0;i<size;i++) {
            if(flag == 1) {
                mAns.arr[i] = arr[ind];
                if(ind == (arr.length -1)) {
                    ind=0;
                    flag=0;
                    continue;
                }
            }
            else {
                mAns.arr[i] = m.arr[ind];
            }
            ind+=1;
        }
        for(int i=0;i<(size-1);i++) {
            for(int j=i;j<size;j++) {
                if (mAns.arr[i]>mAns.arr[j]) {
                    int temp = mAns.arr[i];
                    mAns.arr[i] = mAns.arr[j];
                    mAns.arr[j] = temp;
                }
            }
        }
        return mAns;
    }
    
    void display() {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

class mixer {
    public static void main(String args[]) {

        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer();

        m1.accept();
        m2.accept();
        System.out.println("the merged array is:");
        m3 = m1.mix(m2);
        m3.display();
    }
}