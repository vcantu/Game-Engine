package gameEngine;


public class Input {
	
	private final KeyboardListener keyboardListener;
	private final GameMouseListener mouseListener;
	private final GameMouseMotionListener mouseMotionListener;
	private final Game game;
	private boolean prevLeftPressed = false, prevRightPressed = false;
	private int mouseX, mouseY;
	
	public Input(Game game) {
		this.game = game;
		keyboardListener = new KeyboardListener();
		mouseListener = new GameMouseListener();
		mouseMotionListener = new GameMouseMotionListener();
	}
	
	public void initialize() {
		game.getFrame().addKeyListener(keyboardListener);
		game.getFrame().addMouseListener(mouseListener);
		game.getFrame().addMouseMotionListener(mouseMotionListener);
	}
	
	public void update() {
		mouseX = mouseMotionListener.getX();
		mouseY = mouseMotionListener.getY();
	}
	
	public void endUpdate() {
		prevLeftPressed = leftPressed();
		prevRightPressed = rightPressed();
	}
	
	public int mouseX() { return mouseX; }
	public int mouseY() { return mouseY; }
	
	public boolean leftPressed() {
		if (mouseListener.isMousePressed() && mouseListener.left())
			return true;
		return false;
	}	
	public boolean rightPressed() {
		if (mouseListener.isMousePressed() && mouseListener.right())
			return true;
		return false;
	}
	
	public boolean prevLeftPressed() {
		return prevLeftPressed;
	}
	public boolean prevRightPressed() {
		return prevRightPressed;
	}
	
	public KeyboardListener keyboard() {
		return keyboardListener;
	}
	
	public GameMouseListener mouse() {
		return mouseListener;
	}
	
	public GameMouseMotionListener mouseMotion() {
		return mouseMotionListener;
	}

}
