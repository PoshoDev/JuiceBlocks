package Blocks;

import java.util.Scanner;

public class Task
{
	Category	category;
	Type 		type;
	String 		name;
	String 		notes;
	String 		url;
	int 		dueDay;
	int 		dueMonth;
	int 		dueYear;
	int 		timeEst;
	int 		repeats;
	boolean		cleared;
	
	
	Task(Category[] categories)
	{
		Tool.Println("--- NEW TASK ---");
		Tool.Println("Type '?' for category list.");
		
		boolean repeat = true;
		
		while(repeat)
		{
			int check = Tool.Ask("| Category: ", "?");
			
			if (check == 0)
				CategoriesPrint(categories);
			else
			{
				int got = Integer.parseUnsignedInt(got);
				if ()
			}
		}
			
	}
	
	private void CategoriesPrint(Category[] categories)
	{
		if (categories.length<=0 || categories[0]==null)
			Tool.Println("No Categories found. You should prolly make one?");
		else
		{
			Tool.Println("Categories:");
			
			for (int i=0; i<categories.length; i++)
				Tool.Println("| "+(i+1)+":\t"+categories[i].Name());
		}
			
	}
}
