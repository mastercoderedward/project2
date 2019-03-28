import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MovieRentApp {

	public static void main(String[] args) throws FileNotFoundException {
		Menu();
	}

	private static void Menu() throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Developers");
			System.out.println("2. Search");
			System.out.println("3. Rent");
			System.out.println("4. Return");
			System.out.println("5. Earnings");
			System.out.println("6. Exit");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Created by: Jonathan Chao & Edward Balase");
				break;
			case 2:
				Search();
				break;
			case 3:
				Rent();
				break;
			case 4:
				Return();
				break;
			case 5:
				Earnings();
				break;
			}

		} while (choice != 6);
		System.exit(0);

	}

	private static void Rent() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which movies would you like to rent? \ntype e to exit to menu");
		String userInput = input.nextLine();
		while (userInput != "e") {

		}

		// Store in file of transactions and earnings file in earnings method
		Earnings();
	}

	private static void Return() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which movie would you like to return? \ntype e to exit to menu");
		String userInput = input.nextLine();
		while (userInput != "e") {

		}
	}

	private static void Earnings() {

	}

	private static void Search() throws FileNotFoundException {
		System.out.println("   a. All available movies");
		System.out.println("   b. By genre (e.g Adventure, Horror etc...)");
		System.out.println("   c. By Title");
		System.out.println("   d. Go back to menu");
		Scanner input = new Scanner(System.in);
		String userInput;
		do {
			userInput = input.next();
			userInput.toLowerCase();

			switch (userInput) {
			case "a":
				System.out.println("All available movies: ");
				availableMovie();
				break;
			case "b":
				System.out.println("What type of genre are you looking for? ");
				MovieGenre();
				break;
			case "c":
				System.out.println("What is the title of the movie? ");
				MovieTitle();
				break;
			}
		} while (userInput != "d");
	}

	private static void availableMovie() throws FileNotFoundException {

		String fileName = "Movie_Data.csv";
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		String movie = input.nextLine();

		while (input.hasNext()) {

			String data = input.nextLine();
			String[] name = data.split("\"");
			if (name.length != 3)
				name = data.split(",");
			System.out.println("	" + name[1]);

		}
	}

	private static void MovieGenre() {
		//use index.Of
		Scanner input = new Scanner(System.in);
		System.out.println("Movie genre");
		String[] genre = {"Horror","Comedy","Action","Drama", "Adventure","Crime","Thriller","Romance","Fantasy","Animation","Children"};
		String movieGenre = input.nextLine();
	}

	private static void MovieTitle() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a movie title");
		String movieTitle = input.nextLine();
		movieTitle.toLowerCase();
		
		
	}
}
