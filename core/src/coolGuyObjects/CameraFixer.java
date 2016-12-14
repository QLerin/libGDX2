package coolGuyObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class CameraFixer extends GameObject{
	
	private Rectangle full;
	
	public CameraFixer(int x, int y){
		full = new Rectangle(0, 0, 15, 500);
		
		setPosition(x,y);
	}

	@Override
	public int hits(Rectangle r) {
		if(full.overlaps(r)){
			return 1;
		}
		return -1;
	}

	@Override
	public int hits2(Rectangle r) {
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
    public void update(float delta, int number, float playerPosition, float playerPositionY, int screenWidth) {

    }


    @Override
	public void setPosition(float x, float y) {
		full.x = x;
		full.y = y;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getHitBox() {
		return full;
	}

	@Override
	public int hitAction(int side) {
		// TODO Auto-generated method stub
		return 0;
	}

}
