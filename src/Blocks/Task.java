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
		
		// Category		
		boolean repeat = true;
		while(repeat)
		{
			int ques = Tool.AskInt("| Category: ", 1, categories.length, '?', 'n');
			switch (ques)
			{
				case -1: // Print All
					CategoriesPrint(categories);
				break;
				
				case -2: // Make New
					categories[categories.length] = new Category();
				break;
				
				default:
					category = categories[ques-1];
					repeat = false;
				break;
			}
			
			
		}
			
	}
	
	private void CategoriesPrint(Category[] categories)
	{
		if (categories.length<=0 || categories[0]==null)
			Tool.Println("||| No Categories found. You should prolly make one?");
		else
		{
			Tool.Println("|| Categories:");
			
			for (int i=0; i<categories.length; i++)
				Tool.Println("||| "+(i+1)+":\t"+categories[i].Name());
			
			Tool.Print("\n");
		}
			
	}
}
