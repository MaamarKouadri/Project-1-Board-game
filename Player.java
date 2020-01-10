


//------------------------------------------------
//Assignment : 4
//Written by : Maamar Kouadri Student ID: 40057671
//For COMP 248 SECTION (R) - Fall 2019 
// Due date : 12-02-2019
//------------------------------------------------


 public  class Player{
			 
		 private String name;
		 private int Level;
		 private int x;
		 private int y;
		 private int energy;
		 
		 public Player(){
			 
			 this.name = ""; 
			 this.energy = 10;
			 this.x =0;
			 this.y = 0;
			 this.Level=0;
			 
		 }
		 
		 public Player ( String a){
			        
			 this.name = a; 
			 this.energy = 10;
			 this.x =0;
			 this.y = 0;
			 this.Level=0;
		 
		 }
		 
		
		 
		 public Player ( int a , int b,  int c){
		        
			 this.name = ""; 
			 this.energy = 10;
			 this.Level=a;
			 this.x =b;
			 this.y = c;
			 
		 
		 }
		 
		 
		public  Player(Player a){
			 if(a == null)  
			System.exit(0);
		  
			 this.name = a.name; 
			 this.energy = a.energy;
			 this.x =a.x;
			 this.y = a.y;
			 this.Level=a.Level; 
			 
		 }
		 
		 public String getname() {
	    	 
	    	 return  this.name; 
	     }
		
		 public int getenergy() {
	    	 
	    	 return  this.energy; 
	     }
		 
		 public int getx() {
	    	 
	    	 return  this.x; 
	     }
		 
		 public int gety() {
	    	 
	    	 return  this.y; 
	     }
		 
		 public int getLevel() {
	    	 
	    	 return  this.Level; 
	     }
		 
		 
		 public void setname (String c) {
			   this.name = c;
			 
		 }
		 
		 public void setenergy(int c) {
			   this.energy = c;
			 
		 }
		 
		 public void setLevel(int c) {
			   this.Level = c;
			 
		 }
		 
		 public void setx(int c) {
			   this.x = c;
			 
		 }
		 
		 public void sety(int c) {
			   this.y = c;
			 
		 }
		
		 public void moveto(Player c) {
			 
			  c.Level =this.Level ;
			   c.x = this.x ;
			   c.y = this.y;
			 
			 
		 }
		 
		 
		 public boolean won(Board b) {
			 
			
			 
			 return (this.Level == b.getlevel()-1 && this.x == b.getSize()-1  && this.y == b.getSize()-1  );	 
			 
		 }
		 
	
		  
		public boolean equals(Player c) {
			
			return (  this.getx() == c.x  && this.gety() == c.y && this.getLevel() == c.Level);
				
				
		}
		 
		 public String toString () {
				
				String  c = ( "\t" + this.getname() + " is on level " + this.getLevel() + " at location " + 
				        "("+this.getx() + ","  + this.gety() + ")" + " and has " + this.getenergy() + " units of energy."  );
				return c;	
					
				
				} 
		
		
	 
	 }	