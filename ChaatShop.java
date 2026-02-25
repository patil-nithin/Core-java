class ChaatShop{
public static void main(String[] args){


String chaatNames[]={"Pani puri","Sev puri","Bhel puri","Gobi"};
                         
				String panipuri= chaatNames[0];
				String Sevpuri= chaatNames[1];
				String Bhelpuri=chaatNames[2];
				String Gobi=chaatNames[3];
				int size = chaatNames.length;
				
                System.out.println("the No of chaats available are :"+ size);
			    System.out.println("the list of chaats available: ");
			    //System.out.println(panipuri+" "+Sevpuri+" "+Bhelpuri+" "+Gobi);
				for(String chaatName : chaatNames) {
					System.out.println(chaatName);
				}
}
}