
import java.util.Random;



//------------------------------------------------
//Assignment : 4
//Written by : Maamar Kouadri Student ID: 40057671
//For COMP 248 SECTION (R) - Fall 2019 
//Due date : 12-02-2019
//------------------------------------------------



  public  class Dice {

	 private int die1;
		private int die2;
	
		public Dice(){
			
			
			
			this.die1=1;
			this.die2=1;		
		}
	
	
		public int  rollDice() {
			Random dice = new Random();	
			int a = 1 + dice.nextInt(6);
			int b = 1 + dice.nextInt(6);
			int c ;
			this.die1=a;
			this.die2=b;
			
			c = this.die1 + this.die2;
			
			return c;
			
		}
		
	public boolean 	isDouble() {
		
		return (this.die1 == this.die2);
			
		
	}
		
	public String toString () {
		
	String  c = "you rolled Die1: "+ this.die1 + " Die2: " + this.die2;
	
	return c;
		
		
	}
	
	
	public int getdie1()	{
		
		return die1;
		
	}
		
public int getdie2()	{
		
		return die2;
		
	}
		
	}
	

