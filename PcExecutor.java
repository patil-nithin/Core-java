class PcExecutor{

   public static void main(String[] args){

       Pc pc1=new Pc();
       pc1.brand="Dell";
       pc1.processor="Intel i5";
       pc1.ramGB=8;
       pc1.operatingSystem="Windows 11";
       Hardware h1=new Hardware();
       h1.componentName="Motherboard";
       h1.manufacturer="ASUS";
       h1.type="ATX";
       h1.price=12000;
       pc1.hardware=h1;
       pc1.getPcDetails();

       Pc pc2=new Pc();
       pc2.brand="HP";
       pc2.processor="Intel i7";
       pc2.ramGB=16;
       pc2.operatingSystem="Windows 11";
       Hardware h2=new Hardware();
       h2.componentName="Graphics Card";
       h2.manufacturer="NVIDIA";
       h2.type="RTX 3060";
       h2.price=35000;
       pc2.hardware=h2;
       pc2.getPcDetails();

       Pc pc3=new Pc();
       pc3.brand="Lenovo";
       pc3.processor="Intel i3";
       pc3.ramGB=8;
       pc3.operatingSystem="Windows 10";
       Hardware h3=new Hardware();
       h3.componentName="SSD";
       h3.manufacturer="Samsung";
       h3.type="NVMe";
       h3.price=7000;
       pc3.hardware=h3;
       pc3.getPcDetails();

       Pc pc4=new Pc();
       pc4.brand="Acer";
       pc4.processor="AMD Ryzen 5";
       pc4.ramGB=16;
       pc4.operatingSystem="Windows 11";
       Hardware h4=new Hardware();
       h4.componentName="RAM";
       h4.manufacturer="Corsair";
       h4.type="DDR4";
       h4.price=6000;
       pc4.hardware=h4;
       pc4.getPcDetails();

       Pc pc5=new Pc();
       pc5.brand="Apple";
       pc5.processor="M2";
       pc5.ramGB=16;
       pc5.operatingSystem="macOS";
       Hardware h5=new Hardware();
       h5.componentName="Processor";
       h5.manufacturer="Apple";
       h5.type="ARM";
       h5.price=50000;
       pc5.hardware=h5;
       pc5.getPcDetails();

       Pc pc6=new Pc();
       pc6.brand="Dell";
       pc6.processor="Intel i9";
       pc6.ramGB=32;
       pc6.operatingSystem="Windows 11";
       Hardware h6=new Hardware();
       h6.componentName="Power Supply";
       h6.manufacturer="Cooler Master";
       h6.type="750W";
       h6.price=8000;
       pc6.hardware=h6;
       pc6.getPcDetails();

       Pc pc7=new Pc();
       pc7.brand="HP";
       pc7.processor="AMD Ryzen 7";
       pc7.ramGB=16;
       pc7.operatingSystem="Windows 11";
       Hardware h7=new Hardware();
       h7.componentName="Cooling Fan";
       h7.manufacturer="DeepCool";
       h7.type="Air Cooler";
       h7.price=3000;
       pc7.hardware=h7;
       pc7.getPcDetails();

       Pc pc8=new Pc();
       pc8.brand="Lenovo";
       pc8.processor="Intel i5";
       pc8.ramGB=8;
       pc8.operatingSystem="Windows 10";
       Hardware h8=new Hardware();
       h8.componentName="Cabinet";
       h8.manufacturer="NZXT";
       h8.type="Mid Tower";
       h8.price=5000;
       pc8.hardware=h8;
       pc8.getPcDetails();

       Pc pc9=new Pc();
       pc9.brand="Acer";
       pc9.processor="Intel i7";
       pc9.ramGB=16;
       pc9.operatingSystem="Windows 11";
       Hardware h9=new Hardware();
       h9.componentName="Keyboard";
       h9.manufacturer="Logitech";
       h9.type="Mechanical";
       h9.price=4000;
       pc9.hardware=h9;
       pc9.getPcDetails();

       Pc pc10=new Pc();
       pc10.brand="Dell";
       pc10.processor="Intel i5";
       pc10.ramGB=8;
       pc10.operatingSystem="Windows 11";
       Hardware h10=new Hardware();
       h10.componentName="Mouse";
       h10.manufacturer="Logitech";
       h10.type="Wireless";
       h10.price=1500;
       pc10.hardware=h10;
       pc10.getPcDetails();

       Pc pc11=new Pc();
       pc11.brand="HP";
       pc11.processor="Intel i3";
       pc11.ramGB=8;
       pc11.operatingSystem="Windows 10";
       Hardware h11=new Hardware();
       h11.componentName="Monitor";
       h11.manufacturer="LG";
       h11.type="LED";
       h11.price=9000;
       pc11.hardware=h11;
       pc11.getPcDetails();

       Pc pc12=new Pc();
       pc12.brand="Lenovo";
       pc12.processor="AMD Ryzen 3";
       pc12.ramGB=8;
       pc12.operatingSystem="Windows 10";
       Hardware h12=new Hardware();
       h12.componentName="Speaker";
       h12.manufacturer="JBL";
       h12.type="Stereo";
       h12.price=2500;
       pc12.hardware=h12;
       pc12.getPcDetails();

       Pc pc13=new Pc();
       pc13.brand="Acer";
       pc13.processor="AMD Ryzen 5";
       pc13.ramGB=16;
       pc13.operatingSystem="Windows 11";
       Hardware h13=new Hardware();
       h13.componentName="Webcam";
       h13.manufacturer="Logitech";
       h13.type="HD";
       h13.price=3000;
       pc13.hardware=h13;
       pc13.getPcDetails();

       Pc pc14=new Pc();
       pc14.brand="Dell";
       pc14.processor="Intel i7";
       pc14.ramGB=16;
       pc14.operatingSystem="Windows 11";
       Hardware h14=new Hardware();
       h14.componentName="Headset";
       h14.manufacturer="HyperX";
       h14.type="Gaming";
       h14.price=4500;
       pc14.hardware=h14;
       pc14.getPcDetails();

       Pc pc15=new Pc();
       pc15.brand="HP";
       pc15.processor="Intel i5";
       pc15.ramGB=8;
       pc15.operatingSystem="Windows 10";
       Hardware h15=new Hardware();
       h15.componentName="External HDD";
       h15.manufacturer="Seagate";
       h15.type="1TB";
       h15.price=4500;
       pc15.hardware=h15;
       pc15.getPcDetails();

       Pc pc16=new Pc();
       pc16.brand="Lenovo";
       pc16.processor="Intel i7";
       pc16.ramGB=16;
       pc16.operatingSystem="Windows 11";
       Hardware h16=new Hardware();
       h16.componentName="SSD";
       h16.manufacturer="WD";
       h16.type="512GB";
       h16.price=6000;
       pc16.hardware=h16;
       pc16.getPcDetails();

       Pc pc17=new Pc();
       pc17.brand="Acer";
       pc17.processor="AMD Ryzen 7";
       pc17.ramGB=32;
       pc17.operatingSystem="Windows 11";
       Hardware h17=new Hardware();
       h17.componentName="GPU";
       h17.manufacturer="AMD";
       h17.type="RX 6700";
       h17.price=32000;
       pc17.hardware=h17;
       pc17.getPcDetails();

       Pc pc18=new Pc();
       pc18.brand="Dell";
       pc18.processor="Intel i9";
       pc18.ramGB=32;
       pc18.operatingSystem="Windows 11";
       Hardware h18=new Hardware();
       h18.componentName="Liquid Cooler";
       h18.manufacturer="Corsair";
       h18.type="AIO";
       h18.price=9000;
       pc18.hardware=h18;
       pc18.getPcDetails();

       Pc pc19=new Pc();
       pc19.brand="HP";
       pc19.processor="Intel i5";
       pc19.ramGB=16;
       pc19.operatingSystem="Windows 11";
       Hardware h19=new Hardware();
       h19.componentName="WiFi Card";
       h19.manufacturer="TP-Link";
       h19.type="PCIe";
       h19.price=2000;
       pc19.hardware=h19;
       pc19.getPcDetails();

       Pc pc20=new Pc();
       pc20.brand="Lenovo";
       pc20.processor="AMD Ryzen 9";
       pc20.ramGB=32;
       pc20.operatingSystem="Windows 11";
       Hardware h20=new Hardware();
       h20.componentName="Motherboard";
       h20.manufacturer="MSI";
       h20.type="Gaming";
       h20.price=18000;
       pc20.hardware=h20;
       pc20.getPcDetails();

   }
}
