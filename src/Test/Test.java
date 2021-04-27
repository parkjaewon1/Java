package Test;

class Parent {
	   void display() {
	      System.out.println("Parent");
	   }
	}

	class Child extends Parent {
	   @Override
	   void display() {
	      super.display();
	      System.out.println("Child");
	   }
	}

	public class Test {
	   public static void main(String[] args) {
	      Parent a = new Child();
	      a.display();
	   }
	}
