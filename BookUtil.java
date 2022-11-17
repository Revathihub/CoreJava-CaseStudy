package com.book;

import java.util.*;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore obj=new BookStore();
		System.out.println("1.Add"+"\t"+"2.Search By Other"+"\t"+"3.Search By Title"+"\t"+"4.Search By title & author"+"\t"+"5.Display Specific "+"\t"+"6.Delete"+"\t"+"7.Modify"+"\t"+"8.Display All"+"\t"+"9.Exit");
		for(int i=0;i<1;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the "+(i+1)+" Book Details: ");
			System.out.print("BookId:");
			String BookId=sc.nextLine();
			System.out.print("Title:");
			String Title=sc.nextLine();
			System.out.print("Author:");
			String Author=sc.nextLine();
			System.out.print("Category:");
			String Category=sc.nextLine();
			System.out.print("Price:");
			Float Price=sc.nextFloat();
			Book b1=new Book(BookId,Title,Author,Category,Price);
			obj.addBook(b1);
			}
		System.out.println("Enter The which Option You want: ");
		Scanner obj1=new Scanner(System.in);
		int op=obj1.nextInt();
		switch(op) {
		case 2://Search the book by Author
				System.out.println("Search the book by Author:");
				Scanner sc1=new Scanner(System.in);
				String Author=sc1.nextLine();
				obj.searchByAuthor(Author);
				 break;
		case 3://Search the book by Title
				System.out.println("Search the book by Title:");
				Scanner sc2=new Scanner(System.in);
				String Title=sc2.nextLine();
				obj.searchByTitle(Title);
				break;
		case 4://Search the book by Title and author
				System.out.println("Search the book by Title and author:");
				Scanner sc3=new Scanner(System.in);
				String Author1=sc3.nextLine();
				String Title1=sc3.nextLine();
				obj.searchByAuthorTitle(Title1,Author1);
				break;
		case 5://Display specific book details
				System.out.println("Display specific book details by Bookid:");
				Scanner sc4=new Scanner(System.in);
				String bookId=sc4.nextLine();
				obj.displaySpecificBookDetails(bookId);
				break;
		case 6://Delete the Book Details
				System.out.println("Delete the Book details by bookid:");
				Scanner sc6=new Scanner(System.in);
				String bookId2=sc6.nextLine();
				obj.deleteBook(bookId2);
				break;
		case 7://Modify book details
				Scanner sc5=new Scanner(System.in);
				System.out.println("...Enter the book details for modifying the book details...");
				System.out.print("BookId:");
				String BookId=sc5.nextLine();
				System.out.print("Title:");
				String Title2=sc5.nextLine();
				System.out.print("Author:");
				String Author2=sc5.nextLine();
				System.out.print("Category:");
				String Category=sc5.nextLine();
				System.out.print("Price:");
				Float Price=sc5.nextFloat();
				obj.modifyBook(BookId,Title2,Author2,Category,Price);
				break;
		case 8:obj.displayAll();
				break;
		case 9: System.exit(0);
				
		}
		
	}

}
