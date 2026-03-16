class LazyPool{

   String poolName;
   String waterType;
   int depth;
   String safetyLevel;

   public void getLazyPoolDetails(){
       System.out.println("The poolName is: " + poolName);
       System.out.println("The waterType is: " + waterType);
       System.out.println("The depth is: " + depth);
       System.out.println("The safetyLevel is: " + safetyLevel);
   }
}