import java.io.*;
//Class Printwriter
public class Printwriter 
{
    //Method of the class to be called with import of FileName,name,code,scoredbyteam,scoredagteam and group
    public static void Input(String FileName, String name, String code, int scoredbyteam, int scoredagteam, char group) 
    {
        //Declare FileOutputStream with object fileStrm as null
        FileOutputStream fileStrm = null;
        //Declare PrintWriter with object pw
        PrintWriter pw;
        //Try field
        try 
        {
            //Allow fileStrm to write to the file by creating a CSV file with Filename
            fileStrm = new FileOutputStream(FileName + ".csv", true);
            // Create a PrintWriter to write data to the file represented by fileStrm
            pw = new PrintWriter(fileStrm);
            //Write the name, code, goals, goals against and group to the CSV file
            pw.println(name + ", " + code + ", " + scoredbyteam + ", " + scoredagteam + ", " + group);
            //Close pw
            pw.close();
        } 
        //catch field
        catch (IOException e) 
        {
            //Show Error Message
            System.out.println("Error: " + e.getMessage());
        } 
    }
}

