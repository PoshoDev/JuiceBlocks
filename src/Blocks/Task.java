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
		CategoriesPrint(categories);
	}
	
	private void CategoriesPrint(Category[] categories)
	{
		if (categories.length <= 0)
			Tool.Println("No Categories found. You should prolly make one?");
		else
		{
			Tool.Print("Categories:");
			
			for (int i=0; i<categories.length; i++)
				Tool.Println("| "+i+":\t"+categories[i].Name());
		}
			
	}
}