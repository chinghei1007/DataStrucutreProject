/*
Define
Query
Modify

Tasks (Simple Composite)
one Composite can contain other Composite task

name
description
duration
prerequisites
*/

import java.util.Scanner;

public class Project{
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Task Management System");
        System.out.println("\t1. Create Simple/Composite Tasks");
        System.out.println("\t2. Delete Tasks");
        System.out.println("\t3. Change property of tasks");
        System.out.println("\t4. Printing information of tasks");
        System.out.println("\t5. Shut off the system");
        System.out.print("Enter your choice: ");

            while(true) { //looping until correct input is detected
        try {            
            choice = scanner.nextInt();
            if (choice < 1 || choice > 5){
                System.out.print("Please input only the numbers on the menu\nEnter you choice: ");
            }else
            {break;}
        } catch (Exception e) {
            System.out.print("Please input only numbers, try again: ");
            scanner.next();
        }}
        

        switch(choice){
            int choice2 = 0;

            case 1:
            System.out.println("Which kind of task would you like to create?");
            System.out.println("\t1. Simple Task\n\t2. Composite Task");

            while(true){
                try {
                    choice2 = scanner.nextInt();
                    if (choice2 <1 || choice>2)
                    {System.out.print("Please input only the numbers on the menu\nEnter you choice: ");}
                    else {break;}
                } catch (Exception e) {
                    System.out.println("Please om[it pm;y mi,bers. try agaom: ");
                }
            }
            if (choice2 = 1) {createsimpletask();}
            if (choice2 = 2) {createcompositetask();}
        

        }
    }

    }
}




/* public class Project {

    public static void menuItems(String item){
        switch (item){

        case "mainMenu" :
        String[] layer1= new String[5];
        layer1[0] = "Create Simple/Composite Tasks";
        layer1[1] = "Delete Tasks";
        layer1[2] = "Change property of tasks";
        layer1[3] = "Printing information of tasks";

        layer1[4] = "Shut off the system";
        for (int i = 0 ; i < layer1.length ; i++){
            System.out.println(i+1 + ". " + layer1[i]);
        }
        break;

        case "createTask" :
        System.out.println("Which task would you like to create?");
        String[] create = new String[3]
        create[0] = "\tSimple Task";
        create[1] = "\tComposite Task";
        create[2] = "\tPrevious menu";        
        
        case "simpleTask" :
        case "compositeTask" :

        case "deleteTask" :

        case "reportTaskDuration" :
        case "reportEarliest" :


        }
    
    }

    public static void menuItems2(String item) {
        
    }
    public void simpleTask{
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        int choice;
        System.out.println("TMS system");
        System.out.println("This system can do the following" +
                "\n\tCreate/Delete Simple Task and Composite Task" +
                "\n\tChange Task Properties" +
                "\n\tPrints Task's Information" +
                "\n\tPrint All Task's Information" +
                "\n\tReports Duration of a Task" +
                "\n\tReports the Earliest Finish Time of a task" +
                " ");

        menuItems("mainMenu");
        while(true){
            try {
                System.out.println("Please input your choice");
                choice = intput.nextInt();


                
            }
            catch (Exception err) {
                System.out.println("Please input only numbers for choice");
            }
        }

    }


} */
