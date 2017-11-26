package day7and8;

import org.testng.annotations.Test;

public class LearnAnnonation2 {
	
	/*@Test(expectedExceptions=RuntimeException.class)
	public void createlead(){
		System.out.println("create lead");
		throw new RuntimeException();
	}
	@Test()
	public void editlead(){
		System.out.println("edit lead");
	}
	@Test(dependsOnMethods={"createlead"})
	public void deletelead(){
		System.out.println("delete lead");
	}*/
	
	@Test
	public void a(){
		System.out.println("a");
	}
	@Test(dependsOnMethods={"c"})
	public void b(){
		System.out.println("b");
	}
	@Test(dependsOnMethods={"a"})
	public void c(){
		System.out.println("c");
	}
	
	@Test()
	public void d(){
		System.out.println("d");
	}
}
