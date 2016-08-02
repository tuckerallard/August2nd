package ssa.tiy.week1.day2assignment;

public class Explorer 
{

	public static void main(String[] args) 
	{
		String yellowBanana = "Hello World";
		int orangeOrange = 1492;
		boolean dogHome = true;
		String todayDate = "8/2/2016";
		Float veryPoor = 5.45f;
		char professorX = 'X';
		
		System.out.println(yellowBanana);
		System.out.println("Columbus sailed the world in " + orangeOrange + ".");
		System.out.println("Is it " + dogHome +" that I have a dog at home.");
		System.out.println("Today is " + todayDate + ".");
		System.out.println("I spent " + veryPoor + " on a cheesburger.");
		System.out.println(professorX +" marks the spot.\n");
		
		String [] myFavoriteMovies = new String[10];
		
		myFavoriteMovies[0] = "Fight Club";
		myFavoriteMovies[1] = "Harry Potter and the Sorcer's Stone";
		myFavoriteMovies[2] = "Harry Potter and the Chamber of Secrets";
		myFavoriteMovies[3] = "Harry Potter and the Prisoner of Azakaban";
		myFavoriteMovies[4] = "Harry Potter and the Goblet of Fire";
		myFavoriteMovies[5] = "Harry Potter and the Order of the Phoenix";
		myFavoriteMovies[6] = "Harry Potter and the Deathly Hallows";
		myFavoriteMovies[7] = "Lord of the Rings the Fellowship of the Ring";
		myFavoriteMovies[8] = "Lord of the Rings the Two Towers";
		myFavoriteMovies[9] = "Lord of the Rings Return of the King";
		
		for (int i = 0; i < myFavoriteMovies.length; i++) 
		{
			System.out.println(myFavoriteMovies[i]);
		}
		
		System.out.println("\n");
		
		String [] myFavoriteBooks = new String[10];
		
		myFavoriteBooks[0] = "The Giver";
		myFavoriteBooks[1] = "A Walk in the Woods";
		myFavoriteBooks[2] = "The Skeleton Key";
		myFavoriteBooks[3] = "Game of Thrones";
		myFavoriteBooks[4] = "Game of Thrones a Clash of Kings";
		myFavoriteBooks[5] = "Game of Thrones a Storm of Swords";
		myFavoriteBooks[6] = "Game of Thrones a Feast of Crows";
		myFavoriteBooks[7] = "Game of Thrones a Dance With Dragons";
		myFavoriteBooks[8] = "Game of Thrones the Winds of Winter";
		myFavoriteBooks[9] = "The Hobbit";
		
		for (int i = 0; i < myFavoriteMovies.length; i++) 
		{
			System.out.println(myFavoriteBooks[i]);
		}
		
		System.out.println("\n");
		
		String[][] aboutMe = new String[4][5];
		
		aboutMe [0][0] = "Pizza";
		aboutMe [0][1] = "Buritto";
		aboutMe [0][2] = "Ice Cream";
		aboutMe [0][3] = "Nachos";
		aboutMe [0][4] = "Sandwich";
		
		aboutMe [1][0] = "Abbey Road";
		aboutMe [1][1] = "Let It Be";
		aboutMe [1][2] = "Help!";
		aboutMe [1][3] = "A Hard Day's Night";
		aboutMe [1][4] = "Revolver";
		
		aboutMe [2][0] = "The Giver";
		aboutMe [2][1] = "The Hobbit";
		aboutMe [2][2] = "A Walk In The Woods";
		aboutMe [2][3] = "Catch 22";
		aboutMe [2][4] = "Halo: The Fall of Reach";
		
		aboutMe [3][0] = "Superbad";
		aboutMe [3][1] = "This is the End";
		aboutMe [3][2] = "Borat";
		aboutMe [3][3] = "Interview With a Vampire";
		aboutMe [3][4] = "Reign of Fire";
		
		int rows = 4;
		int columns = 5;
		int i, j;
		
		for (i = 0; i < rows; i++) 
		{
			for (j = 0; j < columns; j++) 
			{
				System.out.println(aboutMe[i][j] + " ");
			}
			
			System.out.println("");
		}
		
	}
	
	public int dog(int feet)
	{
		return 4;
	}
	
	public String name(String myName)
	{
		myName = "Tucker";
		return myName;
	}
	
	public char initial(char firstInitial)
	{
		return 'T';
	}
	
	public boolean isHome()
	{
		return true;
	}
	
	public double myInfo(double bankAccount)
	{
		return 8342.34234234;
	}
	
	private int cat(String tail)
	{
		return 1;
	}
	
	private String sound(String cowSound)
	{
		return "Moo";
	}
	
	private char grade(char myGrade)
	{
		return 'A';
	}
	
	private boolean isTired()
	{
		return true;
	}

	private double success(double chanceOfSuccess)
	{
		return 33.333333333;
	}
}
