package com.epam.JunitTDD;

public class Removing_AA {
	public String StringRefactor(String str) {
		int len=str.length();
		if(len==0) {
			str="";
		}
		else if(len==1) {
			if(str.charAt(0)=='A') {
				str="";
			}
		}
		else {
			String str1;
			String str2;
			if(len==2) {
			str1=str.substring(0, 2);
			str2="";
			}
			else {
				str1=str.substring(0, 2);
				str2=str.substring(2, len);
			}
			String result="";
			if(str1.charAt(0)!='A') {
				result+=str.charAt(0);
			}
			if(str1.charAt(1)!='A') {
				result+=str.charAt(1);
			}
			str=result+str2;
		}
		
		System.out.println(str);
		return str;
		
	}
}
