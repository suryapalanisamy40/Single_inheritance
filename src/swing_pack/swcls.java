package swing_pack;
// parent class 
class student{
	int rollNo;
	String name;
	
	student(int rol,String na){
		
		rollNo=rol;
		name=na;
	}
}

// child class
class result extends student{
	int m1,m2,m3,sum;

	result(int rol,String name){
		super(rol,name);
	}
	
	void get(int mk1,int mk2,int mk3){
		m1=mk1;
		m2=mk2;
		m3=mk3;
	}
	
	void find()
	{
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+ name);
		System.out.println("------------------- ");
		
		if(m1>=35)
			System.out.println("M1 pass");
		else 
			System.out.println("M1 Fail");
		
		if(m2>=35)
			System.out.println("M2 pass");
		else 
			System.out.println("M2 Fail");
		
		if(m3>=35)
			System.out.println("M3 pass");
		else 
			System.out.println("M3 Fail");
	}	
}

// Main class
public class swcls {
	public static void main(String[] args) {
		result rel=new result(22,"kirubakaran");
		rel.get(70,8,47);
		rel.find();
	}
}
