package com.basicpractivejavanov;

public class reverseofeachword {
	public static void main(String[] args) {
		//input://mounika alla
		//output://akinuomalla
		String s="mounika alla";
		
		String[] split = s.split(" ");
		String op="";
	//	System.out.println(split);
		for(String h:split) {
			String rev="";
		//System.out.println(h);
	
		for(int i=h.length()-1;i>=0;i--) {
			rev=rev+h.charAt(i);

	}
		op=op+rev+" ";
		}
		//System.out.println(op);
//		rev=rev+op;
		System.out.print(op);

}
}

