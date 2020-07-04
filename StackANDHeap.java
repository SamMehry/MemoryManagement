package MemoryManagement;

public class StackANDHeap {

	public static void main(String[] args) {


		String st1 = "Test";
		String st2 = "Test";
		String st3 = new String ("Test");
		
		System.out.println("__________using the ==___________");
		//compares the object reference variable address in stack
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		
		System.out.println("__________using the .equals_______");
		//compares the objects in the heap
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
		
		
	}

}
