package Test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Midterm2 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            boolean negative = false;
            if(num < 0){
                negative = true;
                num*=-1;
            }
            ArrayList <Integer> numbers = new ArrayList<Integer>();
            while(num>0){
                int digit = num%10;
                num = num/10;
                numbers.add(digit);
            }
            if(negative == true){
                System.out.print("- ");
            }
            for(int i=0;i<numbers.size();i++){
                System.out.print(numbers.get(numbers.size()-1-i));
                if(i!=numbers.size()-1){
                    System.out.print(" * ");
                }
            }
        }
        catch(InputMismatchException e){
            System.out.print("Invalid input, ");
            main(args);
        }
    }
}
