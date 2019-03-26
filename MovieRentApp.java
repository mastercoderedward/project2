import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MovieRentApp {

	public static void main(String[] args) {

		Menu();

	}

	private static void Menu() {

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
				Search(choice);
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
		// TODO Auto-generated method stub

	}

	private static void Return() {
		// TODO Auto-generated method stub

	}

	private static void Earnings() {
		// TODO Auto-generated method stub

	}

	private static void Search(int abc) {
		System.out.println("   a. All available movies");
		System.out.println("   b. By genre (e.g Adventure, Horror etc...)");
		System.out.println("   c. By Title");

		Scanner input = new Scanner(System.in);
		char letter;
		String y = input.next();

		switch (abc) {

		case 1:
			letter = 'a';
			break;
		case 2:
			letter = 'b';
			break;
		case 3:
			letter = 'c';
			break;
		}
		char x = y.charAt(0);
		if (x == 'a' || x == 'A') {
			System.out.println("All available movies: ");

		} else if (x == 'b' || x == 'B') {
			System.out.println("What type of genre are you looking for? ");
			String movie = input.next();

		} else if (x == 'c' || x == 'C') {
			System.out.println("What is the title of the movie? ");
			String movie = input.next();

			String fileName = "Movie_Data.csv";
			File file = new File(fileName);
	
			try {
				Scanner input1 = new Scanner(file);
				while (input1.hasNext()) {
					String data = input1.nextLine();
					String[] name = data.split(",");
					if(name[1] == movie)
					System.out.println("	" + movie + " is available " + name[2]);
		
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();

			}

			
		}
	}
}
 