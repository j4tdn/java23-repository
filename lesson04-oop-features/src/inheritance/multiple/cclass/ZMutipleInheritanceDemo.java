package inheritance.multiple.cclass;

public class ZMutipleInheritanceDemo {

	public static void main(String[] args) {
		Child child = new Child();// Father, Mother
		child.running(); // father
		// child.playBadminton(); // mother
		child.cooking(); // father ? mother ?

	}
}
