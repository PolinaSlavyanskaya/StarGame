package ru.geekbrains.stargame.game;

import com.badlogic.gdx.Game;

//основной игровой класс

public class Star2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen());
    }
}
