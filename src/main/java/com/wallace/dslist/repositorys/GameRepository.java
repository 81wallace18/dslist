package com.wallace.dslist.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallace.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
