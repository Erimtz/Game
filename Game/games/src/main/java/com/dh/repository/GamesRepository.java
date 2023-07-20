package com.dh.repository;

import com.dh.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesRepository  extends JpaRepository<Games, Integer> {

    List<Games> findByName(String name);
}
