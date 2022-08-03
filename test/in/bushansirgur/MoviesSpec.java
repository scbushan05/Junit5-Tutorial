package in.bushansirgur;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Movies")
class MoviesSpec {

	private Movies movies;
	
	@BeforeEach
	void init() {
		movies = new Movies();
	}
	
	@Test
	@DisplayName("list is empty when no movies are added")
	public void moviesEmptyWhenNoMoviesAdded() {
		
		//Act -> call the method
		List<String> list = movies.getMovies();
		
		//Assert -> evaluate the condition
		//success scenario
		assertTrue(list.isEmpty(), () -> "Movies should be empty");

	}
	
	@Test
	@DisplayName("list contains two movies when two movies added")
	void movieslistContainsTwoMoviesWhenTwoMoviesAdded() {
		movies.add("Avatar 2", "Mission Impossible 6");
		List<String> list = movies.list();
		assertEquals(2, list.size(), () -> "Movies list should have two movies");
	}
	
	@Test
	@DisplayName("should be arranged in alphabetically")
	void moviesArrangedInAlphabeticalOrder() {
		movies.add("Spider man 6", "Terminator 5", "Mission impossible 6", "Avatar 2");
		List<String> list = movies.arrange();
		assertEquals(Arrays.asList("Avatar 2", "Mission impossible 6", "Spider man 6", "Terminator 5"), 
				list, 
				() -> "should return movies alphabetically");
	}

	@Test
	@DisplayName("should be empty when no movies passed to the add method")
	void moviesShouldBeEmptyWhenAddIsCalledWithMovies() {
		movies.add();
		List<String> list = movies.list();
		assertTrue(list.isEmpty(), () -> "Movies should be empty");
	}
	
	@Test
	@DisplayName("should be immutable when new movie is added")
	void moviesReturnedShouldBeImmutable() {
		Movies m = new Movies();
		m.add("Mission impossible 6", "Kung fu panda 6", "Avatar 2");
		List<String> list = m.list();
		try {
			list.add("Fast and Furious 10");
			fail(() -> "Should not able to add new movies");
		} catch (Exception e) {
			assertTrue(e instanceof UnsupportedOperationException, () -> "Should throw unsupported operation exception");
		}
	}
}



























