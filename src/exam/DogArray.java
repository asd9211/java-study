package exam;


class Dog{
	String name;
	int weight;

}

public class DogArray {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		for(int a=0;a<dogs.length;a++) {
			dogs[a] = new Dog();
			dogs[a].weight = a+1;
		}
		System.out.println(dogs[7].weight);
	}
}


