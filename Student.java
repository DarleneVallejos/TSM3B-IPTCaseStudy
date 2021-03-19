package studentinformation;

public class Student 
{
    private String Fname;
    private String gen;
    private String address;

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
}
