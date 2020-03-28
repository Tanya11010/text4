package Student_Manage;

public class student_information {
	private String stuID;    /*  学生学号  */
	private String name;     /* 学生姓名 */
	private String sex;     /* 学生性别  */
    private String age;        /*  学生年龄  */
    private String callnumber;   /* 学生电话号码   */
    private String home_place;   /* 学生家庭住址，籍贯 */
    private String tiwen;   /* 体温 */
    
    /*无参构造函数*/
    public student_information() {
    
    }
    /*有参构造函数 */
    public student_information(String stuID,String name,String sex,String age,String callnumber,String home_place,String tiwen) {
    	super();
    	this.stuID=stuID;
    	this.name=name;
    	this.sex=sex;
    	this.age=age;
    	this.callnumber=callnumber;
    	this.home_place=home_place;
    	this.tiwen=tiwen;
    }
    public String getStuID() {
    	return this.stuID;
    }
    public void setStuID(String stuID) {
    	this.stuID=stuID;
    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getSex() {
    	return this.sex;
    }
    public void setSex(String sex) {
    	this.sex=sex;
    }
    
    public String getAge() {
    	return this.age;
    }
    public void setAge(String age) {
    	this.age=age;
    }
    
    public String getCallnumber() {
    	return this.callnumber;
    }
    public void setCallnummber(String callnumber) {
    	this.callnumber=callnumber;
    }
    
    public String getHome_place() {
    	return this.home_place;
    }
    public void setHome_place(String home_place) {
    	this.home_place=home_place;
    }
    
    public String gettiwen() {
    	return this.tiwen;
    }
    public void settiwen(String tiwen) {
    	this.tiwen=tiwen;
    }
    
    //从文件中录入的数据格式    "学号  姓名  性别  年龄  电话号码  家庭住址  体温"  
    public String fileString()
	{
		return stuID+" "+name+" "+sex+" "+age+"  "+callnumber+"  "+home_place+"  "+tiwen;
	}

   
}

