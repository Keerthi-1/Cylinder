public class Rectangle extends Shape{
	
	double radius;
	int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double radius, int height) {
		
		this.radius = radius;
		this.height = height;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		double areaR;
		areaR = 2 * Math.PI * radius * height;
		System.out.println("Area of the rectangle: "+areaR);
		return areaR;
	}

}
