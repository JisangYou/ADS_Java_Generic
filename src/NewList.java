
public class NewList<T> {
	
	private Object list[];

	public NewList() {// ���� ���� ���� ���¿��� ������ ���� üũ�� �� �� �ֱ� ������
						// ����Ҹ� �ʱ�ȭ ���ִ� �۾��� �ʿ��ϴ�.
		// if(Type instanceOf target)
		list = new Object[1];

	}

	public void add(T item) {
		// �迭�� ũ�⸦ �ӽ÷� �÷��� ���
		Object tempList[] = new Object[size() + 1];
		for (int i = 0; i < list.length; i++) {
			tempList[i] = list[i];
		}

		tempList[list.length] = item;
		list = tempList;

	}

	public void remove(int position) {
		Object tempList[] = new Object[size() - 1];
		//position ������ �����͸� �ӽð������� ����
		for (int i = 0; i < position; i++) {
			tempList[i] = list[i];
		}
		//position ������ �����͸� �ӽð������� ����
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
// // set(Ÿ��, �ε���, ��) - Ÿ���� �ε����� ���� �Է�
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
// // ������ �ͼ��� ó��
// throw new IndexOutOfBoundsException("���� ���");
// }
// for (int i = index; i < count; i++) {
// array[i] = array[i + 1];
// }
// array[count] = null;
// }