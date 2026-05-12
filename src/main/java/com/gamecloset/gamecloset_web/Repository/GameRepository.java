package com.gamecloset.gamecloset_web.Repository;

import com.gamecloset.gamecloset_web.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}