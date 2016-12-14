package tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureWrap;

public class TextureManager {
	
	public static Texture brick;
	public static Texture coin;
	public static Texture pole;
	public static Texture spikes;
	public static Texture bush;
	public static Texture planet, planet2, planet3;
	public static Texture back;
	public static Texture enemy;
	public static Texture cannon;
	public static Texture bullet;
	public static Texture platform;
	public static Texture weekBrick;
	public static Texture gunItem;
	public static Texture playerBullet;
	public static Texture speed;
	public static Texture checkpoint;
	public static Texture box;
	public static Texture medKit;
	public static Texture AI;
	
	public static void create(){
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	
    	SimpleDateFormat hour = new SimpleDateFormat("HH");
    	SimpleDateFormat minute = new SimpleDateFormat("mm");
    	
    	int h = Integer.parseInt(hour.format(cal.getTime()));
    	int min = Integer.parseInt(minute.format(cal.getTime()));
    	
		brick = new Texture("res/data/brick1.png");
		coin = new Texture("res/data/coin.png");
		pole = new Texture("res/data/pole.png");
		spikes = new Texture("res/data/spikes.png");
		bush = new Texture("res/data/bushes.png");
		planet = new Texture("res/data/planet.png");
		planet2 = new Texture("res/data/planet2.png");
		planet3 = new Texture("res/data/planet3.png");
		back = new Texture("res/data/background.png");
		enemy = new Texture("res/data/enemy.png");
		cannon = new Texture("res/data/cannon.png");
		bullet = new Texture("res/data/bullet.png");
		platform = new Texture("res/data/platform.png");
		weekBrick = new Texture("res/data/weekBrick.png");
		gunItem = new Texture("res/data/gunItem.png");
		playerBullet = new Texture("res/data/playerBullet.png");
		speed = new Texture("res/data/speed.png");
		checkpoint = new Texture("res/data/cp.png");
		box = new Texture("res/data/Box.png");
		medKit = new Texture("res/data/medKit.png");
		AI = new Texture("res/data/AI.png");
	}
	public static void dispose(){
		brick.dispose();
		coin.dispose();
		pole.dispose();
		spikes.dispose();
		bush.dispose();
		planet.dispose();
		spikes.dispose();
		bush.dispose();
		planet.dispose();
		planet2.dispose();
		planet3.dispose();
		back.dispose();
		enemy.dispose();
		cannon.dispose();
		bullet.dispose();
		platform.dispose();
		weekBrick.dispose();
		gunItem.dispose();
		playerBullet.dispose();
		speed.dispose();
		checkpoint.dispose();
		box.dispose();
		medKit.dispose();
		AI.dispose();
	}
}
