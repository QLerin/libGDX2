package coolGuyObjects;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by Linas on 2016-12-08.
 */
public class GdxInitializer {

    /**
     * Fake application listener class
     */
    @SuppressWarnings("EmptyClass")
    private static class TestApplication extends ApplicationAdapter {

    }


    /**
     * init the environement, once.
     */
    static {
        //init GDX environement to have the methods available
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

        cfg.title = "Test";
        cfg.width = 2;
        cfg.height = 2;
        LwjglApplicationConfiguration.disableAudio = true;

        new LwjglApplication(new TestApplication(), cfg);
    }
}