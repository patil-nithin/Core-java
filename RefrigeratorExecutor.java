class RefrigeratorExecutor {

    public static void main(String[] args) {

        boolean isRefrigerator1  = Refrigerator.createRefrigerator("LG","GL-D201",190,"Single Door","Direct Cool","3 Star",true,true,10,18000);
        boolean isRefrigerator2  = Refrigerator.createRefrigerator("LG","GL-I292",260,"Double Door","Frost Free","4 Star",true,true,10,26000);
        boolean isRefrigerator3  = Refrigerator.createRefrigerator("LG","GL-T322",308,"Double Door","Frost Free","3 Star",true,true,10,32000);
        boolean isRefrigerator4  = Refrigerator.createRefrigerator("LG","GL-B201",190,"Single Door","Direct Cool","2 Star",true,true,5,17000);
        boolean isRefrigerator5  = Refrigerator.createRefrigerator("LG","GL-S302",260,"Double Door","Frost Free","5 Star",true,true,10,35000);
        boolean isRefrigerator6  = Refrigerator.createRefrigerator("LG","GL-M302",285,"Double Door","Frost Free","4 Star",true,true,10,33000);
        boolean isRefrigerator7  = Refrigerator.createRefrigerator("LG","GL-H302",260,"Double Door","Frost Free","3 Star",true,true,10,29000);
        boolean isRefrigerator8  = Refrigerator.createRefrigerator("LG","GL-D241",215,"Single Door","Direct Cool","3 Star",true,true,10,21000);
        boolean isRefrigerator9  = Refrigerator.createRefrigerator("LG","GL-T262",253,"Double Door","Frost Free","4 Star",true,true,10,28000);
        boolean isRefrigerator10 = Refrigerator.createRefrigerator("LG","GL-I252",242,"Double Door","Frost Free","3 Star",true,true,10,25000);

        boolean isRefrigerator11 = Refrigerator.createRefrigerator("LG","GL-B292",260,"Double Door","Frost Free","2 Star",true,true,10,27000);
        boolean isRefrigerator12 = Refrigerator.createRefrigerator("LG","GL-M292",260,"Double Door","Frost Free","5 Star",true,true,10,36000);
        boolean isRefrigerator13 = Refrigerator.createRefrigerator("LG","GL-D191",180,"Single Door","Direct Cool","3 Star",true,true,5,16000);
        boolean isRefrigerator14 = Refrigerator.createRefrigerator("LG","GL-H191",185,"Single Door","Direct Cool","2 Star",true,true,5,15000);
        boolean isRefrigerator15 = Refrigerator.createRefrigerator("LG","GL-S191",190,"Single Door","Direct Cool","4 Star",true,true,5,19000);

        boolean isRefrigerator16 = Refrigerator.createRefrigerator(null,"GL-X",200,"Single Door","Direct Cool","3 Star",true,true,10,18000);
        boolean isRefrigerator17 = Refrigerator.createRefrigerator("LG","",200,"Single Door","Direct Cool","3 Star",true,true,10,18000);
        boolean isRefrigerator18 = Refrigerator.createRefrigerator("LG","GL-Y",0,"Single Door","Direct Cool","3 Star",true,true,10,18000);
        boolean isRefrigerator19 = Refrigerator.createRefrigerator("LG","GL-Z",200,"","Direct Cool","3 Star",true,true,10,18000);
        boolean isRefrigerator20 = Refrigerator.createRefrigerator("LG","GL-A",200,"Single Door","", "3 Star",true,true,10,18000);

        boolean isRefrigerator21 = Refrigerator.createRefrigerator("LG","GL-B",200,"Single Door","Direct Cool","",true,true,10,18000);
        boolean isRefrigerator22 = Refrigerator.createRefrigerator("LG","GL-C",200,"Single Door","Direct Cool","3 Star",false,true,10,18000);
        boolean isRefrigerator23 = Refrigerator.createRefrigerator("LG","GL-D",200,"Single Door","Direct Cool","3 Star",true,false,10,18000);
        boolean isRefrigerator24 = Refrigerator.createRefrigerator("LG","GL-E",200,"Single Door","Direct Cool","3 Star",true,true,0,18000);
        boolean isRefrigerator25 = Refrigerator.createRefrigerator("LG","GL-F",200,"Single Door","Direct Cool","3 Star",true,true,10,0);

        boolean isRefrigerator26 = Refrigerator.createRefrigerator("LG","GL-G",220,"Single Door","Direct Cool","3 Star",true,true,10,20000);
        boolean isRefrigerator27 = Refrigerator.createRefrigerator("LG","GL-H",240,"Double Door","Frost Free","4 Star",true,true,10,27000);
        boolean isRefrigerator28 = Refrigerator.createRefrigerator("LG","GL-I",260,"Double Door","Frost Free","5 Star",true,true,10,35000);
        boolean isRefrigerator29 = Refrigerator.createRefrigerator("LG","GL-J",300,"Double Door","Frost Free","3 Star",true,true,10,31000);
        boolean isRefrigerator30 = Refrigerator.createRefrigerator("LG","GL-K",340,"Double Door","Frost Free","4 Star",true,true,10,38000);

        boolean isRefrigerator31 = Refrigerator.createRefrigerator("LG","GL-L",190,"Single Door","Direct Cool","2 Star",true,true,5,15500);
        boolean isRefrigerator32 = Refrigerator.createRefrigerator("LG","GL-M",200,"Single Door","Direct Cool","3 Star",true,true,5,17000);
        boolean isRefrigerator33 = Refrigerator.createRefrigerator("LG","GL-N",210,"Single Door","Direct Cool","4 Star",true,true,5,19000);
        boolean isRefrigerator34 = Refrigerator.createRefrigerator("LG","GL-O",230,"Double Door","Frost Free","3 Star",true,true,10,26000);
        boolean isRefrigerator35 = Refrigerator.createRefrigerator("LG","GL-P",260,"Double Door","Frost Free","4 Star",true,true,10,29000);
        boolean isRefrigerator36 = Refrigerator.createRefrigerator("LG","GL-Q",300,"Double Door","Frost Free","5 Star",true,true,10,36000);
        boolean isRefrigerator37 = Refrigerator.createRefrigerator("LG","GL-R",350,"Double Door","Frost Free","4 Star",true,true,10,42000);

        if (isRefrigerator1 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator2 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator3 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator4 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator5 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator6 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator7 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator8 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator9 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator10 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator11 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator12 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator13 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator14 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator15 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator16 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator17 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator18 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator19 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator20 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator21 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator22 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator23 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator24 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator25 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator26 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator27 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator28 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator29 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator30 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator31 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator32 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator33 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator34 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator35 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator36 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else if (isRefrigerator37 == true) {
            Refrigerator.getRefrigeratorDetails();
        } else {
            System.out.println("No valid refrigerator details found");
        }
    }
}