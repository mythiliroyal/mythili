package amazon;

public class Employee 
{
	private int id;
	private String name;
	private Employee manager;
	private Department dept;
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
public static void main(String[] args)
{
	Employee manager=new Employee(102,"mythu");
	Employee clerk=new Employee(105,"lalli");
	clerk.setManager(manager);
	Department office=new Department(50,"office");
	clerk.setDept(office);
	display(clerk);
}
	
	
	



private static void display(Employee clerk) {
	// TODO Auto-generated method stub
	

	System.out.println(clerk.getId());
	System.out.println(clerk.getName());
	System.out.println(clerk.getManager().getName());
}
	
	
}
