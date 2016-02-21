package gameEngine;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

public class GameMouseListener implements MouseListener{

	private int mouseX, mouseY;
	private boolean clicked, left, right;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		mouseX =(int) point.getX() - 3;
		mouseY =(int) point.getY() - 24;
		clicked = true;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseClicked(e);
		clicked = true;
		if (e.getButton() == MouseEvent.BUTTON1)
			left = true;
		if (e.getButton() == MouseEvent.BUTTON3)
			right = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		clicked = false;
		left = false;
		right = false;
	}
	
	public boolean isMousePressed() {
		return clicked;
	}
	
	public boolean left() {
		return left;
	}
	public boolean right() {
		return right;
	}
	
	public int getX() {
		return mouseX;
	}
	public int getY() {
		return mouseY;
	}

}
