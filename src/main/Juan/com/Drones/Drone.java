package main.Juan.com.Drones;

public class Drone {

	protected int[] coords= new int[] {0,0};
	protected char direction= 'n';
	public Drone() {
		super();
	}
	
	public void executeMovement(String instructions) {

		for( int i =0; i<instructions.length(); ++i) {
			char instruction = instructions.charAt(i);
			switch(this.direction){
				case 'n': 
					if(instruction == 'A')
						this.coords[0]+=1;
					else if(instruction == 'D')
						this.direction='e';
					else if(instruction == 'I')
						this.direction='w';
					break;
				case 's': 
					if(instruction == 'A')
						this.coords[0]-=1;
					else if(instruction == 'D')
						this.direction='w';
					else if(instruction == 'I')
						this.direction='e';
					break;
				case 'w': 
					if(instruction == 'A')
						this.coords[1]-=1;
					else if(instruction == 'D')
						this.direction='n';
					else if(instruction == 'I')
						this.direction='s';
					break;
				case 'e': 
					if(instruction == 'A')
						this.coords[1]+=1;
					else if(instruction == 'D')
						this.direction='s';
					else if(instruction == 'I')
						this.direction='n';
					break;
			}
		}
	}
	public int[] getCoords() {
		return coords;
	}

	public char getDirection() {
		return direction;
	}
	
	
}
