package studentinformation;

public class Student 
{
    private String Fname;
    private String gen;
    private String address;
    private String course;
    private String email;
    private int studnum;
	private int age;
	private int dob;
	private int contact;
	
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
	//Method 7: LeaDucusin
	public void getAge(int age)
	{
		this.age = age;
	}
	 public int showAge()
    {
        return age;
    }
	//Method 8: LeaDucusin
	public void getDateofBirth(int dob)
	{
		this.dob = dob;
	}
	 public int showDateofBirth()
    {
        return dob;
    }
	//Method 9: LeaDucusin
	public void getContact(int contact)
	{
		this.contact = contact;
	}
	 public int showcontact()
    {
        return contact;
    }
}
