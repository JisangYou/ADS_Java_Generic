
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

// int count = 0;
// T array[];
//
// public NewList() {
// int capacity = 16;
// array = (T[]) new Object[capacity];
// }
//
// public NewList(int index) {
//
// array = (T[]) new Object[index];
// }
//
// public T[] capacityAdd() {
// T newArray[] = (T[]) new Object[array.length + 16];
// for (int i = 0; i < array.length; i++) {
// newArray[i] = array[i];
// }
// return newArray;
// }
//
// public void add(T object) {
// try {
// // set(타켓, 인덱스, 값) - 타겟의 인덱스에 값을 입력
//
// Array.set(array, count, object);
// count++;
// } catch (Exception e) {
// Array.set(capacityAdd(), count, object);
// count++;
// }
// }
//
// public int size() {
// return count + 1;
// }
//
// public void remove(int index) {
// if (index > count) {
// // 강제로 익셉션 처리
// throw new IndexOutOfBoundsException("범위 벗어남");
// }
// for (int i = index; i < count; i++) {
// array[i] = array[i + 1];
// }
// array[count] = null;
// }