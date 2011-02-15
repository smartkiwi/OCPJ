package package1;

//the next line is incorrect - only class members can has protected access modifier:
//Compiler error:  modifier protected not allowed here
//protected class ProtectedClass {
public class ProtectedClass {
//to be able use this method in inherited clasess it should have protected access
	protected void inheritedMethod() {
		System.out.println("inheritedMethod of protected class ProtectedClass");
	}
}