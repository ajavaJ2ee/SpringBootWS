package com.javacodegeeks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacodegeeks.dao.MovieDAO;
import com.javacodegeeks.model.Movies;

@RestController
public class MovieController {
	@Autowired
	MovieDAO movieDao;

	@RequestMapping(value = "/movieList", method = RequestMethod.GET, produces = "application/json")
	public List<Movies> listMovies() {
		System.out.println("Inside Controller");
		List<Movies> movieList = movieDao.listMovies();

		return movieList;
	}

	@RequestMapping(value = "/updateMovie", method = RequestMethod.POST)
	public List<Movies> updateMovie(@RequestParam("id") int id, @RequestParam("title") String title,
			@RequestParam("description") String description) {

		Movies newMovie = new Movies(id, title, description);
		movieDao.insertMovie(newMovie);
		return movieDao.listMovies();
	}

	@RequestMapping(value = "/deleteMovie", method = RequestMethod.DELETE)
	public void deleteMovie(@RequestParam("id") int id) {

		movieDao.deleteMovie(id);
	}

	@RequestMapping(value = "/modifyMovie", method = RequestMethod.PUT)
	public List<Movies> modifyMovie(@RequestParam("id") int id, @RequestParam("title") String title,
			@RequestParam("description") String description) {

		Movies newMovie = new Movies(id, title, description);
		movieDao.modifyMovie(newMovie);
		return movieDao.listMovies();
	}

}