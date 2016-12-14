package coolGuyObjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import tools.TextureManager;

public class Coin extends GameObject {
	
	private Rectangle hitBox;
	private Sprite sprite;
	
	public Coin(int x, int y){
		hitBox = new Rectangle(0,0,15,15);
		sprite = new Sprite(TextureManager.coin);
		sprite.setSize(15, 15);
		setPosition(x, y);
	}

	@Override
	public int hits(Rectangle r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void action(int type, float x, float y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(float x, float y) {
		hitBox.x = x;
		hitBox.y = y;
		sprite.setPosition(x, y);
	}

	@Override
	public void moveLeft(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(SpriteBatch batch) {
		sprite.draw(batch);
	}

	@Override
	public Rectangle getHitBox() {
		// TODO Auto-generated method stub
		return hitBox;
	}

	@Override
	public int hitAction(int side) {
		return 3;
	}

	@Override
	public int hits2(Rectangle r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(float delta, int number, float playerPosition, float playerPositionY, int screenWidth) {
		// TODO Auto-generated method stub
		
	}
}
