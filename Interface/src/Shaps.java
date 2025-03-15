
public class Shaps implements Formula {

	@Override
	public float areacir(float a) {
		// TODO Auto-generated method stub
		return pi*a*a;
	}

	@Override
	public float percir(float a) {
		// TODO Auto-generated method stub
		return 2*pi*a;
	}

	@Override
	public float areasq(float a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public float persq(float a) {
		// TODO Auto-generated method stub
		return 4*a;
	}

	@Override
	public float arearec(float a, float b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float perrec(float a, float b) {
		// TODO Auto-generated method stub
		return 2*(a*b);
	}

}
