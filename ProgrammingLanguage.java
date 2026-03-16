class ProgrammingLanguage{

   String name;
   String location;
   int size;
   String description;
   Syntax syntax;

   public void getProgrammingLanguageDetails(){
       System.out.println("The name is: " + name);
       System.out.println("The location is: " + location);
       System.out.println("The size is: " + size);
       System.out.println("The description is: " + description);
       this.syntax.getSyntaxDetails();
   }
}