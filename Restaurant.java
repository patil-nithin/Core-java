class  Restaurant{

public static void main(String [] args){

 String  name="Udupi Restaurant";
 String Owner="mahadev";
 String address="majestic";
 String branches[]={"majestic","JP nagar","RR nagar"};
 String mangers[]={"lalu","vinyak","rinith"};
 
 
 System.out.println("the restaurant info is:");
 System.out.println("the name of restaurant is:"+name);
  System.out.println("the owner name is:"+ Owner);
  
   System.out.println("the address of resturant is:"+address);
   System.out.println("the no of branches are:"+branches.length);
   System.out.println("the list of branches available:");
   
   for(String branch:branches) {
   System.out.println(branch);
   
   }
   }
   }
   
 
