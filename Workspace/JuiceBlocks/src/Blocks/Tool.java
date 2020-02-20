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
    
    public static int ReadInt()
    {
    	return scan.nextInt();
    }
    
    public static String ReadString()
    {
    	return scan.nextLine();
    }
}