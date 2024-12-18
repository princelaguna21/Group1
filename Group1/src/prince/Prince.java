package prince;

import java.util.Scanner;


public class Prince {

    
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        StudentController studentcontrols = new StudentController(5);
        
        System.out.println("-----Student Crud-----");
        
        try{
            while(true){
            System.out.print("[1]Create\n"
                    + "[2]Retrieve\n"
                    + "[3]Update\n"
                    + "[4]Delete\n"
                    + "[5]Display\n"
                    + "[6]Exit\n"
                    + "Choose: ");
            int opt = scann.nextInt();
            switch(opt){
                case 1:
                    studentcontrols.Create();
                    break;
                case 2:
                    studentcontrols.Retrieve();
                    break;
                case 3:
                    studentcontrols.Update();
                    break;
                case 4:
                    studentcontrols.Delete();
                    break;
                case 5:
                    studentcontrols.Display();
                    break;
                case 6:
                    studentcontrols.Exit();
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
        }catch(Exception e){
            System.out.println("Number only please");
        }
        
        
        
    }
    
}

	


