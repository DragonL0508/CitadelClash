package me.dragonl.citadeClash.game;

import io.fairyproject.container.InjectableComponent;

@InjectableComponent
public class GameManager {
    private GameState currentState = GameState.LOBBY;
    public void setCurrentState(GameState gameState){
        this.currentState = gameState;
    }
    public GameState getCurrentState(){
        return this.currentState;
    }
    public boolean isCurrentState(GameState gameState){
        return this.currentState == gameState;
    }
}
