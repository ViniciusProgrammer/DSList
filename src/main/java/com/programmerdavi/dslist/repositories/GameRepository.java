package com.programmerdavi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmerdavi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
