package Blocks;

import java.util.Scanner;

public class Tool
{
	static Scanner scan = new Scanner(System.in);
	
    public static void Print(String str)
    {
        System.out.print(str);
    }
    
    public static void Println(String str) {
        System.out.println(str);
    }
    
    public static void Printlnn(String str) {
        System.out.println(str+"\n");
    }
    
    public static int ReadInt()
    {
    	return scan.nextInt();
    }
    
    public static String ReadString()
    {
    	return scan.nextLine();
    }
    
    public static int Ask(String check, String str, String ...tryy)
    {
    	Print(str);
    	
    	check = ReadString();
    	
    	for (int i=0; i<tryy.length; i++)
    		if (check == tryy[0])
    			return i;
    	
    	return -1;
    }
    
    public static int Ask2(String str, String ...check)
    {
    	Print(str);
    	
    	String read = ReadString();
    	
    	for (int i=0; i<check.length; i++)
    		if (read == check[0])
    			return i;
    	
    	return -1;
    }
}