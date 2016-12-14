package com.gdx.invader.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdx.invader.Game;
import coolGuyObjects.CoolGuy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Linas on 2016-12-11.
 */
@RunWith(GdxTestRunner.class)
public class DesktopLauncherTest2 {


        @Test
        public void badlogicLogoFileExists() {
            assertTrue("This test will only pass when the badlogic.jpg file coming with a new project setup has not been deleted.", Gdx.files
                    .internal("../android/assets/badlogic.jpg").exists());
        }
    }