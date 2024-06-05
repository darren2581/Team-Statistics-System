//Class Teams
public class Teams
{
    //Private fields to store team data
    //Declare name and code as String
    private String name, code;
    //Declare goals, noGoals and netGoal as integer
    private int goals, noGoals, netgoal;
    private int totalgoal;
    //Declare group as char
    private char group;
    //Getter method for name field
    public String getName()
    {
        return name;
    } 
    //Setter method for name field
    public void setName(String name)
    {
        this.name = name;
    }
    //Getter method for code field
    public String getCode()
    {
        return code;
    } 
    //Setter method for code field
    public void setCode(String code)
    {
        this.code = code;
    }
    //Getter method for goals field
    public int getGoals()
    {
        return goals;
    } 
    //Setter method for goals field
    public void setGoal(int goals)
    {
        this.goals = goals;
    }
    //Getter method for NoGoals field
    public int getNoGoal()
    {
        return noGoals;
    } 
    //Setter method for noGoals field
    public void setNoGoal(int noGoals)
    {
        this.noGoals = noGoals;
    }
    //Getter method for group field
    public char getGroup()
    {
        return group;
    } 
    //Setter method for group field
    public void setGroup(char group)
    {
        this.group = group;
    }
    //Getter method for netgoal field
    public int getNetGoal()
    {
        return netgoal;
    }
    //Setter method for netgoal field
    public void setNetGoal(int netgoal)
    {
        this.netgoal = netgoal;
    }
    public int getTotalGoal()
    {
        return totalgoal;
    }
    public void setTotalGoal(int totalgoal)
    {
        this.totalgoal = totalgoal;
    }
}

