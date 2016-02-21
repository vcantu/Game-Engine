package gameEngine;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class Grid {
	
	//width and height of grid
	//length is the size(in pixels) of each square in the grid
	protected final int WIDTH, HEIGHT, LENGTH;
	protected final Rectangle[][] GRID;//[x][y]
	protected final Point point;//point where it will be created
	protected final Rectangle rect;
	
	//default constructor creates 10x10 grid of 32x32 squares at (0,0)
	public Grid() {
		point = new Point(0, 0);
		WIDTH = 10;
		HEIGHT = 10;
		LENGTH = 32;
		GRID = new Rectangle[WIDTH][HEIGHT];
		for (int x=0; x<WIDTH; x++) {
			for (int y=0; y<HEIGHT; y++) {
				GRID[x][y] = new Rectangle(point.x + (x * LENGTH), point.y + (y * LENGTH), LENGTH, LENGTH);
			}
		}
		rect = new Rectangle(point.x, point.y, WIDTH * LENGTH, HEIGHT * LENGTH);
	}
	
	//creates 10x10 grid of 32x32 squares at point
	public Grid(Point point, int w, int h) {
		this.point = point;
		WIDTH = w;
		HEIGHT = h;
		LENGTH = 32;
		GRID = new Rectangle[WIDTH][HEIGHT];
		for (int x=0; x<WIDTH; x++) {
			for (int y=0; y<HEIGHT; y++) {
				GRID[x][y] = new Rectangle(point.x + (x * LENGTH), point.y + (y * LENGTH), LENGTH, LENGTH);
			}
		}
		rect = new Rectangle(point.x, point.y, WIDTH * LENGTH, HEIGHT * LENGTH);
	}
	
	//creates 10x10 grid of lxl squares at point
	public Grid(Point point, int w, int h, int l) {
		this.point = point;
		WIDTH = w;
		HEIGHT = h;
		LENGTH = l;
		GRID = new Rectangle[WIDTH][HEIGHT];
		for (int x=0; x<WIDTH; x++) {
			for (int y=0; y<HEIGHT; y++) {
				GRID[x][y] = new Rectangle(point.x + (x * LENGTH), point.y + (y * LENGTH), LENGTH, LENGTH);
			}
		}
		rect = new Rectangle(point.x, point.y, WIDTH * LENGTH, HEIGHT * LENGTH);
	}
	
	public Rectangle rect() { return rect; }
	
	public Rectangle get(int x, int y) {
		return GRID[x][y];
	}
	
	public int WIDTH() {
		return WIDTH;
	}
	public int HEIGHT() {
		return HEIGHT;
	}
	public int LENGTH() {
		return LENGTH;
	}

	public Point point() {
		return point;
	}
	public Rectangle[][] GRID() {
		return GRID;
	}
	
	
	public void draw(Graphics2D g2d, Color color) {
		g2d.setColor(color);
		for (int x=0; x<=WIDTH; x++) {
			//draw vertical lines
			g2d.fillRect(point.x + (x * LENGTH) - 1, point.y, 2, HEIGHT * LENGTH);
		}
		for (int y=0; y<=HEIGHT; y++) {
			//draw horizontal lines
			g2d.fillRect(point.x, point.y + (y * LENGTH) - 1, WIDTH * LENGTH, 2);
		}
	}
}
