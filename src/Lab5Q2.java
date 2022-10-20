import java.util.ArrayList;
import java.util.Random;



public class Lab5Q2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=0; i<=9; i++){
            Random randNum=new Random();
            int n=randNum.nextInt(50)+1;
            list.add(n);

        }
        System.out.println(list);

       

    ArrayList<Integer> list2=new ArrayList<>(list);
    list.set(9,-5);

    System.out.println(list);
    System.out.println(list2);
    
}

}