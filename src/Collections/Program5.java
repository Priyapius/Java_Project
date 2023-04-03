package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Program5 {

	public static void main(String[] args) {

		HashMap<Integer,String> student =new HashMap<Integer,String>();

		student.put(1, "Abi");
		student.put(2, "Hari");
		student.put(3, "Bala");

		System.out.println(student);

		student.put(1, "Cathy");

		System.out.println(student);

		HashMap<Integer,String> newstudent =new HashMap<Integer,String>();

		newstudent.put(4, "Koki");
		newstudent.put(5, "Jeni");
		
		student.putAll(newstudent);

		System.out.println(student);

		System.out.println(student.keySet());
		
		System.out.println(student.values());
		
		System.out.println(student.entrySet());


		System.out.println(student.containsKey(5));
		
		System.out.println(student.containsKey(6));
		
		System.out.println(student.containsValue("Abi"));
		
		System.out.println(student.containsValue("Jeni"));

		System.out.println(student.size());
		
		System.out.println(student.isEmpty());
		
		student.clear();
		System.out.println(student);
		
		System.out.println(student.isEmpty());

		System.out.println(newstudent);
		for(Entry<Integer, String> newStu:newstudent.entrySet())
		{
			System.out.println(newStu.getKey()+" "+newStu.getValue());
		}

		for(String value:newstudent.values())
		{
			System.out.println(value);
		}
		
		for(Integer key:newstudent.keySet())
		{
			System.out.println(key)
			;
		}
	}
	

}
