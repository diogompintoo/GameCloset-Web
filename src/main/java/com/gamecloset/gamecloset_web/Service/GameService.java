package com.gamecloset.gamecloset_web.Service;

import com.gamecloset.gamecloset_web.model.Game;
import com.gamecloset.gamecloset_web.Repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public void save(Game game) {
        validateGame(game);
        gameRepository.save(game);
    }

    public Game findById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        gameRepository.deleteById(id);
    }

    private void validateGame(Game game) {
        if (game.getTitle() == null || game.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Title is empty.");
        }
        if (game.getPrice() <= 0) {
            throw new IllegalArgumentException("Price most be greater than 0.");
        }
    }
}
