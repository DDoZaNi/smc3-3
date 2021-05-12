
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle T = new Triangle(17.3, 10.2);
		
		T.charge(9.2, 7.5);
		System.out.println(T.calculate());
	}

}

class Triangle{
	double hei;
	double row;
	
	public Triangle(double he, double ro){
		hei = he;
		row = ro;
	}
	
	public void charge(double he, double ro){
		row = ro;
		hei = he;
	}
	
	public double calculate(){
		return hei*row/2;
	}
}