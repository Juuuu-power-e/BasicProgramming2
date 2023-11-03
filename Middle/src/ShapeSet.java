// 2023-2 기초프로그래밍2 중간시험 코딩 문제 
// 이승주 60191676

public class ShapeSet {

	public static void main(String[] args) {
		System.out.println("< 이승주/60191676 - 기초프2 중간시험 >");
		System.out.println();
		
		Rectangle rectA = new Rectangle(10.0, 8.0);
		rectA.translate(2, 4);
		System.out.printf("%s A: (%d,%d) 면적(%.1f)\n", rectA.type, rectA.x, rectA.y, rectA.getArea());
		
		Rectangle rectB= new Rectangle(7, 7, 3, 5.5);
		rectB.scale(2);
		System.out.printf("%s B: (%d,%d) 면적(%.1f)\n", rectB.type, rectB.x, rectB.y, rectB.getArea());
		System.out.println();
		
		Circle circleC = new Circle(4.0);
		circleC.translate(3, 6);
		circleC.scale(0.5);
		System.out.printf("%s C: (%d,%d) 면적(%.1f)\n", circleC.type, circleC.x, circleC.y, circleC.getArea());
		
		Circle circleD = new Circle(5, 5, 5.0);
		System.out.printf("%s D: (%d,%d) 면적(%.1f)\n", circleD.type, circleD.x, circleD.y, circleD.getArea());
	}

}
