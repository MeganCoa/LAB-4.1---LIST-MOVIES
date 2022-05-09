
public class Movie {
//private variables
	private String title;
	private String category;
	
	// getters return the same type as the
	// instance variable it's retrieving
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	//Constructors
	
	//default constructor
	public Movie() {
		
	}
	public Movie(String title, String category) {	
		this.title = title;
		this.category = category;
	
	}
	
	@Override
	public String toString() {
			
			return String.format("Movie", title, category);
		
	}
	
}
