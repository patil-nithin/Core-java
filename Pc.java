class Pc{

   String brand;
   String processor;
   int ramGB;
   String operatingSystem;
   Hardware hardware;

   public void getPcDetails(){
       System.out.println("The PC brand is: " + brand);
       System.out.println("The processor used in the PC is: " + processor);
       System.out.println("The RAM size of the PC is: " + ramGB + " GB");
       System.out.println("The operating system installed is: " + operatingSystem);
       this.hardware.getHardwareDetails();
   }
}