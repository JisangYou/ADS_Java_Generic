
public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();

		Animal<Tiger> tigers = new Animal<>();
		tigers.animals = new Tiger[10];
		tigers.animals[0] = t1;
		tigers.animals[1] = t2;
		tigers.animals[2] = t3;

		Animal<Lion> lions = new Animal<>();
		lions.animals = new Lion[10];

		Animal<String> strings = new Animal<>();
	}

}

// class에서 제네릭 사용해보기
class Animal<T> {
	public T animals[];

}

class Tiger {
	String name = "호랑이";

}

class Lion {
	String name = "사자";

}

//class List<T> {
//	public T lists;
//}
//
//class News {
//	String thumb;
//	String title;
//	String summary;
//}
//
//class Gallery {
//	int no;
//	String title;
//	String author;
//	String detetime;
//	int count;
//}
