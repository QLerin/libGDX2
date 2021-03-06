package tools;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class SoundManager {
	public static Sound jump;
	public static Music music;
	public static Sound coin;
	public static Sound dead;
	public static Sound kill;
	public static Sound victory;
	public static Sound shoot;
	public static Sound gunReload;
	public static Sound playerBullet;
	public static Sound damaged;
	
	public static void create(){
		jump = Gdx.audio.newSound(Gdx.files.internal("res/sounds/jump.mp3"));
		music = Gdx.audio.newMusic(Gdx.files.internal("res/sounds/background.mp3"));
		coin = Gdx.audio.newSound(Gdx.files.internal("res/sounds/coin.mp3"));
		dead = Gdx.audio.newSound(Gdx.files.internal("res/sounds/dead.mp3"));
		kill = Gdx.audio.newSound(Gdx.files.internal("res/sounds/kill.mp3"));
		victory = Gdx.audio.newSound(Gdx.files.internal("res/sounds/victory.mp3"));
		shoot = Gdx.audio.newSound(Gdx.files.internal("res/sounds/shoot.mp3"));
		gunReload = Gdx.audio.newSound(Gdx.files.internal("res/sounds/gunReload.mp3"));
		playerBullet = Gdx.audio.newSound(Gdx.files.internal("res/sounds/playerBullet.mp3"));
		damaged = Gdx.audio.newSound(Gdx.files.internal("res/sounds/damaged.mp3"));
	}
	public static void dispose(){
		jump.dispose();
		music.dispose();
		coin.dispose();
		dead.dispose();
		kill.dispose();
		victory.dispose();
		shoot.dispose();
		gunReload.dispose();
		playerBullet.dispose();
		SoundManager.dispose();
	}
}