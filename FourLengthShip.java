public class FourLengthShip extends Ship {
	Coordinate c1;
	Coordinate c2;
	Coordinate c3;
	Coordinate c4;
	
	public FourLengthShip(Coordinate c1, Coordinate c2, Coordinate c3, Coordinate c4){
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
	}
	@Override
	public boolean isDamaged() {
		if((c1.isDamaged() || c2.isDamaged() || c3.isDamaged() || c4.isDamaged()) && (!isAlive())) {
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean isAlive() {
		if(c1.isDamaged() && c2.isDamaged() && c3.isDamaged() && c4.isDamaged()) {
			return true;
		}
		else {
			return false;
		}
	}

}