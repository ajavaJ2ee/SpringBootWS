package com.javacodegeeks.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.javacodegeeks.model.Movies;

@Mapper
public interface MovieMapper {
	public List<Movies> getMoviesList();

	public void insertMovie(Movies newMovie);

	public void deleteMovie(int id);

	public void modifyMovie(Movies newMovie);
}
