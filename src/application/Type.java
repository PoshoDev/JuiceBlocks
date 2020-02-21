package application;

public class Type
{
	String name;
	
	Type()
	{
		Tool.Print("New Type Name: ");
		name = Tool.ReadString();
	}
	
}
