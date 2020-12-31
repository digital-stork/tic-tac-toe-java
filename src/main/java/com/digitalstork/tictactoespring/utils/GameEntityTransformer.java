package com.digitalstork.tictactoespring.utils;

import com.digitalstork.tictactoespring.dto.Game;
import com.digitalstork.tictactoespring.model.GameEntity;
import com.digitalstork.tictactoespring.model.MarkerEnum;

import java.util.function.Function;

public class GameEntityTransformer implements Function<GameEntity, Game> {

    @Override
    public Game apply(GameEntity game) {
        String nextPlayer = game.getNextPlayer() == MarkerEnum.BLANK ? "X can start the game" : String.format("%s Player", game.getNextPlayer());
        return Game.builder()
                .id(game.getId())
                .endGame(game.isEndGame())
                .nextPlayer(nextPlayer)
                .build();
    }
}
