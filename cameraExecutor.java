class cameraExecutor{

public static void main(String[] args){


boolean isCamera1 = camera.getCameraDetails("Canon","EOS 1500D",24,"CMOS","Zoom Lens","f/3.5","100-6400","1/4000",true,true);
boolean isCamera2  = camera.getCameraDetails("Sony","A7",33,"CMOS","Prime Lens","f/1.8","100-51200","1/8000",true,true);
boolean isCamera3  = camera.getCameraDetails("Nikon","D3500",24,"CMOS","Zoom Lens","f/3.5","100-6400","1/4000",true,true);
boolean isCamera4  = camera.getCameraDetails(null,"EOS R",30,"CMOS","Zoom Lens","f/4","100-25600","1/8000",true,true);
boolean isCamera5  = camera.getCameraDetails("Canon","",24,"CMOS","Zoom Lens","f/3.5","100-6400","1/4000",true,true);
boolean isCamera6  = camera.getCameraDetails("Sony","A6400",0,"CMOS","Zoom Lens","f/3.5","100-6400","1/4000",true,true);
boolean isCamera7  = camera.getCameraDetails("Nikon","Z50",20,"","Zoom Lens","f/3.5","100-6400","1/4000",true,true);
boolean isCamera8  = camera.getCameraDetails("Fujifilm","XT4",26,"CMOS",null,"f/2","100-12800","1/8000",true,true);
boolean isCamera9  = camera.getCameraDetails("Canon","M50",24,"CMOS","Zoom Lens","","100-6400","1/4000",true,true);
boolean isCamera10 = camera.getCameraDetails("Sony","A6000",24,"CMOS","Zoom Lens","f/3.5","","1/4000",true,true);
boolean isCamera11 = camera.getCameraDetails("Panasonic","Lumix G7",16,"CMOS","Zoom Lens","f/3.5","100-25600","1/4000",true,true);
boolean isCamera12 = camera.getCameraDetails("Canon","90D",32,"CMOS","Zoom Lens","f/2.8","100-25600","1/8000",true,true);
boolean isCamera13 = camera.getCameraDetails("Sony","A1",50,"CMOS","Prime Lens","f/1.8","100-102400","1/8000",true,true);
boolean isCamera14 = camera.getCameraDetails("Nikon","D7500",20,"CMOS","Zoom Lens","f/3.5","100-51200","1/8000",true,true);
boolean isCamera15 = camera.getCameraDetails("Canon","R5",45,"CMOS","Zoom Lens","f/2.8","100-51200","1/8000",true,true);
boolean isCamera16 = camera.getCameraDetails("Sony","RX100",20,"CMOS","Fixed Lens","f/1.8","125-12800","1/2000",true,true);
boolean isCamera17 = camera.getCameraDetails("Leica","Q2",47,"CMOS","Fixed Lens","f/1.7","50-50000","1/2000",true,true);
boolean isCamera18 = camera.getCameraDetails("Nikon","Z9",45,"CMOS","Zoom Lens","f/2.8","64-25600","1/32000",true,true);
boolean isCamera19 = camera.getCameraDetails("Canon","R10",24,"CMOS","Zoom Lens","f/4","100-32000","1/8000",true,true);
boolean isCamera20 = camera.getCameraDetails("Sony","FX3",12,"CMOS","Prime Lens","f/2","100-409600","1/8000",true,true);
boolean isCamera21 = camera.getCameraDetails("Panasonic","GH6",25,"CMOS","Zoom Lens","f/2.8","100-25600","1/8000",true,true);
boolean isCamera22 = camera.getCameraDetails("Canon","G7X",20,"CMOS","Fixed Lens","f/1.8","125-12800","1/2000",true,true);
boolean isCamera23 = camera.getCameraDetails("Sony","A9",24,"CMOS","Prime Lens","f/1.8","100-51200","1/8000",true,true);
boolean isCamera24 = camera.getCameraDetails("Nikon","D850",45,"CMOS","Zoom Lens","f/4","64-25600","1/8000",true,true);
boolean isCamera25 = camera.getCameraDetails("Canon","200D",24,"CMOS","Zoom Lens","f/4","100-6400","1/4000",true,true);
boolean isCamera26 = camera.getCameraDetails("Sony","A7S III",12,"CMOS","Prime Lens","f/2.8","80-102400","1/8000",true,true);
boolean isCamera27 = camera.getCameraDetails("Nikon","D5600",24,"CMOS","Zoom Lens","f/3.5","100-25600","1/4000",true,true);
boolean isCamera28 = camera.getCameraDetails("Canon","R6",20,"CMOS","Zoom Lens","f/2.8","100-102400","1/8000",true,true);
boolean isCamera29 = camera.getCameraDetails("Sony","A6400",24,"CMOS","Zoom Lens","f/3.5","100-32000","1/4000",true,true);
boolean isCamera30 = camera.getCameraDetails("Panasonic","S5",24,"CMOS","Zoom Lens","f/4","100-51200","1/8000",true,true);
boolean isCamera31 = camera.getCameraDetails("Nikon","Z6 II",24,"CMOS","Zoom Lens","f/4","100-51200","1/8000",true,true);
boolean isCamera32 = camera.getCameraDetails("Canon","R8",24,"CMOS","Zoom Lens","f/4","100-102400","1/8000",true,true);
boolean isCamera33 = camera.getCameraDetails("Sony","A6100",24,"CMOS","Zoom Lens","f/3.5","100-25600","1/4000",true,true);
boolean isCamera34 = camera.getCameraDetails("Fujifilm","X-T30",26,"CMOS","Prime Lens","f/2","160-12800","1/4000",true,true);
boolean isCamera35 = camera.getCameraDetails("Olympus","OM-D E-M10",16,"CMOS","Zoom Lens","f/3.5","200-25600","1/4000",true,true);
boolean isCamera36 = camera.getCameraDetails("Pentax","K-70",24,"CMOS","Zoom Lens","f/3.5","100-102400","1/6000",true,true);
boolean isCamera37 = camera.getCameraDetails("Sigma","fp",24,"CMOS","Prime Lens","f/2.8","100-25600","1/8000",true,true);


if (isCamera1 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera2 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera3 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera4 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera5 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera6 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera7 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera8 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera9 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera10 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera11 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera12 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera13 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera14 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera15 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera16 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera17 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera18 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera19 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera20 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera21 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera22 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera23 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera24 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera25 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera26 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera27 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera28 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera29 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera30 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera31 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera32 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera33 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera34 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera35 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera36 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else if (isCamera37 == true) {
    camera.fetchDetails();
    System.out.println("----------------------------------------");
} else {
    System.out.println("No valid camera details found");
}
}




}