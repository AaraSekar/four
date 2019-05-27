import java.util.*;
import java.lang.*;
import java.io.*;


class Length1
{
	public static void main (String[] args) 
	{
	String wam;
	int count=0,i;
	Scanner sc=new Scanner(System.in);
	wam=sc.nextLine();
	for(i=0;i<wam.length();i++){
		if(wam.charAt(i)!=' ')
		count++;
	}
	System.out.println(count);
	}
}
