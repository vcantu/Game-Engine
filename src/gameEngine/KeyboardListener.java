package gameEngine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener{

	private boolean[] keys = new boolean[256];

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	public boolean isKeyPressed(int key) {
		return keys[key];
	}
	
	public boolean isKeyReleased(int key) {
		return !keys[key];
	}

}
