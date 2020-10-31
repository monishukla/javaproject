package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int Marks, RollNo;
	String Name;
	public Stud(int RollNo, int Marks, String Name) {
		this.RollNo = RollNo;
		this.Marks = Marks;
		this.Name = Name;
	}
	
	public String toString() {
		return "[RollNo ="+RollNo+", Marks ="+Marks+", Name = "+Name+"]";
		
	}
		
	public int compareTo(Stud s) {
		return Marks>s.Marks?1:-1;
	}
	}


public class ComparableDemo {
	public static void main(String[] args) {
		List<Stud> stud = new ArrayList<>();
		stud.add(new Stud(23, 50,"Manisha Shukla"));
		stud.add(new Stud(24, 60,"Pranav Kumar"));
		stud.add(new Stud(53, 70,"Ritvick Singh"));
		
		//Collections.sort(stud);
		
		Collections.sort(stud,(i,j)->i.Name.length()>j.Name.length()?1:-1);
		
		for(Stud s : stud) {
			System.out.println(s);
		}
	}

}

 
