package gameEngine;

import javax.swing.JFrame;

public class Game {

	private final JFrame frame = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final Input input;
	
	public Game(int w, int h, String title) {
		frame.setSize(w, h);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle(title);
		frame.setVisible(true);
		screenFactory = new ScreenFactory(this);	
		gameThread = new GameThread(this);
		
		input = new Input(this);
		frame.add(gameThread);
		input.initialize();
		
		new Thread(gameThread).start();
	}
	
	public Input input() {
		return input;
	}
	
	public ScreenFactory getScreenFactory() {
		return screenFactory;
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
