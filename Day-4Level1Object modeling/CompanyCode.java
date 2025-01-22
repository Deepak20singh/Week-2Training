import java.util.*;

class Company{
private String name;
private ArrayList<Department> dept=new ArrayList<Department>(); // storing department objects

Company(String name){
this.name=name;
this.dept=new ArrayList<>(); 
}
// adding department

public void addDept(String d){
dept.add(new Department(d));
}


public void setterEmp(String dName, String eName){

for(Department d:dept){

if(dName.equals(d.name)){
d.addEmp(eName);

}

}

}

// calling display method in department

public void showDetails(){
System.out.println("Company: "+name);
for(Department d:dept){

d.show();

}
}

}

// creating Department class
class Department{
private ArrayList <Employee> emp=new ArrayList<Employee>(); // storing employee objects

public String name; // department name

Department(String name){
this.name=name;
this.emp=new ArrayList<>();
}

public void addEmp(String obj){
emp.add(new Employee (obj));
}

// display method to show name of emp and department
public void show(){

System.out.println("Department :"+name);
for(Employee s:emp){
System.out.println("Employee: "+s.getName());
}

}


}

// crearting employee class
class Employee{

private String name;

Employee(String name){
this.name=name;
}

// method to display name
public String getName(){
return name;
}

}

public class CompanyCode{

public static void main(String args[]){

Company c=new Company("Capgemini");

c.addDept("Developer");
c.addDept("HR");

// adding employess 
c.setterEmp("Developer", "Deepak");
c.setterEmp("HR", "Ravi");

c.showDetails();

}

}
