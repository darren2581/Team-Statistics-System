import java.io.*;
//Class SortGroup
public class SortGroup 
{
    //Method to be called with import of FileName and GroupSort
    public static Teams[] Analysis(String FileName, char GroupSort) 
    {
        //Try field
        try 
        {
            //Open file for Reading
            //Declare FileInputStream with object fileStream and parameter FileName + ".csv"
            FileInputStream fileStream = new FileInputStream(FileName +".csv");
            //Declare InputStreamReader with object isr and parameter fileStream
            InputStreamReader isr = new InputStreamReader(fileStream);
            //Declare BufferedReader with object bufRdr and parameter isr
            BufferedReader bufRdr = new BufferedReader(isr);
            //Declare line as String
            String line;
            //Declare the number of lines = 0
            int no = 0;
            //While statement
            while ((line = bufRdr.readLine()) != null) 
            {
                //Increment of number of line
                no++;
            }
            //Create an array to hold the teams
            Teams[] team = new Teams[no];
            //Initialize Teams with object Data
            Teams Data = new Teams();
            // To reset the file reader 
            fileStream.getChannel().position(0);
            //Declare integer i = 0
            int i = 0;
            //While Statement
            while ((line = bufRdr.readLine()) != null)
            {
                //Split the line into an arrayy of strings using a comma as the delimiter
                String[] Read = line.split(",");
                //Check if the array has exactly 5 elements
                if (Read.length == 5) 
                {
                    // Set the 'name' field of the 'Data' object to the first element
                    Data.setName(Read[0]);
                    // Set the 'code' field of the 'Data' object to the second element
                    Data.setCode(Read[1]);
                    // Parse the third element as an integer and set it as the 'goals' field
                    Data.setGoal(Integer.parseInt(Read[2].trim()));
                    // Parse the fourth element as an integer and set it as the 'noGoals' field
                    Data.setNoGoal(Integer.parseInt(Read[3].trim()));
                    // Extract the first character of the fifth element as a char and set it as the 'group' field
                    char group = Read[4].trim().charAt(0);
                    //Call method from Class Teams with object Data
                    Data.setGroup(group);
                    //Array team =Data
                    team[i] = Data;
                    //increment of i
                    i++;
                    //If statement for group = GroupSort
                    if (Data.getGroup() == GroupSort)
                    {
                        //Space one line
                        System.out.println();
                        //Show the teams name
                        System.out.println("Team Name: " + Data.getName());
                        //Show the team code
                        System.out.println("Team Code: " + Data.getCode());
                        //Show the Goals
                        System.out.println("Goals Scored by the Team: " + Data.getGoals());
                        //Show the No Goals
                        System.out.println("Goals Scored Against the Team: " + Data.getNoGoal());
                        //Show the group
                        System.out.println("Group: " + Data.getGroup());
                    }
                }
            }
            //If statement for group not equal to GroupSort
            if (Data.getGroup() != GroupSort)
            {
                //Space one line
                System.out.println();
                //Show Message
                System.out.println("Currently no data in this Group "+ GroupSort + " !!!");
            }
            return team;
        } 
        //Catch Field
        catch (IOException errorDetails) 
        {
            //Show Error Message
            System.err.println("Error in file processing: " + errorDetails.getMessage());
        }
        return null;
    }
}
