package assignments.abstractinterfaces;

public interface Auctionable {
	
    // available conditions
    public static final int NEW         = 0;
    public static final int LIKE_NEW    = 1;
    public static final int REFURBISHED = 2;
    public static final int USED        = 3;

    // abstract methods to be implemented
    public String getDescription();
    public int getCondition();
}