package studentinformation;

public class Student 
{
    private String Fname;
    private String gen;
    private String address;
    private String course;
    private String email;
    private int studnum;

    //Method 1:DarleneVallejos
    public void getFname(String Fname)
    {
        this.Fname = Fname;
    }
 
    public String showFname()
    {
        return Fname;
    }
    
    //Method 2: DarleneVallejos
    public void getStudGender(String gen)
    {
        this.gen = gen;
    }
    
    public String showStudGender()
    {
        return gen;
    }
    
    //Method 3:DarleneVallejos
     public void getAdress(String address)
    {
        this.address = address;
    }
    
    public String showAddress()
    {
        return address;
    }
    //Method 4:DayneDelgado
    public void getCourse(String course)
    {
        this.course = course;
    }
    
    public String showCourse()
    {
        return course;
    }
   
    //Method 5:DayneDelgado
    public void getEmail(String email)
    {
        this.email = email;
    }
    
    public String showEmail()
    {
        return email;
    }
    
    //Method 6: DayneDelgado
    public void getStudentNo(int studnum)
    {
        this.studnum = studnum;
    }
    
    public int showStudentNo()
    {
        return studnum;
    }
}
