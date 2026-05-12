package com.gamecloset.gamecloset_web.Controller;

import com.gamecloset.gamecloset_web.Service.GameService;
import com.gamecloset.gamecloset_web.model.Game;
import com.gamecloset.gamecloset_web.Service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class GameController {
    private final GameService gameService;
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping("/")
    public String home (Model model) {
        model.addAttribute("games", gameService.findAll());
        model.addAttribute("totalGames", gameService.findAll().size());
        return "index";
    }
    @GetMapping("/games/new")
    public String newGameForm(Model model) {
        model.addAttribute("game", new Game());
        return "game-form";
    }
    @PostMapping("/games")
    public String saveGame(@ModelAttribute Game game) {
        gameService.save(game);
        return "redirect:/";
    }
    @GetMapping("/games/delete/{id}")
    public String deleteGame(@PathVariable Long id) {
        gameService.deleteById(id);
        return "redirect:/";
    }
}
