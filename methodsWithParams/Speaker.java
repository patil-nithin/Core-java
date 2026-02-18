class Speaker{

    static boolean isConnected;


    static boolean onOrOff(){
		
		if(isConnected==false){
			isConnected=true;
			System.out.println("The speaker is turned on....");
		}else{
			isConnected=false;
			System.out.println("The speaker is turned off....");
		}
		
		
		return isConnected;
	}



}