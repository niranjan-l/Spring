package collections;

import java.util.Comparator;

public class Employe implements Comparable<Employe> {

	String name;
	int id;
	String company;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + "]";
	}

	
	public static int compared(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		
		
		return o2.id-o1.id;
	}



	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		Employe emp = (Employe) o;
		
		return this.id-emp.id ;
		
	}
	
	
 
}
