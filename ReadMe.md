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

- 제네릭이란 클래스내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다. 
![generic](https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2136.png)

- 예제 코드

```Java
class Test1<T>{
    private T data;
    public void set(T data){this.data = data;}
    public T get(){return data;}
}

public class Test{
    public static void main(String[] args) {
        Test1<String> t = new Test1<String>();
        t.set("asd");
        System.out.println(t.get());
    }
}
```
- t는 타입 매개변수를 의미한다. 

- 제네릭이란 사용자가 전달하는 "형식" 을 매개 변수로 사용하여 형식 내부에서 형식 매개 변수로 정의된(주로 단일 형식 매개 변수에서는 T를 사용합니다) 형식을 교체하는 것

![generic](http://cfile28.uf.tistory.com/image/252EB03754E491602F548E)

출처: http://sime.tistory.com/56 [심이 블로그]
출처: http://slaner.tistory.com/122 [꿈꾸는 프로그래머]


## TODO

- 활용 예제를 직접만들어 볼 것


## Retrospect

- 개념에 대한 이해는 가나, 코드 적으로 한 눈에 들어오지 않음.

## Output
- 생략