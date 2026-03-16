class LibraryExecutor{

   public static void main(String[] args){
	   
	   Library library = new Library();
	   library.libraryName = "Nool Library";
	   library.libraryLocation = "CV Raman Nagar";
	   Book book = new Book();
	   book.bookName = "The 7 rules of Life";
	   library.book = book;
	   library.getLibraryDetails();
	   
	   Library library1 = new Library();
	   library1.libraryName = "City Central Library (North)";
	   library1.libraryLocation = "RT Nagar";
	   Book book1 = new Book();
	   book1.bookName = "Atomic Habits";
	   library1.book = book1;
	   library1.getLibraryDetails();
	   
	   
	   Library library2 = new Library();
	   library2.libraryName = "State Central Library";
	   library2.libraryLocation = "Seshadri Iyer Memorial Hall";
	   Book book2 = new Book();
	   book2.bookName = "The 4-Hour Workweek";
	   library2.book = book2;
	   library2.getLibraryDetails();
	   
	   Library library3 = new Library();
	   library3.libraryName = "clg lib";
	   library3.libraryLocation = "manglore";
	   Book book3 = new Book();
	   book3.bookName = "Belief";
	   library3.book = book3;
	   library3.getLibraryDetails();
   
   
   }



}