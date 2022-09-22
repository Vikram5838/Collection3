package col3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Vikram",242,true,20,"worker");
		Employee e2=new Employee("Vikram",242,true,21,"worker1");
		Employee e3=new Employee("Vikram",242,true,22,"worker5");
		Employee e4=new Employee("Vikram",242,true,23,"worker9");
		Employee e5=new Employee("Vikram",242,true,24,"worker88");
		Employee e6=new Employee("Vikram",242,true,25,"worker56");
		Employee e7=new Employee("Vikram",242,true,26,"worker8");
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		
		//List<String> a=emp.stream().filter(x->x.getAge()>19).map(x->x.getName()).collect(Collectors.toList());
		
		Map<Integer,Employee> b=emp.stream().filter(x->x.getAge()>20).collect(Collectors.toMap(x->x.getAge(), y->y));
		System.out.println(b);
		//Map<Integer,Employee> b=emp.stream().filter(x->x.getAge()>max==x.getAge()).collect(Collectors.toMap(x->x.getAge(), y->y));
	}

}
