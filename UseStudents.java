package col3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudents {
	public static void main(String[] args) {
		Students s1=new Students("Vikram",456,true,18);
		Students s2=new Students("Raj",457,true,19);
		Students s3=new Students("Kumar",458,true,17);
		Students s4=new Students("Vinoth",459,true,19);
		Students s5=new Students("divya",460,false,20);
		Students s6=new Students("Manoj",461,true,19);
		Students s7=new Students("usha",462,false,18);
		Students s8=new Students("Lenin",463,true,19);
		Students s9=new Students("preetha",464,false,20);
		Students s10=new Students("Karthik",465,true,20);
		Students s11=new Students("sowmya",466,false,18);
		Students s12=new Students("Praveen",467,true,17);
		
		ArrayList<Students> stds=new ArrayList<>();
		stds.add(s1);
		stds.add(s2);
		stds.add(s3);
		stds.add(s4);
		stds.add(s5);
		stds.add(s6);
		stds.add(s7);
		stds.add(s8);
		stds.add(s9);
		stds.add(s10);
		stds.add(s11);
		stds.add(s12);
		//stds.stream().filter(x->x.getAge()>18).forEach(x->System.out.println(x));
		List<Students> datas=stds.stream().filter(x->x.getAge()>18).collect(Collectors.toList());
		System.out.println(datas);
		Long c=stds.stream().filter(x->x.getAge()>18).count();
		System.out.println(c);
		List<String>na=stds.stream().filter(x->x.getAge()>18).map(x->x.getName()).collect(Collectors.toList());System.out.println(na);
		//System.out.println(na);
	}

}
