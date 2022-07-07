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
	
	@Test
	public void failureTestCase() {
		fail(() -> "This is a failed test case");
	}

}
/*
Assert Method 		| 	What It Does
----------------------------------------------------------------------
assertTrue 			|	Assert that condition is true
assertFalse 		|	Assert that condition is false
assertNull 			|	Assert that object is null
assertNotNull 		|	Assert that object is not null
assertEquals 		|	Assert that expected and actual are equal
assertNotEquals 	|	Assert that expected and actual are not equal
assertArrayEquals 	|	Assert that expected and actual arrays are equals
assertSame Assert 	|	that expected and actual refer to the same object
assertNotSame 		|	Assert that expected and actual do not refer to the same object
*/











