package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EqualsEX {

	public static void main(String[] args) {
		Employe e1 = new Employe();
		e1.id = 20;
		Employe e2 = new Employe();
		e2.id = 21;

		Employe e3 = new Employe();
		e3.id = 22;
		Employe e4 = new Employe();
		e4.id = 23;

		if (e1.equals(e2)) {
			System.out.println("equal");
		}

		List<Employe> aList = new ArrayList<Employe>();

		aList.add(e4);
		aList.add(e1);
		aList.add(e2);
		aList.add(e3);

		System.out.println(aList);
		Collections.sort(aList);
		//Collections.sort(aList,Employe.compared(o1, o2));
		
		System.out.println(aList);
	}
}
