package prince;

import java.io.DataOutputStream;
import java.util.Scanner;

public class StudentController {
	
    Scanner scann = new Scanner(System.in);
    Scanner newScann = new Scanner(System.in);
    StudentInfo[] studentinfo;
    int Count;
    
    StudentController(int size){
        studentinfo = new StudentInfo[size];
        Count = 0;
    }
    
    void Create(){
        if(Count >= studentinfo.length){
           println("Fully Loaded"); 
           return;
        }else{
            print("Id: ");
            int Id = scann.nextInt();
            print("Name: ");
            String Name = newScann.nextLine();
            scann.nextLine();
            print("Age: ");
            int Age = scann.nextInt();
            print("Course: ");
            String Course = newScann.nextLine();
            print("Year: ");
            int Year = scann.nextInt();
            
            studentinfo[Count] = new StudentInfo(Id,Name,Age,Course,Year);
            Count++;
            println("====================");
        }
    }
    
    void Retrieve(){
        if(Count == 0){
            println("This is Empty "); 
        }else{
            print("Enter ID: ");
            int RetrieveId = scann.nextInt();
            for(int i = 0; i < Count; i++){
                if(studentinfo[i].setId() == RetrieveId){
                    System.out.println(studentinfo[i].toString());
                   
                }else{
                    System.out.println("Id not found ");
                }
                
            }  
        }
    }
    
    void Update(){
        if(Count == 0){
            println("This is Empty ");
        }else{
            print("Enter Id you want to Edit: ");
            int Uid = scann.nextInt();
            for(int i = 0; i < Count; i++){
                if(studentinfo[i].setId() == Uid){
                    print("Do you want to Edit all information in Name " + studentinfo[i].getName()+ "? " + "(N/n)Name? (A/a)Age? (C/c)Course? (Y/y)Year");
                    scann.nextLine();
                    String opt = scann.nextLine().toUpperCase();
                    switch(opt){
                        case "Y":
                            print("Name: ");
                            String Name = scann.nextLine();
                            print("Age: ");
                            int Age = scann.nextInt();
                            print("Course: ");
                            String Course = newScann.nextLine();
                            print("Year: ");
                            int Year = scann.nextInt();                   
                    
                            studentinfo[i].setName(Name);
                            studentinfo[i].setAge(Age);
                            studentinfo[i].setCourse(Course);
                            studentinfo[i].setYear(Year);
                            println("Edited Successfully");
                            println("====================");
                            break;
                        case "N":
                            print("[1]Name\n[2]Age\n[3]Course\n[4]Year\nChoose: ");
                            int Eopt = scann.nextInt();
                            switch(Eopt){
                                case 1:
                                    print("Name: ");
                                    String Ename = newScann.nextLine();
                                    studentinfo[i].setName(Ename);
                                    println("====================");
                                    break;
                                case 2:
                                    print("Age: ");
                                    int Eage = newScann.nextInt();
                                    studentinfo[i].setAge(Eage);
                                    println("====================");
                                    break;
                                case 3:
                                    print("Course: ");
                                    String Ecourse = newScann.nextLine();
                                    newScann.nextLine();
                                    studentinfo[i].setCourse(Ecourse);
                                    println("====================");
                                    break;
                                case 4:
                                    print("Year: ");
                                    int Eyear = newScann.nextInt();
                                    studentinfo[i].setYear(Eyear);
                                    println("===================");
                                    break;
                                default:
                                    println("Invalid Operation");
                                    println("===================");
                                    break;
                                }
                      
                     
                            }
                        }else{
                            System.out.println("Id not Found ");
                        }
                    }
                } 
            }
    
    void Delete(){
        if(Count == 0){
            System.out.println("This is empty");
        }else{
            print("Enter Id you want to delete: ");
            int Did = scann.nextInt();
            for(int i = 0; i < Count; i++){
                if(studentinfo[i].setId() == Did){
                    for(int j = i; j < Count - 1; i++){
                        studentinfo[j] = studentinfo[j + 1];
                    }
                    studentinfo[Count - 1] = null;
                    Count--;
                    println("Student Deleted Successfully");
                    println("====================");
                    return;
                }
            }
            println("Id not Found");
            println("_______________");
        }
    }
    
    void Display(){
        if(Count == 0){
            println("List is empty");
        }else{
            for(int i = 0; i < Count; i++){
            System.out.println(studentinfo[i].toString());
            println("______________");
            }
        }
    }
    
    void Exit(){
        System.out.print("Are sure you want to exit? : Y or N: ");
        String w = newScann.nextLine().toUpperCase();
        if(w.equals("Y")){
            System.out.println("Exit ");
            System.exit(0);
        }else{
            System.out.println("Canceled by User");
        }
        
    }
    
    void print(String word){
        System.out.print(word);
    }
    
    void println(String word){
        System.out.println(word);
    }
}

