public class MyArrayList<T> {

    private int my_index=0;
    Object[] elementData;

    public MyArrayList(int capacity) {
        if (capacity>0){
            this.elementData = new Object[capacity];
        }
    }

    public void add(T data) {
        if (my_index == elementData.length-1)
            System.out.println("더 이상 추가할 수 없습니다.");
        else {
            elementData[my_index]=data;
            my_index++;
        }
    }

    public T get(int index) {
        return (T) elementData[index];
    }
}
