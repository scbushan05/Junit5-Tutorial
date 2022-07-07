package in.bushansirgur;

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
		//failure scenario
		assertFalse(list.isEmpty(), () -> "Movies should be empty");
	}
	
	//Error: if a test case throws an exception then it is error
	//Failure: if a test case fails then it is failure
	
	//fail() is used to fail a test case with a given message
	
	@Test
	public void failureTestCase() {
		fail(() -> "This is a failed test case");
	}

}














