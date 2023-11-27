package com.basicpractivejavanov;

public class immutable {
	public static void main(String[] args) {
		
	
	String s1="mounika";
	s1.concat("alla");
System.out.println(s1);
s1=s1.concat("alla");
System.out.println(s1);

	// string is immutable if we try to change that one it will not change
//if we use any methods like concat or something it will create a new string but original was not changed.

}
}
