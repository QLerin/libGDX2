package com.gdx.invader;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import coolGuyObjects.CoolGuy;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	@org.junit.Test
    public void changeSpeed() throws Exception {

        //final HeadlessApplicationConfiguration config = new HeadlessApplicationConfiguration();
        //config.renderInterval =  // Likely want 1f/60 for 60 fps
        //new HeadlessApplication(new MyApplication(), config);
        int a = 1 + 5;
//        TextureManager c = new TextureManager();
//        c.create();
//        Box bo = new Box(10,20);

        CoolGuy stan = new CoolGuy();
        //stan.shoot(10);
//        assertEquals(6, a);

    }
}
