package col3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(598);
		num.add(557);
		num.add(888);
		num.add(687);
		num.add(657);
		num.add(578);
		num.add(598);
		num.add(158);
		num.add(678);
		num.add(365);
		//num.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		List<Integer> a=num.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(a);
		Long numC=num.stream().filter(x->x%2==0).count();
		System.out.println(numC);
	}

}
