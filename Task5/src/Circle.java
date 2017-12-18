
public class Circle extends Shape {
	
	double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double circumferenceCir() {
		double circumference;
		circumference = 2 * Math.PI * radius;
		System.out.println("Circumference of the circle: "+circumference);
		return circumference;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double areaC;
		areaC = Math.PI * (radius * radius);
		System.out.println("Area of the circle: "+areaC);
		return areaC;
	}
		
}
		


