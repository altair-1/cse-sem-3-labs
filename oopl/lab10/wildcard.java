import java.util.*;

class NumericFns<T extends Number>{
    T num;

    NumericFns(T n){
        num = n;
    }

    double reciprocal(){
        return 1/num.doubleValue();
    }

    double fraction(){
        return (num.doubleValue() - num.intValue());
    }

    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        }

        return false;
    }
}

class wildcard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer: ");
        int i = sc.nextInt();
        System.out.println("enter double integer: ");
        double d = sc.nextDouble();

        NumericFns <Integer> iOb = new NumericFns<Integer>(i);
        NumericFns <Double> dOb = new NumericFns<Double>(d);

        System.out.println("testing iOb and dOb");
        
        if(iOb.absEqual(dOb)){
            System.out.println("absolute values are equal");
        }

        else{
            System.out.println("absolute values are not equal");
        }
    }
}