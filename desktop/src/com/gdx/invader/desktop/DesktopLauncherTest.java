package com.gdx.invader.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdx.invader.Game;
import coolGuyObjects.CoolGuy;
import game.mainGame;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Linas on 2016-12-08.
 */

public class DesktopLauncherTest {
//    @org.junit.Test
//    public void thisAlwaysPasses()
//    {
//        assertTrue(true);
//    }
//
//    @Before
//    public void initializeStuff() throws Exception {
//        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
//        cfg.width = 480;
//        cfg.height = 320;
//        cfg.resizable = true;
//        LwjglApplication app = new LwjglApplication( new Game(), cfg);
//    }
////
////    @After
////    public void tearDown() throws Exception {
////        Gdx.app.exit();
////    }
////
////
    @org.junit.Test
    public void changeSpeed() throws Exception {

        //final HeadlessApplicationConfiguration config = new HeadlessApplicationConfiguration();
        //config.renderInterval =  // Likely want 1f/60 for 60 fps
        //new HeadlessApplication(new MyApplication(), config);
        int a = 1 + 5;
//        TextureManager c = new TextureManager();
//        c.create();
//        Box bo = new Box(10,20);
        TimeUnit.SECONDS.sleep(5);
        CoolGuy stan = new CoolGuy();
        //stan.shoot(10);
        assertEquals(6, a);

    }

//    @org.junit.Test
//    public void setHealthPoints() throws Exception {
//
//    }
//
//    @org.junit.Test
//    public void changeHP() throws Exception {
//
//    }

}