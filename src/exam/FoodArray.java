package exam;

class Food{
	
	String name;
	int Kcal; 
}

public class FoodArray {
	public static void main(String[] args) {
		Food[] foods = new Food[10];
		for(int i = 0; i<foods.length; i++) {
			foods[i] = new Food();
			foods[i].Kcal = i+2;
		}
		System.out.println(foods[1].Kcal);
	}
}
