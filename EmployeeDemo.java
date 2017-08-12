package assignment19;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
  //created class employee
	   
	    private String name; //created variables
	 
	    private long salary;

	    public String getName() {
	        return name;
	    }

	    public long getSalary() {
	        return salary;
	    }

	    public Employee( int salary,  String name) {
	        
	        this.name = name;
	       
	        this.salary = salary;
	    }

	    
	    public String toString() {
	        return   " name=" + this.name +  " salary =" + this.salary;
	    }
     


	  public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    
	        };
	    
}
class EmployeeComparator implements Comparator<Employee>{
	  public int compare (Employee o1,Employee o2){
		  if (o1.getSalary()> o2.getSalary())
			  return 1;
		  else return 1;
		  }
	  }


          public class EmployeeDemo{
	         public static void main (String []args){
		
		
            PriorityQueue<Employee> queuelist = new PriorityQueue<Employee>();
//created priority queue object list and implemented objects in the class

            queuelist.add(new Employee(30000,"uma")); 
        	queuelist.add(new Employee(70000,"satya"));
        	queuelist.add(new Employee(20000,"swapna"));
        	queuelist.add(new Employee(40000,"ramya"));
        	queuelist.add(new Employee(10000,"sirisha"));
        	queuelist.add(new Employee(50000,"rekha"));
        	

        	for (Employee employee : queuelist){
        		System.out.println(employee);
        	}

	}
          }


