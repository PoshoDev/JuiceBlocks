package Blocks;

public class Category
{
	String name;
	Type[] type;
	
	Category()
	{
		Tool.Print("New Category Name: ");
		name = Tool.ReadString();
	}
	
	public String Name()
	{
		return name;
	}
	
	public int Length()
	{
		return type.length;
	}
}
