dimport java.util.Random;
import java.util.Scanner;




//------------------------------------------------
//Assignment : 4
//Written by : Maamar Kouadri Student ID: 40057671
//For COMP 248 SECTION (R) - Fall 2019 
// Due date : 12-02-2019
//------------------------------------------------

/* My program is really long and I utilized multiple methods to achieve the requirements. 
 * Once you go over the code you will see that I commented out most of the parts inside the 
 * main method. Some of the methods invoked are briefly explained in this part
 * However Once you go below the main method you will see detailed explanations
 * for each method utilized and its purpose. 
*/


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Board obj = new Board();

		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\r\n" + "* *\r\n"
				+ "* WELCOME to Nancy's 3D Warrior Game! *\r\n" + "* *\r\n"
				+ "*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		System.out.println();

		System.out.println("The default game board has 3 levels and each level has a 4x4 board.\r\n"
				+ "You can use this default board size or change the size\r\n" + "\t"
				+ "0 to use the default board size\r\n" + "\t" + "-1 to enter your own size");
		System.out.print("==> What do you want to do?");
		// This part is only the welcome message of the game with a Board object created right from the start.
		// This object is going to be utilized throughout the game. 
		
		/*---------------------------------------------------------------------------------------------------------------------------------------------------*/		
		
		int number = 0, level = 0, n = 0;
		// Those three variables are going to store the  levels, and also the size of the board
		// the variable number itself is only going to be used to give the option to the person
		// who plays the game to either set the default size or set his or hew own size for the board

		number = input.nextInt();

		System.out.println();

		if (number != 0 && number != -1) {
			System.out.println("Sorry but " + number + " is not a legal choice.");
            int  TrueNumber;
			while (input.hasNextInt()) {
				if (number != 0 || number != -1)
					number = input.nextInt();
				if (number == 0 || number == -1) 
					break;
				System.out.println("Sorry but " + number + " is not a legal choice.");

			}
			
			
			// This if statement above restricts the choices to only -1 or 0 for the desired format of the board. 
			
			 if (number == -1) {
				System.out.print("How many levels would you like? (minimum size 3, max 10)");
				level = input.nextInt();

				System.out.println();

				if (level < 3 || level > 10) {
					System.out.println("Sorry but " + level + " is not a legal choice." + "\n");

					while (input.hasNextInt()) {
						if (level < 3 || level > 10)
							level = input.nextInt();
						if ((level < 3 || level > 10) == false)
							break;
						System.out.println("Sorry but " + level + " is not a legal choice.");

					}

				}
				if (number == -1 && (level < 3 || level > 10 == false)) {
					System.out.println("What size to you want the nxn boards on each level to be?\r\n"
							+ "Minimum size is 3x3, max is 10x10.");

					System.out.print("==> Enter the value of n: ");
					n = input.nextInt();

					if (n < 3 || n > 10) {
						System.out.println("Sorry but " + n + " is not a legal choice.");
						while (input.hasNextInt()) {
							if (n < 3 || n > 10)
								n = input.nextInt();
							if ((n < 3 || n > 10) == false)
								break;
							System.out.println("Sorry but " + n + " is not a legal choice.");

						}

					}

				}

			}
			 
			 /* The series of if statements and while loops above are used above to add restrictions
			  * to the choices of the person who plays the game , so the size and number of levels can only be 
			  * chosen within a given range which is  3 to 10.
			  * 
			  * */
			 
			 
			 
			 
			 if (number == 0)
					obj = new Board();

				else
					obj = new Board(level, n);
			 
			 //  if the chosen number is  0 then I used the default constructor to set the levels and size to 3.
			 // else the size and level are going to be the ones chosen by the player if he or she
			 // has pressed -1 instead of 0. 
				             
		}
		/*---------------------------------------------------------------------------------------------------------------------------------------------------*/		
		else if (number == -1) {
			System.out.print("How many levels would you like? (minimum size 3, max 10)");
			level = input.nextInt();

			System.out.println();

			if (level < 3 || level > 10) {
				System.out.println("Sorry but " + level + " is not a legal choice." + "\n");

				while (input.hasNextInt()) {
					if (level < 3 || level > 10)
						level = input.nextInt();
					if ((level < 3 || level > 10) == false)
						break;
					System.out.println("Sorry but " + level + " is not a legal choice.");

				}

			}
			if (number == -1 && (level < 3 || level > 10 == false)) {
				System.out.println("What size to you want the nxn boards on each level to be?\r\n"
						+ "Minimum size is 3x3, max is 10x10.");

				System.out.print("==> Enter the value of n: ");
				n = input.nextInt();

				if (n < 3 || n > 10) {
					System.out.println("Sorry but " + n + " is not a legal choice.");
					while (input.hasNextInt()) {
						if (n < 3 || n > 10)
							n = input.nextInt();
						if ((n < 3 || n > 10) == false)
							break;
						System.out.println("Sorry but " + n + " is not a legal choice.");

					}

				}

			}

		}

		if (number == 0)
			obj = new Board();

		else
			obj = new Board(level, n);
		
		/* The part above is exactly like the first  one before the only difference is that this  time we assume 
		 * that there was no mistake while entering -1 or 0  and the player chose -1 or 0 right  form the start  *  * 
		 */

		board(obj);  // the method board takes the Board object as a parameter and prints the board based on the desired values chosen earlier. 
		/*---------------------------------------------------------------------------------------------------------------------------------------------------*/	
		
		/* This part is where I prepare the start of the  game. I create the  array of players and use the constructors of 
		 * the player class to enter the names chosen by the person who plays the game. I also create the dice object 
		 * who is going to be used by both players. 
		
		*/
		System.out.println("\n");

		System.out.print("What is player 0's name (one word only): ");

		String name1 = input.next();
		System.out.println();

		System.out.print("What is player 1's name (one word only): ");
		String name2 = input.next();

		Dice dice = new Dice();
		

		Player Player1 = new Player(name1);
		Player Player2 = new Player(name2);

		Player[] PlayerArray;

		PlayerArray = new Player[2];
		
		/* I deliberately set the values of the variables of each player to the ones of the default constructor before the game starts.
		 * I have done so so they could start from scratch after the end of a turn. Furthermore py manipulating the mutator methods
		 * it allowed to test the functionality of code.
		 * 
		 * 
*/
		PlayerArray[0] = Player1;
		PlayerArray[1] = Player2;
		PlayerArray[0].setenergy(10);
		PlayerArray[1].setenergy(10);
		PlayerArray[1].setx(0);
		PlayerArray[1].sety(0);
		PlayerArray[0].setLevel(0);
		PlayerArray[0].setx(0);
		PlayerArray[0].sety(0);
		PlayerArray[1].setLevel(0);

		Random PlayerTurn = new Random();
		/* This variable int named turn will help me decide which player goes first . 
		 * By simply implementing turn in the player array PlayerArray[turn] I have my first player .
		 * later one you will see that I defined PlayerArray[c]  as my second player , more explanations 
		 * will follow afterwards. 
*/
		int turn = PlayerTurn.nextInt(2);

		System.out.println(turn);
		String Turn = "";
		/*---------------------------------------------------------------------------------------------------------------------------------------------------*/	
		System.out.println("The game has started " + PlayerArray[turn].getname() + " goes first\r\n"
				+ "================================" + "\n");
		
		/* Starting from here my code in the main method will be separated in two parts . One dedicated to the first player 
		 * and the other one dedicated to the second player.  The only difference in those two parts will be the variable inside
		 * the PlayerArray apart form that both players have the exact same code. Therefore I will only briefly explain the  functionalities 
		 * of my code for the PlayerArray[turn] and then below the main method , I will give explanations in depth for the methods I have created. 
		 * I have come up with the idea of putting both players parts  inside a while loop that only breaks if one of then wins the game.
		*/

		while (true) {
			System.out.println();
			System.out.println("It is " + PlayerArray[turn].getname() + "'s turn");
			System.out.println("His level of energy is " + PlayerArray[turn].getenergy());
			dice.rollDice(); // this method from the class Dice rolls the two dies. 
			int temporary = PlayerArray[turn].getenergy();// to store the  energy of the player in order to verify
			// if he is legible to roll the dice , in other words if his energy unit is greater than 0. 
			
			PlayerRoll(PlayerArray[turn], dice); // This method will only be invoked if he  has  a  level of energy below  1 
			// it would allow the player to roll the dice three times and if the energy becomes positive the player moves again
			if (temporary > 0) {

				int a = dice.getdie1();  //   this is the value of die1
				int b = dice.getdie2();  // this is the value of die 2
				

				System.out.println("\t" + PlayerArray[turn].getname() + " " + dice.toString());
				// This shows what are the values of DIE1  and DIE2

				PlayerLocation(obj, PlayerArray[turn], a, b); // This method  is used to manage the player movements based one the result of his dice
			

				int tempLevel = PlayerArray[turn].getLevel() - 1;    // This method   is used to store the  level of the player 
				//in case EnergyVerification is invoked so there will be no confusion with the printed messages.
				
				EnergyVerification(PlayerArray[turn], obj);    // This method is only used to verify if the player went off the board by
				// surpassing the level of the board , and therefore loses 2 unit of energy. Remains on the same level
				//by subtracting -1 to his new level who made him go over the board.
				//and prints a message to inform the player.

				if (a == b) {               // This is in case they roll a  double and they get a boost of 2 energy units 
					System.out
							.print("\tCongratulations you rolled double " + a + ". Your energy went up by 2 units \n");
					PlayerArray[turn].setenergy(PlayerArray[turn].getenergy() + 2);
				}
				// if the level has not decreased because of EnergyVerification  then the regular message will be printed 
				if (PlayerArray[turn].getLevel() != tempLevel) {      
					System.out.println("\t" + toString2(obj, PlayerArray[turn])); 
				}
				
				// ToString2 returns a String based on the player level of energy and his position on the board.
			}
			EnergyStorage(obj, PlayerArray[turn]); // the method EnergyStorage allows me to calculate the exact level of energy
			// the player has based on his location and his own personnel level of energy. 

			boolean k = (turn == 0);
			int c = 0;
			if (k)
				c = 1;
			else
				c = 0;

		/* This boolean k allows me to differentiate the two players by giving a value to c which will be 
		 * Inevitably  different   to turn , that way I have my two players regardless if turn was 1 or 0 
		 * PlayerArray[turn] will go first and PlayerArray[c] will go second. 
			*/
			
			if (PlayerArray[turn].equals(PlayerArray[c])) {
				
				/* If  both of the players are at the exact same location , then they have the choice to either make
				 * a challenge or forfeit their position. 
				*/
				System.out.println();
				System.out.println("Player " + PlayerArray[c].getname() + " is at your new location");
				System.out.println("What do you want to do ?");
				System.out.println("0 - Challenge and risk loosing 50% of your energy units if you loose\r\n"
						+ "or move to new location and get 50% of other player’s energy units\r\n"
						+ "1 - to move down one level or move to (0,0) if at level 0 and lose 2 energy units");
				System.out.println(" Before typing anything make sure it is a number and not a letter.");
				String S0 = "0";
				String S2 = "1";
				int a0 = 0;
				String num = input.next();
				/* I  could have used an int  value for num instead of String, but the truth is that at the end of each turn 
				 * you have to press any key in the keyboard in order for the game to continue.  Therefore when this message
				 * pops up if  you press something that is not a number by habit  that creates and error in the program. Therefore
				 * I made sure that whatever thing the user pressed the message will give him or her  instructions to press  0 or 1
				 * instead of a compiler error that will crash the program.    
				 * 
				 */

				if (num.contentEquals(S0) == true ||  num.contentEquals(S2) == true) {
		              String [] array = num.split("");
					
				      a0 =  Integer.parseInt(array[0]);	 //  to extract the first index of the string  and turn in into a number.
				      
				   // Now we create a copy , using the copy constructor in order to call the Challenge method.
				  	if (a0 == 0) {
						Player copy = new Player(PlayerArray[turn]);  
						Challenge(PlayerArray[turn], PlayerArray[c], copy);
						
						if (PlayerArray[turn].getenergy() > copy.getenergy()) {  // I he wins the challenge based on energy comparison 
							System.out.println("Bravo !! you won the challenge");
							System.out.println(toString2(obj, PlayerArray[turn]));

						}
						if (PlayerArray[turn].getenergy() < copy.getenergy()) { // I he loses the challenge based on energy comparison 
							System.out.println("Bad luck ... you lost the challenge and half of your energy points");
						}

					}

					if (a0 == 1) {  
						Forfeit(PlayerArray[turn]);  // If the user chooses 1 we call the Forfeit method.
						System.out.println(toString2(obj, PlayerArray[turn]));
					}
					
					}
					
				/* Now the code below is exactly like the one above, and has the same objectives the only difference is that 
				 * here we assume that in their first try they did not enter neither 1 or 0 and therefore we give them the right 
				 * instructions so they could correct themselves. 
				 * 
				 */
						
				else if ( num.contentEquals(S0) == false &&  num.contentEquals(S2) == false) {
					System.out.println("Sorry but " + num + " is not a legal choice. You have to enter 0 or 1 .");
					while ( num.contentEquals(S0) == false &&  num.contentEquals(S2) == false) {
						
							num = input.next();
						
							if (num.contentEquals(S0) == true ||  num.contentEquals(S2) == true) 
								break;
							System.out.println("Sorry but " + num + " is not a legal choice. You have to enter 0 or 1 .");
							}
					
					String [] array = num.split("");
					
				    a0 =  Integer.parseInt(array[0]);
				

				if (a0 == 0) {
					Player copy = new Player(PlayerArray[turn]);
					Challenge(PlayerArray[turn], PlayerArray[c], copy);
					if (PlayerArray[turn].getenergy() > copy.getenergy()) {
						System.out.println("Bravo !! you won the challenge");
						System.out.println(toString2(obj, PlayerArray[turn]));

					}
					if (PlayerArray[turn].getenergy() < copy.getenergy()) {
						System.out.println("Bad luck ... you lost the challenge and half of your energy points");
					}

				}

				if (a0 == 1) {
					Forfeit(PlayerArray[turn]);
					System.out.println(toString2(obj, PlayerArray[turn]));
				}
				
				}
			}

			
			
			// This if statements is very special . It is literally a game changer , notice the break; at the end of it 
			// the method won of the Player class activates only if that player has arrived at the last square at the last level
			// Therefore breaking the while loop and displaying the winning message. 
			if (PlayerArray[turn].won(obj)) {

				System.out.println("The winner is player " + PlayerArray[turn].getname() + " . Well done !!");
				break;
			}
			
			
			// And this ends the first player turn ....

/*---------------------------------------------------------------------------------------------------------------------------------------------------*/
                  
		
			/* Starting from here  it's the second player turn aka PlayerArray[c]  , I will not comment this part 
			 * because it is EXACTLY the same than the part of PlayerArray[turn] except of the index inside 
			 * PlayerArray[]	 *  
			 * 
			 */
			
			
			Turn = PlayerArray[c].getname();
			System.out.println("It is " + Turn + "'s turn");
			System.out.println("His level of energy is " + PlayerArray[c].getenergy());

			int temporary2 = PlayerArray[c].getenergy();
			PlayerRoll(PlayerArray[c], dice);
			if (temporary2 > 0) {

				dice.rollDice();
				int d = dice.getdie1();
				int e = dice.getdie2();

				System.out.println("\t" + Turn + " " + dice.toString());
				if (PlayerArray[c].getenergy() > 0)
					PlayerLocation(obj, PlayerArray[c], d, e);
				int tempLevel2 = PlayerArray[c].getLevel() - 1;

				EnergyVerification(PlayerArray[c], obj);

				if (d == e) {
					System.out
							.print("\tCongratulations you rolled double " + d + ". Your energy went up by 2 units \n");
					PlayerArray[c].setenergy(PlayerArray[c].getenergy() + 2);
				}

				if (PlayerArray[c].getLevel() != tempLevel2)
					System.out.println("\t" + toString2(obj, PlayerArray[c]));
			}
			EnergyStorage(obj, PlayerArray[c]);

			System.out.println();

			if (PlayerArray[c].equals(PlayerArray[turn])) {
				System.out.println();
				System.out.println("Player " + PlayerArray[turn].getname() + " is at your new location");
				System.out.println("What do you want to do ?");
				System.out.println("0 - Challenge and risk loosing 50% of your energy units if you loose\r\n"
						+ "or move to new location and get 50% of other player’s energy units\r\n"
						+ "1 - to move down one level or move to (0,0) if at level 0 and lose 2 energy units");
				System.out.println(" Before typing anything make sure it is a number and not a letter.");
				
				String S0 = "0";
				String S2 = "1";
				int a0 = 0;
				String num = input.next();
				

				if (num.contentEquals(S0) == true ||  num.contentEquals(S2) == true) {
		              String [] array = num.split("");
					
				      a0 =  Integer.parseInt(array[0]);	
				      
				      
				  	if (a0 == 0) {
						Player copy = new Player(PlayerArray[c]);
						Challenge(PlayerArray[c], PlayerArray[turn], copy);
						if (PlayerArray[c].getenergy() > copy.getenergy()) {
							System.out.println("Bravo !! you won the challenge");
							System.out.println(toString2(obj, PlayerArray[turn]));

						}
						if (PlayerArray[c].getenergy() < copy.getenergy()) {
							System.out.println("Bad luck ... you lost the challenge and half of your energy points");
						}

					}

					if (a0 == 1) {
						Forfeit(PlayerArray[c]);
						System.out.println(toString2(obj, PlayerArray[c]));
					}
					
					}
					
						
				else if ( num.contentEquals(S0) == false &&  num.contentEquals(S2) == false) {
					System.out.println("Sorry but " + num + " is not a legal choice. You have to enter 0 or 1 .");	
					while ( num.contentEquals(S0) == false &&  num.contentEquals(S2) == false) {
						
							  num = input.next();
						
							if (num.contentEquals(S0) == true ||  num.contentEquals(S2) == true) 
								break;
							
							System.out.println("Sorry but " + num + " is not a legal choice. You have to enter 0 or 1 .");
							
							}
					
					String [] array = num.split("");
					
				    a0 =  Integer.parseInt(array[0]);
				

				if (a0 == 0) {
					Player copy = new Player(PlayerArray[c]);
					Challenge(PlayerArray[c], PlayerArray[turn], copy);
					if (PlayerArray[c].getenergy() > copy.getenergy()) {
						System.out.println("Bravo !! you won the challenge");
						System.out.println(toString2(obj, PlayerArray[turn]));

					}
					if (PlayerArray[c].getenergy() < copy.getenergy()) {
						System.out.println("Bad luck ... you lost the challenge and half of your energy points");
					}

				}

				if (a0 == 1) {
					Forfeit(PlayerArray[turn]);
					System.out.println(toString2(obj, PlayerArray[turn]));
				}
				}
				}

			if (PlayerArray[c].won(obj)) {

				System.out.println("The winner is player " + PlayerArray[c].getname() + " . Well done !!");
				break;
			}
			
			//This ends the second player turn.
			/*---------------------------------------------------------------------------------------------------------------------------------------------------*/
			
			// This part appears at the end of each round and gives the summary of the results for the new location, level, and energy units
			System.out.println("At the end of this round:");
			System.out.println(PlayerArray[turn].toString());
			System.out.println(PlayerArray[c].toString());
			System.out.print("Press any key to continue to next round ...g ");
			String key = input.next();
			// We also invite the user to press any key in order to continue
			
			if (true)
				continue;

		}
			
		

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/*  Starting from here  I will explain all of the methods I have created for this game one by one.
	 * I will go over their purpose  and how they function.
	 
	 */
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/* this method Player roll only activates when the level of energy of the player is below 0. It is a special condition
	 * that allows the player to roll the dice 3 times , and each time they get a double that  is if die1 and die2 are the same
	 * which is illustrated by the variable a and b then they get a boost of 2 energy unites. I am passing as a parameter 
	 * a player object  and a dice object. I run the for loop three times and use mutator method of the player to add the new sum.

	 */

	public static void PlayerRoll(Player p, Dice d) { 
		int i;
		int sum = 0;
		int a, b;
		if (p.getenergy() <= 0) {
			for (i = 1; i <= 3; i++) {
				d.rollDice();
				a = d.getdie1();
				b = d.getdie2();

				if (a == b) {
					sum += 2;

				}
				
				p.setenergy(p.getenergy() + sum);

			}

		}

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	
	/*
	 *  The only purpose of the method board is to actually print the board at the start of the game based on the desired level and
	 *   chosen size , those informations are being passed with the Board object that has been defined in the main method.
	 *  . I run a nested loop to cover the correct dimensions of the array and used the method getEnergyAdj to print
	 *  the correct level of energy stored at each location of the board. 
	 */
	
	
	public static void board(Board p) {

		for (int m = 0; m < p.getlevel(); m++) {
			System.out.println();
			System.out.println();
			System.out.print("Level" + m + "\n" + "--------");

			for (int i = 0; i < p.getSize(); i++) {
				System.out.println();
				for (int k = 0; k < p.getSize(); k++)

				{
					System.out.print(p.getEnergyAdj(m, i, k) + "\t");

				}
			}
		}

	}
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	/* This methods is strictly there to regulate the players movements based on the size of the board , on their own location 
	 * and also the result they got by rolling the dice . There is a Board object, Player object and the int k and l are nothing else 
	 * but the results of die1 and die2 obtained in the main method . I pass those results as  parameters and then depending on the new value of x and y
	 * if it is off the board or not I regulate the new positions according to each situation. 
	
	*/
	
	
	
	public static void PlayerLocation(Board object, Player p, int k, int l) {

		int c = k + l;

		p.setx(p.getx() + c / object.getSize());
		p.sety(p.gety() + c % object.getSize());

		if ((p.getx() >= object.getSize())) {  // That is if  the x is over the board

			p.setx(p.getx() % object.getSize());

			p.setLevel(p.getLevel() + 1);

		}

		if (p.gety() >= object.getSize()) {       // That is if the y is over the board.

			p.setx(p.getx() + p.gety() / p.gety());
			if (p.getx() >= object.getSize()) {
				p.setLevel(p.getLevel() + 1);
				p.setx((p.getx()) % object.getSize());	
			}
			p.sety(p.gety() % p.gety());

		}
		
		
		if( p.getLevel() == object.getlevel() -1 && p.getx() == object.getSize() -1    // This is done in case the player finds himself in the 2 to last square
			&&  p.gety() == object.getSize() -2 ) {
			p.setx(p.getx() - c / object.getSize());
			p.sety(p.gety() - c % object.getSize());
				
		}

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/* This method is only used to return the level of energy of each player based on where they are on the board.
	*/
	public static int EnergyLocation(Board c, Player p) {

		return c.getEnergyAdj(p.getLevel(), p.getx(), p.gety());
	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/* This method has a different purpose in the sense that it calculates and regulates the level of energy of the player 
	 * by measuring the level of energy of the location also. For example a player might have 7 units of energy , but he landed
	 * on location with -2 units of energy therefore his new energy level is going to be  7 - 2 = 5
	 * this methods handles that part.
	 * 
	 * 
	 */
	
	public static void EnergyStorage(Board c, Player p) {
		if (p.getenergy() > 0) {

			int EnergyLocation = c.getEnergyAdj(p.getLevel(), p.getx(), p.gety());
			int EnergyPlayer = p.getenergy();

			p.setenergy(EnergyLocation + EnergyPlayer);
		}
	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/* I found it really complicated to print a message that displays the level of energy of the player based on where he is on the board 
	 * since it involves informations and methods of both the Board and Player class. Therefore I created this method to make use of  the 2 classes
	 * at the same time. The Board object allows me to use the getEnergyAdj method that gives me the energy value of the location of the player 
	 * , which is why I am also passing a Player object. 
	
	*/
	
	public static String toString2(Board p, Player c) {

		String d = ("Your energy is adjusted by " + p.getEnergyAdj(c.getLevel(), c.getx(), c.gety())
				+ " for landing at " + "(" + c.getx() + "," + c.gety() + ")" + " at level " + c.getLevel());

		return d;

		

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/
/* This method is invoked if the player chooses option 1  when he is on the same position than the other player
 *  and depending if he is on level 0 or above I follow the instructions 
	for the energy loss and implement the new position accordingly.
	*/
	public static void Forfeit(Player p) {

		if (p.getLevel() != 0) {
			p.setLevel(p.getLevel() - 1);
			p.setenergy(p.getenergy() - 2);
		}

		if (p.getLevel() == 0) {
			p.setenergy(p.getenergy() - 2);
			p.setx(0);
			p.sety(0);
		}
	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/
/*  This method is invoked when the player happens to be in the same location than the other player. Except this time he chose
 * to press 0  and challenge the other player. Notice that I pass three objects as parameters the player who calls the method , 
 * the player who is being challenged and the copy of the player who calls the method .  I generate a new random number and depending on the value
 * we have two options if this number is greater or equal to 6. I move the players to different  positions and distribute the energy accordingly. 
 * If that number is below 6 than I cut half of the energy units of the calling player since he lost the challenge. 
	*/
	
	public static void Challenge(Player a, Player b, Player copy) {

		Random dice2 = new Random();

		int num = dice2.nextInt(11);

		if (num >= 6) {
			a.moveto(b);
			b.moveto(copy);
			int k = b.getenergy() / 2;
			a.setenergy(a.getenergy() + k);
			b.setenergy(b.getenergy() - k);
		}

		if (num < 6) {
			a.setenergy(a.getenergy() - a.getenergy() / 2);
		}

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

	/* This method is only invoked if the player rolls the dice and goes off the board by surpassing the maximum level of the board.
	 * Than we adjust his  position, cut 2 energy units and print a warning message in order to inform him. 
	 */
	

	public static void EnergyVerification(Player p, Board c) {

		if (p.getLevel() >= c.getlevel()) {
			p.setenergy(p.getenergy() - 2);
			p.setLevel(p.getLevel() - 1);
			System.out.println(
					"!!! Sorry you need to stay where you are - that throw takes you off the grid and you loose 2 units of energy.");

		}

	}
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

}
