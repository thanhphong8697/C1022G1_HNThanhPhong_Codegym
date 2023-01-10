package DSA.Exercise.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * Số lượng phần tử có trong MyArrayLisst.
     */
    private int size = 0;
    /**
     * Sức chứa của MyArrayList.
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Mảng chứa các phần tử.
     */
    Object elements[];
    /**
     * Sức chứa mặc định khi khởi tạo contructor không chứa tham số.
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức Contructor vói sức chứa được chuyền vào.
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0){
            elements = new  Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    /**
     * Phương thức trả về số lượng phần tử.
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Phương thức clear ArrayList.
     */
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào mảng MyArrayList.
     * @param element
     * @return
     */
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * Phương thức tăng kích thước MyArrayList.
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if (minCapacity > 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }
    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        if (elements[index] == null){
            elements[index] = element;
        }else {
            for (int i = size+1; i >= index; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    /**
     * Phương thức lấy 1 phần tử tại vị trí index.
     */
    public E get(int index){
        return (E) elements[index];
    }

    /**
     * Phương thức lấy index của 1 phần tử.
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * Phương thức kiểm tra 1 phần tử có trong MyArrayList hay không.
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }

    /**
     * Phương thức tạo ta 1 bản sao của MyArrayList hiện tại.
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }
    public E remove(int index){
        if (index < 0 || index > elements.length ){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = 0; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return  element;
    }
}
