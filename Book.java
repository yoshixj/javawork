//15D8102011G Masubuchi Yoshiki 
public class Book{
	private String price;
	private Author author;
	
	public Book(String title, String price, String name, String mail){
		this.price = price;
		author = new Author(name,mail);
	
	public String toString(){
	} 