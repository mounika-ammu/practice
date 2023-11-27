package com.basicpractivejavanov;

public class Stringjavaprograms { 
	public static void main(String[] args) {
		String s1="cat";
		String s2="cat";
		String s3="dog";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//(== operator will check the reference )
		System.out.println(s1.equals(s2));//(.equals will check the content  )
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		//we can create string by using two objects
		//1.one is literal
		//2.new keyward
	// literal is nothing but by using quotes ex: String s1="monika";
	// new keyward means by using new ex: String s=new String("mounika")
		// Examples
		
		
		String s=new String("mounika");
		String s4=new String("mounika");
		
		System.out.println(s==s4);
		System.out.println(s.equals(s4));
		
		
		
	}
	

}
