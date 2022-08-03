package in.bushansirgur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Movies {
	
	private List<String> movies = new ArrayList<>();
	
	public List<String> getMovies() {
		return Collections.emptyList();
	}

	public void add(String... multipleMovies) {
		Arrays.stream(multipleMovies).forEach(movie -> movies.add(movie));
	}

	public List<String> list() {
		return Collections.unmodifiableList(movies);
	}

	public List<String> arrange() {
		return movies.stream().sorted().collect(Collectors.toList());
	}
	
	
}
