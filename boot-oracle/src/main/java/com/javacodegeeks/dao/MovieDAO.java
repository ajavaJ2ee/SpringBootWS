package com.javacodegeeks.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.javacodegeeks.mapper.MovieMapper;
import com.javacodegeeks.model.Movies;
@Component
public class MovieDAO {
	
	@Resource
	MovieMapper movieMapper;

	public List<Movies> listMovies() {
		List<Movies> movieList=movieMapper.getMoviesList();
		return movieList;
	}

	public void insertMovie(Movies newMovie) {
		movieMapper.insertMovie(newMovie);
		
	}

	public void deleteMovie(int id) {
		movieMapper.deleteMovie(id);
		
	}

	public void modifyMovie(Movies newMovie) {
		movieMapper.modifyMovie(newMovie);
		
	}

}
