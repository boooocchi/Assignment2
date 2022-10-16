import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) throws Exception {
    
    Scanner scan1= new Scanner(System.in);
    Scanner scan2= new Scanner(System.in);
    Scanner scan3= new Scanner(System.in);
    Scanner scan4= new Scanner(System.in);

    String conOrQuit="continue";
   do{ System.out.println("Please type the first number.");
    int firstNum=scan1.nextInt();
    
    System.out.println("Choose an operation \n >Type + for addition \n >Type - for subtraction \n >Type * for multiplication \n >Type +/ for division");

    String operationType=scan2.nextLine();
    
    System.out.println("Please type the second number.");
    int secondNum=scan3.nextInt();
    
  
    switch(operationType){
        case "+": 
            System.out.println(firstNum + "+" + secondNum + "=" + (firstNum+secondNum));
            break;
        case "-": 
            System.out.println(firstNum + "-" + secondNum + "=" + (firstNum-secondNum));
            break;
        case "*": 
            System.out.println(firstNum + "*" + secondNum + "=" + (firstNum*secondNum));
            break;
        case "/": 
            if(secondNum==0){
                System.out.println("can not divide by 0");
               break;
            }else{
                System.out.println(firstNum + "/" + secondNum + "=" + (firstNum/secondNum));
                break;
            }
       
        default:
        System.out.println("Error! Please type in an arithmetic operator");

    };

    System.out.println("Do you want to continue or quit?");
    conOrQuit=scan4.nextLine();
}while(conOrQuit.equals("continue"));

System.out.println("Bye!");
    
    scan1.close();
    scan2.close();
    scan3.close();
    scan4.close();




    

};
}