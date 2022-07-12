package in.bushansirgur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Movies")
class MoviesSpec {

	@Test
	@DisplayName("list is empty when no movies are added")
	public void moviesEmptyWhenNoMoviesAdded() {
		//Arrange -> setup the data 
		Movies movies = new Movies();
		
		//Act -> call the method
		List<String> list = movies.getMovies();
		
		//Assert -> evaluate the condition
		//success scenario
		assertTrue(list.isEmpty(), () -> "Movies should be empty");

	}
	
	@Test
	void movieslistContainsTwoMoviesWhenTwoMoviesAdded() {
		Movies movies = new Movies();
		movies.add("Avatar 2");
		movies.add("Mission Impossible 6");
		List<String> list = movies.list();
		assertEquals(2, list.size(), () -> "Movies list should have two movies");
	}


}










