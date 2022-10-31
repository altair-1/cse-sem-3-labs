import java.util.Scanner;

class StackException extends Exception{
    void Underflow(){
        System.out.println("stack underflow");
    }
    void Overflow(){
        System.out.println("stack overflow");
    }
}

class Stack
{
    int arr[];
    int tos;
    void Initialize(int size){
        tos=-1;
        arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = 0;
        }
    }
    
    void Push(int ele) throws StackException{
        if(tos==arr.length-1){
            throw new StackException();
        }
        else{
            tos++;
            arr[tos]=ele;
        }
    }
    
    int Pop() throws StackException{
        int retele=-1;
        if(tos==-1){
            throw new StackException();
        }
        else{
            retele=arr[tos];
            arr[tos]=0;
            tos--;
        }
        return retele;
    }
    
    void display(){
        System.out.println("array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}

class stack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        s.Initialize(size);
        int choice,ele;
        do{
            System.out.println("enter your choice:\n1. push\n2. pop\n");
            choice=sc.nextInt();
            switch(choice){
                case 1 :{
                    System.out.println("enter element to push: ");
                    ele=sc.nextInt();
                    try{
                        s.Push(ele);
                    }
                    catch(StackException s1){
                        s1.Overflow();
                    }
                    finally{
                        s.display();
                    }
                    break;
                }
                case 2 :{
                    try{
                        int popped = s.Pop();
                        System.out.println("popped element is "+popped);
                    }
                    catch(StackException s1){
                        s1.Underflow();
                    }
                    finally{
                        s.display();
                    }
                    break;
                }
                default :{
                    System.out.println("invalid choice");
                }
            }
            System.out.println("enter your choice:\nany number -> continue\n-1 -> exit");
            choice=sc.nextInt();
        } while(choice!=-1);
    }
}