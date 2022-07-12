package in.bushansirgur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {
	
	private List<String> movies = new ArrayList<>();
	
	public List<String> getMovies() {
		return Collections.emptyList();
	}

	public void add(String movie) {
		movies.add(movie);
	}

	public List<String> list() {
		return movies;
	}
	
	
}
