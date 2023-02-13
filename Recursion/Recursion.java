public class main{
    public static void main(String[] args){
        Print(5);
    }
    void Print(int n){
        if(n>0){
            System.out.print(n+" ");
            print(n-1);
        }
        return;
    }
}