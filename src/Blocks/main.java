package Blocks;

public class main
{
	public static void main(String[] args)
	{
		Category[]	categories = { null };
		Task[]		tasks = 	 { null };
		
		
		Tool.Printlnn("G�elcom");
		
		categories[0] = new Category();
		tasks[0] = new Task(categories);
	}
}