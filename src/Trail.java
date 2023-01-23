
public class Trail {
	private int[] markers;
	
	public Trail(int[] x){
		markers = x;
	}
	
	public boolean isLevelTrailSegment(int start, int end) {

		for(int x = 0; x < (end - start); x++) {
			for(int b = 0; b < (end - start) -1; b++) {
				int t = Math.abs(markers[x]);
				int y = Math.abs(markers[b]);
				int u = t - y;

			if (u <= 10 ) {


				return true;
			} else {

				return false;

			}

			}
		}

		return false;

	}

	// WORKS!!!!!!!!!!!!!!!!
	public boolean isDifficult() {

		boolean x = false;
		for (int a = 0; a < markers.length; a++) {

			for (int b = 0; b < markers.length - 1; b++) {

				if (markers[b] - 30 >= markers[a]) {

					x = true;

				} else {
					x = false;
				}

			}


		}
		return x;
	}
}
