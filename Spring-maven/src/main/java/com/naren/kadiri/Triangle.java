package com.naren.kadiri;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangle {

	private final Logger logger = LoggerFactory.getLogger(Triangle.class);

	// private List<Point> points;

	private Point point1;
	private Point point2;
	private Point point3;

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	/*public List<Point> getPoints() {
		return points;
	}
	
	public void setPoints(List<Point> points) {
		this.points = points;
	}*/
	
	public void draw() {
		logger.info("inside the draw method " + " its logging");
		

		/*System.out.println("Point1(" + getPoints().get(0).getX() + " , " + getPoints().get(0).getY() + ")");
		System.out.println("Point2(" + getPoints().get(1).getX() + " , " + getPoints().get(1).getY() + ")");
		System.out.println("Point3(" + getPoints().get(2).getX() + " , " + getPoints().get(2).getY() + ")"); */

		System.out.println("Point1(" + getPoint1().getX() + " , " + getPoint1().getY() + ")");
		System.out.println("Point2(" + getPoint2().getX() + " , " + getPoint2().getY() + ")");
		System.out.println("Point3(" + getPoint3().getX() + " , " + getPoint3().getY() + ")");

	}

}
