package assignments.abstractinterfaces;

public class Book implements Auctionable {
	
    private String title, author;
    private int condition;
    private String description = "No Description Available";

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() { 
    	return title;  
    	}
    
    public String getAuthor(){ 
    	return author;
    	}
    
    public String toString(){
        return title + " " + author;
    }
    
    public void setDescription(String s){
        description = s;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setCondition(int c){
        condition = c;
    }
    
    public int getCondition(){
        return condition;
    }
    
}