
package caproject;
import java.util.*;
/**
 *
 * @author Keith
 */
public class Main 
{
    //Global Scanner
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
      
        final int END = 0;
        int option;
        int howManyPatients;
        
        ArrayList<patientSystem> patSys = new ArrayList<>();
      
        do
        {
            printMenu();
            option = getInt("Please enter your option: ", 0, 5);
            switch (option)
            {
                case END:
                    break;
                case 1:
                    //asks user how many patients they would like to add to the system
                    System.out.println("How many patients would you like to add: ");
                    howManyPatients = keyboard.nextInt();
                    //For loop to count how many patients the user wants to add to the system
                    for(int i = 0; i < howManyPatients;i++)
                        {
                            patSys.add(addNewPatient());
                        }
                    break;
                case 2:
                    patientList(patSys);
                    break;
                case 3:
                    serchForPatient();
                    break;
                case 4:
                    editPatientInfo();
                    break;
                case 5:
                    removePatientInfo();
                    break;
            }
          
          //Pressing 0 in system menu will exit the system
        } while (option != END);
        System.out.println("\nYou have exited the system ");
    
    }
    //Print menu for the system   
    public static void printMenu()
    {
        
        System.out.println("\nPatient information system.");
        System.out.println("0. Exit this menu");
        System.out.println("1. Add new patient to the system");
        System.out.println("2. Patient list");
        System.out.println("3. Search for patient ");
        System.out.println("4. Edit patient information ");
        System.out.println("5. Remove patient information ");
    }
    
    //Adds a new patient to the system
    public static patientSystem addNewPatient()
    {
        System.out.println("\nAdd new patient......... ");
          
        //Scanner to add patient information    
        Scanner sc = new Scanner(System.in);
       
        String name;
        int age = 0;
        String phoneNum;
        String condition;
        String address;
        
        //Adds patient information to the system
        System.out.println("Please enter the name of patient: ");
        name = sc.next();
        System.out.println("Please enter the age of patient: ");
        age = sc.nextInt();
        System.out.println("Please enter the patient condition: ");
        condition = sc.next();
        System.out.println("Please enter the phone number of the patient: ");
        phoneNum = sc.next();
        System.out.println("Please enter home address of the patient: ");
       	address =  sc.next();
       	
        patientSystem newPatient = new patientSystem(age,name,address,phoneNum,condition);
        
        return newPatient;
        
   
    }    
    
    //Displays the patient list
   public static void patientList(ArrayList<patientSystem> system)
    {
        System.out.println("\nPatient list.........");     
        
        ArrayList<patientSystem> patientList = system; 
        System.out.println(system.toString());
        
       
        int numberOfPatients = 0;
        int numberOfOAP = 0;
        
        //Enhanced For loop to count how many patients are in the list 
        for (patientSystem patient : patientList) 
        {
            numberOfPatients++;
        }
       
        //Enchanced for loop to count how many patients are over the age of 65
       for(patientSystem patient: patientList)
       {
        if(patient.getAge() >= 66 )
        {
           numberOfOAP++; 
        }

       }
        
        System.out.println("The number of patients in the list is: " + numberOfPatients );
        System.out.println("The number of patients over the age of 65 is: " + numberOfOAP );
 
      System.out.print("\nPlease press enter to return to menu ");
      String temp = keyboard.nextLine();    
        
    }     
    
    //Serch for a specfic patient
    public static void serchForPatient()
    {
        
      System.out.println("\nSerch for patient.........");  
        
       
//       for(patientSystem patient: patientList)
//       {
//           if(patient.getName().contains(search))
//           {
//               return patient.getName();
//           }
//           
//       }return "No patient found";
     

      System.out.print("\nPlease press enter to return to menu ");
      String temp = keyboard.nextLine();     
    }     
    
    //Edit the patients information
    public static void editPatientInfo()
    {
      System.out.println("\nEdit patient information.........");   
             
     
      
      
    //code
      
      
      
      System.out.print("\nPlease press enter to return to menu ");
      String temp = keyboard.nextLine();       
    }
    
    //Remove a patient information 
    public static void removePatientInfo()
    {
      System.out.println("\nRemove patient information........."); 
       



      //code




      
      System.out.print("\nPlease press enter to return to menu ");
      String temp = keyboard.nextLine();    
    }
    
    /**
     * Returns an int entered from the keyboard, limited to range [min - max]
     *
     * @param prompt String to prompt the user
     * @param min Minimum accepted input value
     * @param max Maximum accepted input value
     * @return user-entered integer value
     */
    public static int getInt(String prompt, int min, int max)
    {
        System.out.print(prompt);
        int value = keyboard.nextInt();
        while ((value < min) || (value > max))  // while outside range, re-enter
        {
            System.out.println("Invalid - [" + min + "," + max + "] only");
            System.out.print(prompt);
            value = keyboard.nextInt();
        }
        keyboard.nextLine(); // read up to end of line -> eliminate return
        return value;
    }       
}

