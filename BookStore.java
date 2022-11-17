package com.book;
import java.util.*;
public class BookStore{
	ArrayList<Book> arrlst=new ArrayList<Book>();
	//Add the book Details
	public void addBook(Book b) {
		arrlst.add(b);
		}
	//Search the book by title and author
	public void searchByAuthorTitle(String title,String author){
		ArrayList<Book> newlst=new ArrayList<Book>();
		for(Book b:arrlst) {
			if(b.getAuthor().equals(author) && b.getTitle().equals(title)) {
				newlst.add(b);
				System.out.println(newlst);
				}
			else {
				System.out.println("You enteres different Title and author");
			}
		}
	}
	//Search Book By Title
	public void searchByTitle(String title){
		ArrayList<Book> newlst=new ArrayList<Book>();
		for(Book b:arrlst) {
			if(b.getTitle().equals(title)) {
				newlst.add(b);
				System.out.println(newlst);
			}	
		}
		
		
	}
	//Search Book By Author
	public void searchByAuthor(String author){
		ArrayList<Book> newlst=new ArrayList<Book>();
		for(Book b:arrlst) {
			if(b.getAuthor().equals(author)) {
				newlst.add(b);
				System.out.println(newlst);
			}
		}
	
	}
	//Display All the Book details
	public void displayAll() {
		System.out.println("Display Details of All the Books");
		for(Book b:arrlst) {
			System.out.println("Bookid: "+b.getBookId()+"\t"+"Title: "+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+"Category: "+b.getCategory()+"\t"+"Price: "+b.getPrice());
		}
	}
	//Display Specific Book details
	public void displaySpecificBookDetails(String bookId) {
		for(Book b:arrlst) {
			if (b.getBookId().equals(bookId)) {
				System.out.println("........Display Details of Specific book.......");
				System.out.println("Bookid: "+b.getBookId()+"\t"+"Title: "+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+"Category: "+b.getCategory()+"\t"+"Price: "+b.getPrice());
			}
		}
		
	}
	//Modifed book details by bookid
	public void modifyBook(String bookId,String title,String author,String category,float price){
		for(Book b:arrlst) {
				b.setBookId(bookId);
				b.setTitle(title);
				b.setAuthor(author);
				b.setCategory(category);
				b.setPrice(price);
				System.out.println("..Modifyed the book details..");
				System.out.println(arrlst);
				
			}
		}
	//Delete the Book Details
	public void deleteBook(String bookId){
		Iterator itr=arrlst.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id=st.getBookId();
			if(id.equals(id)) {
				itr.remove();
				System.out.println(arrlst);
			}
		}
	}

}
