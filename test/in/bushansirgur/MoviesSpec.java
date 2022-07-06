package in.bushansirgur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class MoviesSpec {

	@Test
	public void moviesEmptyWhenNoMoviesAdded() {
		//Arrange -> setup the data 
		Movies movies = new Movies();
		
		//Act -> call the method
		List<String> list = movies.getMovies();
		
		//Assert -> evaluate the condition
		//success scenario
		assertTrue(list.isEmpty(), () -> "Movies should be empty");
		//failure scenario
		assertFalse(list.isEmpty(), () -> "Movies should be empty");
	}

}
