
public class DVDTester {

	public static void main(String[] args) {
		SortableDVD[] movies = new SortableDVD[8];
		movies[0] = new SortableDVD("The Godfather", "Francis Ford Coppala", 1972, 24.95, true);
		movies[1] = new SortableDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
		movies[2] = new SortableDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
		movies[3] = new SortableDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
		movies[4] = new SortableDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
		movies[5] = new SortableDVD("Clash of the Titans", "Louis Leterrier", 2010, 19.95, true);

		movies[6] = new SortableDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
		movies[7] = new SortableDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);
		

		// call sorting algorithm
		Sorting.insertionSort(movies);
		// use loop to display the sorted movie list
		for(int i =0; i < movies.length; i++){
                    System.out.println(movies[i].toString());}
		
		SortableDVD movie1 = new SortableDVD("Clash of the Titans", "Desmond Davis", 1981, 5.00, false);
		SortableDVD movie2 = new SortableDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
                
       // invoke the search algorithm to search the above two movies in the movies list
        Comparable found = Searching.linearSearch(movies, movie2);
        Comparable notFound = Searching.binarySearch(movies, movie1);
        //display the search result: found or not found. If found, display the movie information.
          System.out.println(found);
          System.out.println(notFound);
		

	}
}