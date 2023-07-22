package com.dh.repository;

import com.dh.GamesLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gamesLibraryRepository extends JpaRepository<GamesLibrary, Integer> {

}
