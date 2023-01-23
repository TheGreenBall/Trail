
public class TrailRunner {

	public static void main(String[] args) {
		
		int[] t = {100,150,105,120,90,80,50,75,75,70,80,90,100};
		Trail x = new Trail(t);

		//Should return true
		System.out.print("isLevelTrailSegment from 7 - 10 is ");
		System.out.println( x.isLevelTrailSegment(7, 10) );

		//Should return false
		System.out.print("isLevelTrailSegment from 2 - 12 is ");
		System.out.println( x.isLevelTrailSegment(2, 12) );

		//Should return true
		System.out.print("isDifficult is ");
		System.out.println( x.isDifficult() );

	}

}
