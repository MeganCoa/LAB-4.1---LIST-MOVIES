import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MovieApp {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		
		movieList.add(new Movie("Citizen Kane", "drama"));
		movieList.add(new Movie("Casablanca", "drama"));
		movieList.add(new Movie("Singin' In The Rain", "musical"));
		movieList.add(new Movie("Star Wars", "scifi"));
		movieList.add(new Movie("To Kill A Mockingbird", "drama"));
		movieList.add(new Movie("West Side Story", "musical"));
		movieList.add(new Movie("Fantasia", "animated"));
		movieList.add(new Movie("The Silence Of The Lambs", "horror"));
		movieList.add(new Movie("The French Connection", "drama"));
		movieList.add(new Movie("Duck Soup", "comedy"));
		movieList.add(new Movie("A Clockwork Orange", "scifi"));

		
		Boolean keepAsking = true;
	while (keepAsking) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What category would you like to see?");
		String userInput = scan.nextLine();
	
		
		if(userInput == null || userInput.isEmpty()){
			System.out.println("Still Broken");
		}
		else {
			for(Movie movie : movieList) {
				if(movie.getCategory().equals(userInput)) {
					System.out.println(movie.getTitle());				
				}
			}
			keepAsking = getUserInput("Continue? y/n", scan, 'y', 'n');
			
			}				
		}	
	}
	
	
	public static Boolean getUserInput(String message, Scanner scan, char a, char b) {
		a = Character.toLowerCase(a);
		b = Character.toLowerCase(b);
		Boolean incorrectInput = true;
		System.out.println(message);

		while (incorrectInput) {
			incorrectInput = false;
			char input = scan.next().charAt(0);
			if (a != input && b != input) {
				incorrectInput = true;
				System.out.println("Oops! Try agan!" + message);
			} else if (a == input) {
				
				return true;				
			}
	
		}
		System.out.println("Goodbye.");
		return false;	
	}


}
