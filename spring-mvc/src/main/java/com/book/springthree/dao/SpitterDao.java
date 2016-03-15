package com.book.springthree.dao;

import java.util.List;

import com.book.springthree.domain.Spitter;
import com.book.springthree.domain.Spittle;

public interface SpitterDao {
	  void addSpitter(Spitter spitter);

	  void saveSpitter(Spitter spitter);

	  Spitter getSpitterById(long id);

	  List<Spittle> getRecentSpittle();
	  
	  void saveSpittle(Spittle spittle);
	  
	  List<Spittle> getSpittlesForSpitter(Spitter spitter);

	  Spitter getSpitterByUsername(String username);
	  
	  void deleteSpittle(long id);
	  
	  Spittle getSpittleById(long id);
	  
	  List<Spitter> findAllSpitters();
	}
