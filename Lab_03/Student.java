package Lab_03;

public class Student
{
    //Instance variables
    private String firstName;
    private String lastName;
    private String major;
    double gpa;
    private int uin;
    private String netID;
    private int age;
    private String gender;
    
    //Constructor Methods
    public Student(String string)
    {
        firstName = " ";
        lastName = " ";
        major = " ";
        gpa = 0;
        uin = 0;
        netID = " ";
        age = 0;
        gender = " ";
    }
    
    public Student(String fn, String ln, String mj, double gpa, int uin, String nid, int age, String gen)
    {
    	firstName = fn;
    	lastName = ln;
    	major = mj;
        this.gpa = gpa;
        this.uin = uin;
        netID = nid;
        this.age = age;
        gender = gen;
    }
    
    //Mutator methods
    public void setFirstName (String fn)
    {
        firstName = fn;
    }
    
    public void setLastName (String ln)
    {
    	firstName = ln;
    }
    
    public void setMajor (String mj)
    {
        major = mj;
    }
    
    public void setGPA (double gpa)
    {
        this.gpa = gpa;
    }
    
    public void setUIN (int uin)
    {
        this.uin = uin;
    }
    
    public void setNedID (String nid)
    {
        netID = nid;
    }
    
    public void setAge (int age)
    {
        this.age = age;
    }
    
    public void setGender(String gen)
    {
        gender = gen;
    }
        
    //Accessor methods
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    
    public int getUIN()
    {
        return uin;
    }
    
    public String getNetID()
    {
        return netID;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getGender()
    {
        return gender;
    }
        
    //Other methods
    public String toString()
    {
        String str;
        str = "First Name ...:     " + firstName + "\n" +
              "Last Name ....:     " + lastName + "\n" +
              "Major ........:     " + major + "\n" +
              "GPA ..........:     " + gpa + "\n" +
              "UIN ..........:     " + uin + "\n" +
              "NetID ........:     " + netID + "\n" +
              "Age ..........:     " + age + "\n" +
              "Gender .......:     " + gender + "\n";
        return str;
    }
}
