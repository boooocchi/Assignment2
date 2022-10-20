
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Lab5Q1{
    static Scanner scan=new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=0; i<=9; i++){
            Random randNum=new Random();
            int n=randNum.nextInt(50)+1;
            list.add(n);

        }
        System.out.println(list);

        
        System.out.println("Please type number between 1-50");
        int n=scan.nextInt();

       for(int num: list){
         if(num==n){
            System.out.println("The number is in the list");
            break;
         }else{
                System.out.println("The number is not in the lista");
                break;
            }
         }
       }

    }

    
