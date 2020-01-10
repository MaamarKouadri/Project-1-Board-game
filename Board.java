


//------------------------------------------------
//Assignment : 4
//Written by : Maamar Kouadri Student ID: 40057671
//For COMP 248 SECTION (R) - Fall 2019 
// Due date : 12-02-2019
//------------------------------------------------


public  class Board {
	 
		 private int[][][] board;
		 static private int   MIN_LEVEL = 3;
	     static private int   MIN_SIZE = 3;
	     private int level;
	     private int size; 
			 
			
	     public Board (){
	    	 	
	    	this.level =MIN_LEVEL;
	    	this.size = MIN_SIZE;
	    	this.board = createBoard(this.level,this.size);
	    	
	    	
		 	 
	     }
	     
	     public Board(int l , int x){
	    	 
	  this.level = l;
	   this.size=x; 	 
	   this.board = createBoard(l,x);
	     
	    	 
	    	 
	     }
	     
		    
	     private int[][][] createBoard(int level , int size)	 {	 
			 this.board = new int [this.level][this.size][this.size];
		 
			int sum = 0;
				
				for(int i = 0 ; i < this.level ; i++) {
					
				for (int k = 0; k < this.size ; k++ ) {
					for (int l = 0; l < this.size ; l++ ) {
				 sum = i + k+ l;
					
				 if(sum % 3 == 0 & sum!= 0) {                 // sum!= 0
				  
				 board [i][k][l] = -3;
					 	
				}
				else if(sum % 5 == 0 & sum!= 0) {
							
						 board [i][k][l] = -2;
							
						 		}
				else if(sum % 7 == 0 & sum!= 0) {
							
						 board [i][k][l] = 2;
							
						 	}
					 
					 else 
						 board [i][k][l] = 0;		
						
				}
				}
				}
				return board;	
				}		
						
				
	     
	     
	     
	     			
	     public int getlevel() {
	    	 	 
	    	 return  this.level; 
	    	 
	     }
		
	     
	 public int getSize() {
	    	 
	    	 return  this.size; 
		      	 
	     }
		

	 public int getEnergyAdj(int l, int x, int y) {
		  
		 int c = board[l][x][y];
		
		 return  c; 
		 
	 
	 }
	 
	 public String toString () {
			
							  	 
		 String  c = ("Your energy is adjusted by " + this.getEnergyAdj(this.getlevel(), this.getSize(), this.getSize()) +  " for landing at "  + 
		 "("+this.getSize() + ","  + this.getSize() + ")"  + " at level ");   
		 
			
			return c;	
				
		
			} 
	     
	     
	     
	
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
}
