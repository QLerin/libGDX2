package coolGuyObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdx.invader.Game;
import game.mainGame;
import org.junit.Test;
import org.junit.runner.RunWith;
import tools.TextureManager;

import static org.junit.Assert.*;


/**
 * Created by Linas on 2016-11-30.
 */
@RunWith(GdxTestRunner2.class)
public class CoolGuyTest { //extends GdxInitializer{
    @Test
    public void badlogicLogoFileExists() {
        assertTrue("This test will only pass when the badlogic.jpg file coming with a new project setup has not been deleted.", Gdx.files
                .internal("../android/assets/badlogic.jpg").exists());
    }
}