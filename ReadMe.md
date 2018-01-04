# ADS04 Java 

## 수업 내용
- Generic 학습

## Code Review

1. genericMain

```Java
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

class List<T> {
	public T lists;
}

class News {
	String thumb;
	String title;
	String summary;
}

class Gallery {
	int no;
	String title;
	String author;
	String detetime;
	int count;
}

```
2. NewList

```Java
public class NewList<T> {
	
	private Object list[];

	public NewList() {// 값을 넣지 않은 상태에서 사이즈 등의 체크를 할 수 있기 때문에
						// 저장소를 초기화 해주는 작업이 필요하다.
		// if(Type instanceOf target)
		list = new Object[1];

	}

	public void add(T item) {
		// 배열의 크기를 임시로 늘려서 사용
		Object tempList[] = new Object[size() + 1];
		for (int i = 0; i < list.length; i++) {
			tempList[i] = list[i];
		}

		tempList[list.length] = item;
		list = tempList;

	}

	public void remove(int position) {
		Object tempList[] = new Object[size() - 1];
		//position 이전의 데이터를 임시공간으로 복사
		for (int i = 0; i < position; i++) {
			tempList[i] = list[i];
		}
		//position 이후의 데이터를 임시공간으로 복사
		for(int i = position+1; i<list.length; i++){
			tempList[i-1] = list[i];
		}

		list = tempList;

	}

	public int size() {
		return list.length - 1;
	}

}
```



## 보충설명



## TODO



## Retrospect



## Output
- 생략