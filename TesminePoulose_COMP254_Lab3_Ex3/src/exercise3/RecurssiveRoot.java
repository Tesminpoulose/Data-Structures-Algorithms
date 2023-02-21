package exercise3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/* 
 * File Name: TesminePoulose_COMP254_Lab3_Ex1
 * Student Name: Tesmine Poulose
 * Student ID: 301151876
 * Date: 20-Feb-2022 
*/

public class RecurssiveRoot {

  private String fileNameToSearch;
  private List<String> result = new ArrayList<String>();
	
  public String getFileNameToSearch() 
  {
	return fileNameToSearch;
  }

  public void setFileNameToSearch(String fileNameToSearch) 
  {
	this.fileNameToSearch = fileNameToSearch;
  }

  public List<String> getResult() 
  {
	return result;
  }

  public static void main(String[] args) 
  {
	RecurssiveRoot fileSearch = new RecurssiveRoot();
  
	fileSearch.searchDirectory(new File("C:/Users/Tesmine/Test/"), "Assignment1.java");

	int count = fileSearch.getResult().size();
	if(count ==0)
	{
	    System.out.println("\nNo result found!");
	}
	else
	{
	    System.out.println("\nFound " + count + " result!\n");
	    for (String matched : fileSearch.getResult())
	    {
		System.out.println("Found : " + matched);
	    }
	}
  }

  public void searchDirectory(File directory, String fileNameToSearch) 
  {
	  setFileNameToSearch(fileNameToSearch);
	    search(directory);
  }

  private void search(File file) 
  {
	  if (file.isDirectory()) 
	  {
		  System.out.println("Searching directory ... " + file.getAbsoluteFile());	
		  for (File temp : file.listFiles()) 
		{
		    if (temp.isDirectory()) 
		    {	//Search Function is Recursively Called
		    	search(temp);
		    } 
		    else 
		    {
		    	if (getFileNameToSearch().equals(temp.getName())) 
			{			
			    result.add(temp.getAbsoluteFile().toString());
		    }
		    }
	    }

	   }

      }
}