class PharmaceuticalCompanyExecutor {

    public static void main(String[] args) {

        boolean isMedicine1  = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","500mg","Tablet",10,25,true);
        boolean isMedicine2  = PharmaceuticalCompany.createMedicine("Cipla","Azithromycin","Antibiotic","250mg","Tablet",6,120,true);
        boolean isMedicine3  = PharmaceuticalCompany.createMedicine("DrReddy","Metformin","Diabetes","500mg","Tablet",15,90,true);
        boolean isMedicine4  = PharmaceuticalCompany.createMedicine("Lupin","Amoxicillin","Antibiotic","500mg","Capsule",10,150,true);
        boolean isMedicine5  = PharmaceuticalCompany.createMedicine("Aurobindo","Ibuprofen","Pain Relief","400mg","Tablet",10,60,true);
        boolean isMedicine6  = PharmaceuticalCompany.createMedicine("Cipla","Cetirizine","Allergy","10mg","Tablet",10,40,true);
        boolean isMedicine7  = PharmaceuticalCompany.createMedicine("SunPharma","Pantoprazole","Gastric","40mg","Tablet",10,85,true);
        boolean isMedicine8  = PharmaceuticalCompany.createMedicine("DrReddy","Losartan","BP","50mg","Tablet",15,110,true);
        boolean isMedicine9  = PharmaceuticalCompany.createMedicine("Lupin","Amlodipine","BP","5mg","Tablet",10,70,true);
        boolean isMedicine10 = PharmaceuticalCompany.createMedicine("Cipla","Dolo650","Pain Relief","650mg","Tablet",15,30,true);

        boolean isMedicine11 = PharmaceuticalCompany.createMedicine("SunPharma","VitaminC","Supplement","500mg","Tablet",20,95,true);
        boolean isMedicine12 = PharmaceuticalCompany.createMedicine("Aurobindo","Calcium","Supplement","500mg","Tablet",15,120,true);
        boolean isMedicine13 = PharmaceuticalCompany.createMedicine("DrReddy","Insulin","Diabetes","10ml","Injection",1,450,true);
        boolean isMedicine14 = PharmaceuticalCompany.createMedicine("Lupin","Cough Syrup","Cold","100ml","Syrup",1,110,true);
        boolean isMedicine15 = PharmaceuticalCompany.createMedicine("Cipla","Asthalin","Asthma","100mcg","Inhaler",1,180,true);

        boolean isMedicine16 = PharmaceuticalCompany.createMedicine(null,"Paracetamol","Pain Relief","500mg","Tablet",10,25,true);
        boolean isMedicine17 = PharmaceuticalCompany.createMedicine("SunPharma","", "Pain Relief","500mg","Tablet",10,25,true);
        boolean isMedicine18 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","", "500mg","Tablet",10,25,true);
        boolean isMedicine19 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","", "Tablet",10,25,true);
        boolean isMedicine20 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","500mg","",10,25,true);

        boolean isMedicine21 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","500mg","Tablet",0,25,true);
        boolean isMedicine22 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","500mg","Tablet",10,0,true);
        boolean isMedicine23 = PharmaceuticalCompany.createMedicine("SunPharma","Paracetamol","Pain Relief","500mg","Tablet",10,25,false);
        boolean isMedicine24 = PharmaceuticalCompany.createMedicine("Cipla","Crocin","Pain Relief","500mg","Tablet",15,35,true);
        boolean isMedicine25 = PharmaceuticalCompany.createMedicine("DrReddy","Zinc","Supplement","20mg","Tablet",20,80,true);

        boolean isMedicine26 = PharmaceuticalCompany.createMedicine("Lupin","Omeprazole","Gastric","20mg","Capsule",10,95,true);
        boolean isMedicine27 = PharmaceuticalCompany.createMedicine("Aurobindo","VitaminD","Supplement","60000IU","Tablet",4,120,true);
        boolean isMedicine28 = PharmaceuticalCompany.createMedicine("SunPharma","Levothyroxine","Thyroid","50mcg","Tablet",30,140,true);
        boolean isMedicine29 = PharmaceuticalCompany.createMedicine("Cipla","ORS","Hydration","21g","Powder",5,50,true);
        boolean isMedicine30 = PharmaceuticalCompany.createMedicine("DrReddy","Multivitamin","Supplement","1tab","Tablet",30,180,true);

        boolean isMedicine31 = PharmaceuticalCompany.createMedicine("Lupin","PainReliefGel","Pain Relief","30g","Gel",1,90,true);
        boolean isMedicine32 = PharmaceuticalCompany.createMedicine("SunPharma","EyeDrop","Eye Care","10ml","Drops",1,75,true);
        boolean isMedicine33 = PharmaceuticalCompany.createMedicine("Cipla","NasalSpray","Cold","10ml","Spray",1,130,true);
        boolean isMedicine34 = PharmaceuticalCompany.createMedicine("DrReddy","Antacid","Gastric","200ml","Liquid",1,110,true);
        boolean isMedicine35 = PharmaceuticalCompany.createMedicine("Aurobindo","Antifungal","Skin","15g","Cream",1,95,true);
        boolean isMedicine36 = PharmaceuticalCompany.createMedicine("Lupin","Antiseptic","First Aid","100ml","Liquid",1,85,true);
        boolean isMedicine37 = PharmaceuticalCompany.createMedicine("SunPharma","PainPatch","Pain Relief","1patch","Patch",5,150,true);

        if (isMedicine1 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine2 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine3 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine4 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine5 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine6 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine7 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine8 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine9 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine10 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine11 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine12 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine13 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine14 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine15 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine16 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine17 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine18 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine19 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine20 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine21 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine22 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine23 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine24 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine25 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine26 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine27 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine28 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine29 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine30 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine31 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine32 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine33 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine34 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine35 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine36 == true) {
            PharmaceuticalCompany.getMedicine();
        } else if (isMedicine37 == true) {
            PharmaceuticalCompany.getMedicine();
        } else {
            System.out.println("No valid medicine details found");
        }
    }
}