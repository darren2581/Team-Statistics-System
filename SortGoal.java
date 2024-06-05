import java.io.*;
//Class SortGoal
public class SortGoal 
{
    //Method to be called with Import of FileName
    public static Teams[] Analysis(String FileName) 
    {
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
                //increament of number of line
                no++;
            }
            //Create an array to hold the teams
            Teams[] team = new Teams[no]; 
            //Create an array to hold net goals
            int[] netGoals = new int[no]; 
            //Create an array to hold total goals
            int[] totalGoals = new int[no];
            // To reset the file reader
            fileStream.getChannel().position(0);

            int i = 0;
            Teams Data = new Teams();
            while ((line = bufRdr.readLine()) != null) 
            {
                String[] Read = line.split(",");
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
                    int netgoal = Data.getGoals() - Data.getNoGoal();
                    int totalgoal = Data.getGoals();
                    Data.setNetGoal(netgoal);
                    Data.setTotalGoal(totalgoal);
                    team[i] = Data;
                    netGoals[i] = netgoal;
                    totalGoals[i] = totalgoal;
                    i++;
                    //Space one line
                    System.out.println();
                    //Show the teams name
                    System.out.println("Team Name: " + Data.getName());
                    //Show the team code
                    System.out.println("Team Code: " + Data.getCode());
                    //Show the Goals
                    System.out.println("Goals Scored by the Team: " + Data.getGoals());
                    //Show the NoGoals
                    System.out.println("Goals Scored Against the Team: " + Data.getNoGoal());
                    //Show the Group
                    System.out.println("Group: " + Data.getGroup());
                    //Show the netgoal
                    System.out.println("Net Goals: " + Data.getNetGoal());
                    //Show the totalgoal
                    System.out.println("Total Goals: " + Data.getTotalGoal());
                }
            }
            //Call method SortNetGoal and import netGoals
            SortNetGoal(netGoals);
            //Call method SortTotalGoal and import totalGoals
            SortTotalGoal(totalGoals);
            return team;
        } 
        //Catch field
        catch (IOException errorDetails) 
        {
            //Show error Message
            System.err.println("Error in file processing: " + errorDetails.getMessage());
        }
        return null;
    }
    //Method to be Called with inport or array of netGoals for sorting
    public static void SortNetGoal(int[] netGoals) 
    {
        //Declare n as integer and become the length of the array netGoals
        int n = netGoals.length;
        //For statement Declare i as integer = 0 and less than n and increment of i
        for (int i = 0; i < n - 1; i++) 
        {
            //For statement Declare j as integer = 0 and less than (n-i-1) and increment of j
            for (int j = 0; j < n - i - 1; j++) 
            {
                //If Statement
                if (netGoals[j] < netGoals[j + 1]) 
                {
                    //Declare temp as integer 
                    int temp = netGoals[j];
                    netGoals[j] = netGoals[j + 1];
                    netGoals[j + 1] = temp;
                }
            }
        }
        //Space one line
        System.out.println();
        //Show message
        System.out.println("Sorted Net Goals in Descending Order:");
        //For loop according the the length of array og netGoals
        for (int x = 0; x < netGoals.length; x++)
        {
            //Show the Net goal in descending order
            System.out.println("Net Goals: " + netGoals[x]);
        }
    }
    public static void SortTotalGoal(int[] totalGoals) 
    {
        //Declare n as integer and become the length of the array netGoals
        int n = totalGoals.length;
        //For statement Declare i as integer = 0 and less than n and increment of i
        for (int i = 0; i < n - 1; i++) 
        {
            //For statement Declare j as integer = 0 and less than (n-i-1) and increment of j
            for (int j = 0; j < n - i - 1; j++) 
            {
                //If Statement
                if (totalGoals[j] < totalGoals[j + 1]) 
                {
                    //Declare temp as integer 
                    int temp = totalGoals[j];
                    totalGoals[j] = totalGoals[j + 1];
                    totalGoals[j + 1] = temp;
                }
            }
        }
        //Space one line
        System.out.println();
        //Show message
        System.out.println("Sorted Total Goals in Descending Order:");
        //For loop according the the length of array og totalGoals
        for (int x = 0; x < totalGoals.length; x++)
        {
            //Show the total goal in descending order
            System.out.println("Total Goals: " + totalGoals[x]);
        }
    }
}

