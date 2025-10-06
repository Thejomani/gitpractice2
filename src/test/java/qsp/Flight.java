package qsp;






public class Flight{
	void Fly() {
		System.out.println("its flying");
		
	}
}
class Indigo extends Flight{
	void Fly() {
		System.out.println("indigo flight is flying");
	}
	void Starting() {
		System.out.println("timing 3pm");
		
	}
}
class Airline extends Flight{
	void Fly() {
		System.out.println("Airline flight is flying");
	}
	void Onboarding() {
		System.out.println("timing at 2pm");
		
	}
}
class Embrides extends Flight{
	void Fly() {
		System.out.println("indigo flight is flying");
	}
	void Landed() {
		System.out.println("timing 7pm");
	}
}
class AirPort{
//	static void takeOff(Indigo I) {
//		I.Fly();
//		
//		
//	}
//	static void takeOff(Airline A) {
//		A.Fly();
//		
//		
//	}
//	static void takeOff(Embrides B) {
//		B.Fly();
//		
//		
//	}
	static void takeOff(Flight f) {
		f.Fly();
	}
}
