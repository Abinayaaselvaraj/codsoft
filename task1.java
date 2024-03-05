import java.util.*;

class task1
{
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);

	int Total_marks = 0;

	  System.out.println ("Enter the mark of Student(out of 100)\n");

	  System.out.println ("Enter the number of subjects:");

	int total_subjects = sc.nextInt ();

	for (int i = 0; i < total_subjects; i++)
	  {

		System.out.println ("Enter the mark of the " + (i + 1) + " Subject:");

		int mark = sc.nextInt ();

		  Total_marks = Total_marks + mark;

	  }
	System.out.println ("RESULTS:");

	System.out.println ("Total Marks: " + Total_marks);

	System.out.println ("\n");

	int averege = (Total_marks / total_subjects);

	System.out.println ("Averege of all Marks " + averege);

	if (averege >= 90)
	  {
		System.out.println ("You have Secured O Grade");
	  }

	else if (averege >= 80 && averege < 90)
	  {
		System.out.println ("You have Secured A Grade");
	  }

	else if (averege >= 70 && averege < 80)
	  {
		System.out.println ("You have Secured B Grade");
	  }

	else if (averege >= 60 && averege < 70)
	  {
		System.out.println ("You have Secured C Grade");
	  }

	else if (averege >= 50 && averege < 60)
	  {
		System.out.println ("You have Secured D Grade");
	  }

	else
	  {

		System.out.println ("You have Failed");
	  }

  }

}
