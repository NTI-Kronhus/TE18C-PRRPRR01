
public class Main {

	static double G = 6.674 * 1E-11;
	static double R = 8.31446261815324;
	static double p_0 = 1000;
	static double c = 299792458;
	static double g_swe = 9.82;
	
	public static void main(String[] args) {
		//Questions
		System.out.println(volumeToMass(SolidTable.IRON, (60/1000.0)));
		System.out.println(svtDistance(2.7, (50*60)));
		System.out.println(heat(FluidTable.WATER, (4), 78));
		System.out.println(pressureUnderWater(75));
		System.out.println(velocityToHeight(60/3.6) + 1.8);
		System.out.println( power( work( (((100/3.6)/4.8)*735), svtDistance(50/3.6, 4.8) ), 4.8 ) );
		System.out.println(amountOfBallBouncesFromHeight(1, 12, 0.5, 0.99));
		
		//Testing
		System.out.println();
		System.out.println(FluidTable.H20.density);
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2, 2));
		System.out.println(potentialEnergy(2, 5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1, 10));
		System.out.println(delta(5, 1));
		System.out.println(volumeToMass(FluidTable.WATER, 1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5 * (fahrenheit - 32) / 9);
	}
	
	public static double kelvinToCelsius(double kelvin) {
		return (kelvin - 273.15);
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		return (fluid.density * g_swe * deep);
	}
	
	public static double pressureUnderWater(double deep) {
		return (FluidTable.WATER.density * g_swe * deep);
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return ((mass * Math.pow(velocity, 2)) / 2);
	}
	
	public static double potentialEnergy(double mass, double height) {
		return (mass * g_swe * height);
	}
	
	public static double fallSpeed(double height) {
		return (Math.sqrt((2 * height) / g_swe) * g_swe);
	}

	public static double delta(double first, double last) {
		return (last - first);
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		return (fluid.density * volume);
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		return (gas.density * volume);
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		return (solid.density * volume);
	}
	
	public static double svtVelocity(double distance, double time) {
		return (distance / time);
	}
	
	public static double svtDistance(double velocity, double time) {
		return (velocity * time);
	}
	
	public static double svtTime(double distance, double velocity) {
		return (distance / velocity);
	}
	
	public static double work(double force, double distance) {
		return (force * distance);
	}
	
	public static double power(double work, double time) {
		return (work / time);
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return (mass * solid.heatCapacity * deltaT);
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		return (mass * fluid.heatCapacity * deltaT);
	}
	
	public static double heat(GasTable gas, double mass, double deltaT) {
		return (mass * gas.heatCapacity * deltaT);
	}
	
	public static double velocityToHeight(double velocity) {
		return (Math.pow(velocity, 2) / (2 * g_swe));
	}
	
	public static int amountOfBallBouncesFromHeight(double mass, double startHeight, double heightLimit, double energyChangeFactor) {
		double potentialEnergy = mass * startHeight * g_swe;
		int bounceCounter = 0;
		double currentHeight = startHeight;
		
		while(currentHeight > 0.5) {
			potentialEnergy *= energyChangeFactor;
			bounceCounter++;
			currentHeight = potentialEnergy/(mass*g_swe);
		}
		
		return bounceCounter;
	}
	
}
