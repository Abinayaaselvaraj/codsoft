import java.util.*;

class AtmMachine
{

  public static void main (String[]args)
  {

	Scanner sc = new Scanner (System.in);


	  System.out.print ("Enter your initial Bank Balance : ");

	int initial_balance = sc.nextInt ();

	int total = 0;

	int total1 = 0;

	for (int i = 0; i <= 3; i++)
	  {

		System.out.println ("AUTOMATIC TELLER MACHINE\n ");

		System.
		  out.print ("1.Deposit\n 2.Withdrawl\n 3.Check Balance\n 4.Exit");

		System.out.println ("\nSelect Operation To Be Performed: ");

		int operation = sc.nextInt ();

		switch (operation)
		  {

		  case 1:

			System.out.print ("Enter the Amount to be Deposited:$");

			int deposit_amount = sc.nextInt ();

			  total = deposit_amount + initial_balance;

			  System.out.println ("Current Balance of your Account: $"
								  + total);

			  break;

			case 2:System.out.print ("Enter the Amount to be Withdrawl:$");

			int withdrawl_amount = sc.nextInt ();

			  total1 = total - withdrawl_amount;

			  System.out.println ("Collect Your Currency");

			  System.out.println ("Current Balance of your Account: $"
								  + total1);

			  break;

			case 3:System.out.println ("Current Balance of your Account: $" +
									   total1);

			  break;

			case 4:System.
			  out.println ("THANKS FOR VISTING US!\n HAVE A GREAT DAY!");

			  System.exit (0);	// Exit the program
			default:System.out.println ("Invalid option selected.");


		  }

	  }


  }


}
