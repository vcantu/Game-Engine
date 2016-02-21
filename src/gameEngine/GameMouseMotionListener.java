package gameEngine;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingUtilities;

public class GameMouseMotionListener implements MouseMotionListener {

	private int mouseX, mouseY;
	
	@Override
	public void mouseDragged(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		mouseX =(int) point.getX() - 3;
		mouseY =(int) point.getY() - 24;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		mouseX =(int) point.getX() - 3;
		mouseY =(int) point.getY() - 24;
	}
	
	public int getX() {
		return mouseX;
	}
	
	public int getY() {
		return mouseY;
	}
	
}
