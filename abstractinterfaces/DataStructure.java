package assignments.abstractinterfaces;

public abstract class DataStructure{
	
    // protected data, only subclasses have direct access
    protected int size = 0;

    // abstract method whose implementation is left to the subclass to define
    public abstract boolean addElement(int element);

    // concrete methods that are inherited by any subclass
    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}