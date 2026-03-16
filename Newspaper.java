class Newspaper{

   String name;
   String location;
   int size;
   String description;
   Article article;

   public void getNewspaperDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.article.getArticleDetails();
   }
}