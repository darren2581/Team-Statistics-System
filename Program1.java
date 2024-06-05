import java.util.*;
import java.util.Scanner;
//Class Program1
public class Program1 
{
    //The Main for Program1
    public static void main(String[] args)
    {
        //Declare Moredata and DataNo as char
        char MoreData, DataNo;
        //Declare FileName as String
        String FileName;
        //Initialize Scanner with object named input
        Scanner input = new Scanner(System.in);
        //Create object Reader to call from class Retrieval
        Retrieval Reader = new Retrieval();
        //Space one line
        System.out.println();
        //Show title of the Program
        System.out.println("Welcome to the FIFA FIFA Women's World Cup(WWC) Data Entry Program ");
        //Space one line
        System.out.println();
        //Ask the user the name for the CSV file
        System.out.print("What would you like to name you CSV file? ");
        //Allow user to input their desired File Name
        FileName = input.nextLine();
        //Space one line
        System.out.println();
        //Ask the user the number of team data that he will be key in into the system
        System.out.print("How many teams' data are you planning to enter? ");
        //Allow user to input the number of teams he would like to key in
        DataNo = input.next().charAt(0);
        //Space one line
        System.out.println();
        //Call method Input with import of Filename and DataNo 
        Input(FileName, DataNo);
        //Make char DataNo into integer and execute when DataNo >= 58 or DataNo <=48
        while((int)DataNo <= 48 || (int)DataNo >= 58)
        {
            //Show error message
            System.out.print("Invalid Number of Teams' data. Please re-enter TQ: ");
            //Allow user to input the number of teams he would like to key in
            DataNo = input.next().charAt(0);
            //Call method Input with import of Filename and DataNo
            Input(FileName, DataNo);
        }
        //Do while loop
        do
        {
            //Space one line
            System.out.println();
            //Ask the user if wants to key in more data
            System.out.print("Would you like to enter more data (Y or N)? ");
            //Allow user to input Y or N
            MoreData = input.next().charAt(0);
            //If statement if users want to key in more data
            if(MoreData == 'Y' || MoreData == 'y')
            {
                //Use object called Reader to call method in class Retrieval called Output with import of FileName
                Reader.Output(FileName);
                //Ask user how many teams he want to key in
                System.out.print("How many teams' data are you planning to enter? ");
                //Allow user to input the number of teams he would like to key in
                DataNo = input.next().charAt(0);
                Input(FileName, DataNo);
                //Make char DataNo into integer and execute when DataNo >= 58 or DataNo <=48
                while((int)DataNo <= 48 || (int)DataNo >= 58)
                {
                    //Show error message
                    System.out.print("Invalid Number of Teams' data. Please re-enter TQ: ");
                    //Allow user to input the number of teams he would like to key in
                    DataNo = input.next().charAt(0);
                    //Call method Input with import of Filename and DataNo
                    Input(FileName, DataNo);
                }
            }
            //Else if statement if users do not want to key in more data
            else if(MoreData == 'N' || MoreData == 'n')
            {
                //Space one line
                System.out.println();
                //Tell the user that all data has been saved
                System.out.println("All data has been saved to our System.");
                //Thank the user for using the Program
                System.out.println("Thank you for using our Program :)");
                //Space one line
                System.out.println();
            }
            //Else statement if users input is not Y or N
            else
            {
                // while stalement if user input is not Y or N and it repeat
                while(MoreData != 'Y' && MoreData != 'y' && MoreData != 'N' && MoreData != 'n')
                {
                    //Show error message
                    System.out.println("Invalid Input!!! Please enter Y or N");
                    //Ask the user to re-enter a valid input
                    System.out.print("Would you like to enter more data (Y or N)? ");
                    //Allow user to input if want to key in more data or not
                    MoreData = input.next().charAt(0);
                    //If statement if user inputs want to input more data or do not want to input more data
                    if(MoreData == 'Y' || MoreData == 'y' || MoreData == 'N' || MoreData == 'n')
                    {
                        //If statement if users want to key in more data
                        if(MoreData == 'Y' || MoreData == 'y')
                        {
                            //Ask the user the number of team data that he will be key in into the system
                            System.out.print("How many teams' data are you planning to enter? ");
                            //Allow user to input the number of teams he would like to key in
                            DataNo = input.next().charAt(0);
                            //Call method Input with import of Filename and DataNo
                            Input(FileName, DataNo);
                            //Make char DataNo into integer and execute when DataNo >= 58 or DataNo <=48
                            while((int)DataNo <= 48 || (int)DataNo >= 58)
                            {
                                //Show error message
                                System.out.print("Invalid Number of Teams' data. Please re-enter TQ: ");
                                //Allow user to input the number of teams he would like to key in
                                DataNo = input.next().charAt(0);
                                //Call method Input with import of Filename and DataNo
                                Input(FileName, DataNo);
                            }
                        }
                        //Else if statement if users do not want to key in more data
                        if(MoreData == 'N' || MoreData == 'n')
                        {
                            //Space one line
                            System.out.println();
                            //Tell the user that all data has been saved
                            System.out.println("All data has been saved to our System.");
                            //Thank the user for using the Program
                            System.out.println("Thank you for using our Program :)");
                            //Space one line
                            System.out.println();
                        }
                    }
                }
            }
        //End of Do while loop
        }while(MoreData != 'N' && MoreData != 'n');
    }
    //Method which need import of FileName and DataNo to execute
    public static void Input(String FileName, char DataNo)
    {
        //For loop statement to show items in loop for the number of DataNo the user keys in
        for(int i=0; i < ((int)DataNo-48); i++)
        {
            //Declare name and code as String
            String name, code;
            //Declare Goals by Team and Goals againts Team as integer
            int scoredbyteam, scoredagteam;
            //Decalre group as char
            char group;
            //Initialize Scanner with object named input
            Scanner input = new Scanner(System.in);
            //Ask user for the team name
            System.out.print("Team Name: ");
            //Allow user to key in team name
            name = input.nextLine();
            //while statement to see if the name input is empty
            while (name.isEmpty()) 
            {
                //Show error message
                System.out.print("Empty Input. Please Re-enter Team Name: ");
                //Allow user to key in team name
                name = input.nextLine();
                //Space one line
                System.out.println();
            } 
            //Ask user to key in Team code
            System.out.print("Team Code: ");
            //Allow user to input team code
            code = input.nextLine();
            //while statement to see if the code input is empty
            while (code.isEmpty()) 
            {
                //Show error message
                System.out.print("Empty Input. Please Re-enter Team Code: ");
                //Allow user to input team code
                code = input.nextLine();
                //Space one line
                System.out.println();
            } 
            //Ask user to key in goals scored by the team
            System.out.print("Goals Scored by the Team: ");
            //Allow user to input goals scored by the team
            scoredbyteam = Integer.parseInt(input.nextLine());
            //Ask user to key in goals scored againts the team
            System.out.print("Goals Scored Against the Team: ");
            //Allow user to input goals scored againts the team
            scoredagteam = Integer.parseInt(input.nextLine());
            //Ask user to key in the group
            System.out.print("Group (A,B,C,D): ");
            //Allow user to input group
            group = input.next().charAt(0);
            //While Statement to see if group is not equal to a,b,c,d,A,B,C and D
            while (group != 'A' && group != 'B' && group != 'C' && group != 'D' && group != 'a' && group != 'b' && group != 'c' && group != 'd')
            {
                //Show error message
                System.out.print("Invalid Group! Please Re-enter group (A,B,C,D): ");
                //Allow user to input group
                group = input.next().charAt(0);
            }
            //If statement to see if group is equal to either a ,b, c or d
            if(group == 'a' || group == 'b' || group == 'c' || group == 'd')
            {
                //Declare LowerCase as char
                char LowerCase;
                //Declare ASCII as integer
                int ASCII;
                //Let ASCII be group minnus 32
                ASCII = group - 32;
                //Let LowerCase be char or ASCII
                LowerCase = (char)ASCII;
                //Let group become LowerCase
                group = LowerCase;
            }
            //Space one line
            System.out.println();
            //Use object called Printwriter to call method in class Printwriter called Input
            //With import of FileName,name,code,scoredbyteam,scoredagteam and group
            Printwriter.Input(FileName,name,code,scoredbyteam,scoredagteam,group);
        }
    }
}

