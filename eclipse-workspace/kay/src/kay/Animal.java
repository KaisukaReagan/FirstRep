package kay;

public class Animal {
	int height,weight,depth;
	//Initialized variables for the class Animal(attributes)
public Animal(int h,int w,int d) {
	 height=h;
	 weight=w;
	 depth=d;
}
public void speak() {
	
	System.out.println("My height is `"+height);
	System.out.println("My weight is "+weight);
	System.out.println("My depth is "+depth);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal human= new Animal(20,40,50);
human.speak();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
