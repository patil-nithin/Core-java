class Library{


   String libraryName;
   String libraryLocation;
   Book book;
   
   public void getLibraryDetails(){
	   System.out.println("The libraryName is :" + libraryName);
	   System.out.println("The libraryLocation is :" + libraryLocation);
	   this.book.fetchBookDetails();
   }

}