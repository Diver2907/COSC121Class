package recursion;

public class Recursion{
    public static void main(String[] args){
        Print(5);
    }
    static void Print(int n){
        if(n>0){
            System.out.print(n+" ");
            Print(n-1);
        }
        return;
    }
}