import java.util.Scanner;
//Class Program2
public class Program2 
{
    //The Main of Program2
    public static void main(String[] args)
    {
        //Initialize Scanner with object named input
        Scanner input = new Scanner(System.in);
        //Declare Analysis and exit as char
        char Analysis, exit;
        //Declare FileName as String
        String FileName;
        //Show title of the Program
        System.out.println("Welcome to the FIFA WWC Analysis Program");
        //Space one line
        System.out.println();
        //Ask user to enter the name of the file
        System.out.print("Enter the name of the file containing the data: ");
        //Allow user to input the name of the file
        FileName = input.nextLine();
        //while statement to see if the name input is empty
        while (FileName.isEmpty()) 
        {
            //Show error message
            System.out.println("Empty Input. Please Re-enter");
            //Ask user to enter the name of the file
            System.out.print("Enter the name of the file containing the data: ");
            //Allow user to input the name of the file
            FileName = input.nextLine();
        } 
        //Space one line
        System.out.println();
        //Do while loop
        do
        {
            //Ask user to choose option
            System.out.println("An Overall analysis (O) or Group analysis (G)? ");
            //Allow user input answer
            Analysis = input.next().charAt(0);
            //Space one line
            System.out.println();
            //If statement for Analysis is 'O' or 'o'
            if(Analysis == 'O' || Analysis == 'o')
            {
                //Create an object data from class SortGoal
                SortGoal data = new SortGoal();
                //Use object data to call method Analysis from class SortGoal
                data.Analysis(FileName);
            }
            //Else if statement for Analysis is 'G' or 'g'
            else if(Analysis == 'G' || Analysis == 'g')
            {
                //Declare GroupSort as char
                char GroupSort;
                //Space one line
                System.out.println();
                //Ask user to input group
                System.out.print("Enter the Group: ");
                //Allow user to input Group
                GroupSort = input.next().charAt(0);
                //While loop for GroupSort is not A,B,C,D,a,b,c, and d
                while (GroupSort != 'A' && GroupSort != 'B' && GroupSort != 'C' && GroupSort != 'D' && GroupSort != 'a' && GroupSort != 'b' && GroupSort != 'c' && GroupSort != 'd')
                {
                    //Show Error message
                    System.out.print("Invalid Group! Please Re-enter group (A,B,C,D): ");
                    //Allow user to input Group
                    GroupSort = input.next().charAt(0);
                }
                //If statement for Group is a,b,c and d
                if(GroupSort == 'a' || GroupSort == 'b' || GroupSort == 'c' || GroupSort == 'd')
                {
                    //Declare LowerCase as char
                    char LowerCase;
                    //Declare ASCII as integer
                    int ASCII;
                    //ASCII become GroupSort - 32
                    ASCII = GroupSort - 32;
                    //LowerCase becomes Char ASCII
                    LowerCase = (char)ASCII;
                    //Let GroupSort become LowerCase
                    GroupSort = LowerCase;
                }
                //Create an object data from class SortGroup
                SortGroup data = new SortGroup();
                //Call method Analysis with object data from class SortGroup with import FileName and GroupSort
                data.Analysis(FileName, GroupSort);
            }
            //Else Statement
            else 
            {
                //Do while loop
                do
                {
                    //Space one line
                    System.out.println();
                    //Show Error message
                    System.out.println("Invalid Analysis! Please re-enter...");
                    //Ask user to enter choice
                    System.out.print("An Overall analysis (O) or Group analysis (G)? ");
                    //Allow user to input choice
                    Analysis = input.next().charAt(0);
                    //If statement for Analysis is O or o
                    if(Analysis == 'O' || Analysis == 'o')
                    {
                        //Create an object data from from class SortGoal
                        SortGoal data = new SortGoal();
                        //Call method Analysis with object data from class SortGoal with import FileName
                        data.Analysis(FileName);
                    }
                    //If Statement for Analysis is G or g
                    if(Analysis == 'G' || Analysis == 'g')
                    {
                        //Declare GroupSort as char
                        char GroupSort;
                        //Spcae one line
                        System.out.println();
                        //Ask user to input group
                        System.out.print("Enter the Group: ");
                        //Allow user to input group
                        GroupSort = input.next().charAt(0);
                        //While Loop for GroupSort is not A,B,C,D,a,b,c, and d
                        while (GroupSort != 'A' && GroupSort != 'B' && GroupSort != 'C' && GroupSort != 'D' && GroupSort != 'a' && GroupSort != 'b' && GroupSort != 'c' && GroupSort != 'd')
                        {
                            //Show error message
                            System.out.print("Invalid Group! Please Re-enter group (A,B,C,D): ");
                            //Allow user to input group
                            GroupSort = input.next().charAt(0);
                        }
                        //If statement for GroupSort is a,b,c or d
                        if(GroupSort == 'a' || GroupSort == 'b' || GroupSort == 'c' || GroupSort == 'd')
                        {
                            //Declare LowerCase as char
                            char LowerCase;
                            //Declare ASCII as integer
                            int ASCII;
                            //ASCII become GroupSort - 32
                            ASCII = GroupSort - 32;
                            //LowerCase becomes Char ASCII
                            LowerCase = (char)ASCII;
                            //Let GroupSort become LowerCase
                            GroupSort = LowerCase;
                        }
                        
                        SortGroup data = new SortGroup();
                        data.Analysis(FileName, GroupSort);
                    }
                //End Do while loop
                }while (Analysis != 'o' && Analysis != 'O' && Analysis != 'G' && Analysis != 'g');
            }
            //Space one line
            System.out.println();
            //Ask user to input choice
            System.out.println("Would you like to exit? <Y or N> ");
            //Allow user to input choice
            exit = input.next().charAt(0);
            //While loop for exit is not Y,y.N and n
            while(exit != 'Y' && exit != 'y' && exit != 'N' && exit != 'n')
            {
                //Show Error Message
                System.out.println("Invalid Choice. Please re-enter only <Y or N>");
                //Allow user to input choice
                exit = input.next().charAt(0);
            }
            //Space one line
            System.out.println();
        //End Do while loop
        }while(exit != 'Y' && exit != 'y');
        //Space one line
        System.out.println();
        //Thank user for using program
        System.out.println("Thank you for using ouor program!!!");
    }
}

