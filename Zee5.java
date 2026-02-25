class Zee5 {

    public static void main(String[] args) {

        String platformName = "ZEE5";
        String owner = "Zee Entertainment Enterprises";
        String headquarters = "Mumbai";
        String zee5Content[] = {
            "Abhay","Rangbaaz","Sunflower","Kaafir","Code M","Duranga",
            "Pitchers","TVF Tripling","Mithya"
        };

        System.out.println("the zee5 platform info is:");
        System.out.println("the name of platform is:" + platformName);
        System.out.println("the owner name is:" + owner);
        System.out.println("the headquarters is:" + headquarters);

        System.out.println("the no of contents available are:" + zee5Content.length);
        System.out.println("the list of contents available:");
        for (String content : zee5Content) {
            System.out.println(content);
        }
    }
}
