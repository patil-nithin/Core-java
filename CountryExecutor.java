
class CountryExecutor {

	public static void main(String[] args) {
		

	String[] listOfCountries={
			"India", "USA", "South Korea", "North Korea", "Japan", "China", "Germany", 
			"France", "United Kingdom", "Canada", "Australia", "Brazil", "Russia", 
			"Italy", "Spain", "Mexico", "South Africa", "Argentina", "Indonesia", 
			"Saudi Arabia", "Turkey", "Iran", "Thailand", "Malaysia", "Philippines", 
			"Pakistan", "Bangladesh", "Egypt", "Nigeria", "Kenya", "Colombia", "Peru", 
			"Chile", "Venezuela", "Netherlands", "Belgium", "Switzerland", "Sweden", 
			"Norway", "Austria", "Greece", "Portugal", "New Zealand", "Ireland", 
			"United Arab Emirates", "Israel", "Vietnam", "Poland", "Ukraine", "Romania", 
			"Morocco", "Algeria", "Ethiopia", "Ghana", "Ecuador", "Bolivia", "Uruguay", 
			"Paraguay", "Denmark", "Finland", "Hungary", "Czech Republic", "Cuba", 
			"Costa Rica", "Afghanistan", "Iraq", "Syria", "Lebanon", "Jordan", "Yemen", 
			"Oman", "Kuwait", "Qatar", "Bahrain", "Nepal", "Sri Lanka", "Myanmar", 
			"Cambodia", "Laos", "Singapore", "Kazakhstan", "Uzbekistan", "Slovakia", 
			"Croatia", "Serbia", "Bulgaria", "Belarus", "Lithuania", "Latvia", "Estonia", 
			"Iceland", "Tanzania", "Uganda", "Zambia", "Zimbabwe", "Angola", "Madagascar", 
			"Senegal", "Guatemala", "Honduras", "El Salvador", "Nicaragua", "Panama", 
			"Dominican Republic", "Jamaica", "Haiti", "Mali", "Niger", "Chad", "Sudan", 
			"South Sudan", "Cameroon", "Democratic Republic of the Congo", 
			"Republic of the Congo", "Gabon", "Rwanda", "Burundi", "Malawi", "Mozambique", 
			"Botswana", "Namibia", "Tajikistan", "Kyrgyzstan", "Turkmenistan", "Mongolia", 
			"Slovenia", "Bosnia and Herzegovina", "Montenegro", "North Macedonia", 
			"Albania", "Moldova", "Luxembourg", "Malta", "Cyprus", "Belize", "Guyana", 
			"Suriname", "Papua New Guinea", "Fiji", "Solomon Islands", "Vanuatu", 
			"Bhutan", "Brunei", "Timor-Leste", "Maldives", "Bahamas", "Barbados", 
			"Antigua and Barbuda", "Saint Kitts and Nevis", "Saint Lucia", 
			"Saint Vincent and the Grenadines", "Grenada", "Trinidad and Tobago", 
			"Dominica", "Cape Verde", "São Tomé and Príncipe", "Equatorial Guinea", 
			"Guinea-Bissau", "Guinea", "Sierra Leone", "Liberia", "Côte d'Ivoire", 
			"Burkina Faso", "Togo", "Benin", "Central African Republic", "Djibouti", 
			"Eritrea", "Somalia", "Comoros", "Seychelles", "Mauritius", "Eswatini", 
			"Lesotho", "Andorra", "Monaco", "San Marino", "Vatican City", "Liechtenstein", 
			"Marshall Islands", "Micronesia", "Palau", "Nauru", "Kiribati", "Tuvalu", 
			"Samoa", "Tonga", "Mauritania", "Gambia", "Armenia", "Azerbaijan", "Georgia"
		};



  for (String listOfCountry: listOfCountries){
		String[] states= Country.findStatesByCountry(listOfCountry);
		System.out.println("The"+listOfCountry+"states are:");
		Country.getStates(states);
		System.out.println("-------------------------------------------------------------------");
  }


		
}

}






















/*class CountryExecutor {

	public static void main(String[] args) {

		String[] states = Country.findStatesByCountry("India");
		System.out.println("The India states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("USA");
		System.out.println("The USA states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("South Korea");
		System.out.println("The South Korea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("North Korea");
		System.out.println("The North Korea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Japan");
		System.out.println("The Japan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("China");
		System.out.println("The China states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Germany");
		System.out.println("The Germany states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("France");
		System.out.println("The France states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("United Kingdom");
		System.out.println("The United Kingdom states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Canada");
		System.out.println("The Canada states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Australia");
		System.out.println("The Australia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Brazil");
		System.out.println("The Brazil states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Russia");
		System.out.println("The Russia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Italy");
		System.out.println("The Italy states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Spain");
		System.out.println("The Spain states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mexico");
		System.out.println("The Mexico states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("South Africa");
		System.out.println("The South Africa states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Argentina");
		System.out.println("The Argentina states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Indonesia");
		System.out.println("The Indonesia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Saudi Arabia");
		System.out.println("The Saudi Arabia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Turkey");
		System.out.println("The Turkey states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Iran");
		System.out.println("The Iran states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Thailand");
		System.out.println("The Thailand states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Malaysia");
		System.out.println("The Malaysia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Philippines");
		System.out.println("The Philippines states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Pakistan");
		System.out.println("The Pakistan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bangladesh");
		System.out.println("The Bangladesh states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Egypt");
		System.out.println("The Egypt states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Nigeria");
		System.out.println("The Nigeria states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Kenya");
		System.out.println("The Kenya states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Colombia");
		System.out.println("The Colombia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Peru");
		System.out.println("The Peru states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Chile");
		System.out.println("The Chile states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Venezuela");
		System.out.println("The Venezuela states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Netherlands");
		System.out.println("The Netherlands states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Belgium");
		System.out.println("The Belgium states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Switzerland");
		System.out.println("The Switzerland states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Sweden");
		System.out.println("The Sweden states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Norway");
		System.out.println("The Norway states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Austria");
		System.out.println("The Austria states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Greece");
		System.out.println("The Greece states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Portugal");
		System.out.println("The Portugal states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("New Zealand");
		System.out.println("The New Zealand states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Ireland");
		System.out.println("The Ireland states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("United Arab Emirates");
		System.out.println("The United Arab Emirates states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Israel");
		System.out.println("The Israel states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Vietnam");
		System.out.println("The Vietnam states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Poland");
		System.out.println("The Poland states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Ukraine");
		System.out.println("The Ukraine states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Romania");
		System.out.println("The Romania states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Morocco");
		System.out.println("The Morocco states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Algeria");
		System.out.println("The Algeria states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Ethiopia");
		System.out.println("The Ethiopia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Ghana");
		System.out.println("The Ghana states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Ecuador");
		System.out.println("The Ecuador states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bolivia");
		System.out.println("The Bolivia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Uruguay");
		System.out.println("The Uruguay states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Paraguay");
		System.out.println("The Paraguay states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Denmark");
		System.out.println("The Denmark states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Finland");
		System.out.println("The Finland states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Hungary");
		System.out.println("The Hungary states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Czech Republic");
		System.out.println("The Czech Republic states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Cuba");
		System.out.println("The Cuba states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Costa Rica");
		System.out.println("The Costa Rica states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Afghanistan");
		System.out.println("The Afghanistan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Iraq");
		System.out.println("The Iraq states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Syria");
		System.out.println("The Syria states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Lebanon");
		System.out.println("The Lebanon states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Jordan");
		System.out.println("The Jordan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Yemen");
		System.out.println("The Yemen states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Oman");
		System.out.println("The Oman states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Kuwait");
		System.out.println("The Kuwait states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Qatar");
		System.out.println("The Qatar states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bahrain");
		System.out.println("The Bahrain states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Nepal");
		System.out.println("The Nepal states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Sri Lanka");
		System.out.println("The Sri Lanka states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Myanmar");
		System.out.println("The Myanmar states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Cambodia");
		System.out.println("The Cambodia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Laos");
		System.out.println("The Laos states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Singapore");
		System.out.println("The Singapore states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Kazakhstan");
		System.out.println("The Kazakhstan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Uzbekistan");
		System.out.println("The Uzbekistan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Slovakia");
		System.out.println("The Slovakia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Croatia");
		System.out.println("The Croatia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Serbia");
		System.out.println("The Serbia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bulgaria");
		System.out.println("The Bulgaria states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Belarus");
		System.out.println("The Belarus states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Lithuania");
		System.out.println("The Lithuania states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Latvia");
		System.out.println("The Latvia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Estonia");
		System.out.println("The Estonia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Iceland");
		System.out.println("The Iceland states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Tanzania");
		System.out.println("The Tanzania states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Uganda");
		System.out.println("The Uganda states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Zambia");
		System.out.println("The Zambia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Zimbabwe");
		System.out.println("The Zimbabwe states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Angola");
		System.out.println("The Angola states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Madagascar");
		System.out.println("The Madagascar states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Senegal");
		System.out.println("The Senegal states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Guatemala");
		System.out.println("The Guatemala states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Honduras");
		System.out.println("The Honduras states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("El Salvador");
		System.out.println("The El Salvador states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Nicaragua");
		System.out.println("The Nicaragua states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Panama");
		System.out.println("The Panama states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Dominican Republic");
		System.out.println("The Dominican Republic states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Jamaica");
		System.out.println("The Jamaica states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Haiti");
		System.out.println("The Haiti states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mali");
		System.out.println("The Mali states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Niger");
		System.out.println("The Niger states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Chad");
		System.out.println("The Chad states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Sudan");
		System.out.println("The Sudan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("South Sudan");
		System.out.println("The South Sudan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Cameroon");
		System.out.println("The Cameroon states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Democratic Republic of the Congo");
		System.out.println("The Democratic Republic of the Congo states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Republic of the Congo");
		System.out.println("The Republic of the Congo states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Gabon");
		System.out.println("The Gabon states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Rwanda");
		System.out.println("The Rwanda states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Burundi");
		System.out.println("The Burundi states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Malawi");
		System.out.println("The Malawi states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mozambique");
		System.out.println("The Mozambique states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Botswana");
		System.out.println("The Botswana states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Namibia");
		System.out.println("The Namibia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Tajikistan");
		System.out.println("The Tajikistan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Kyrgyzstan");
		System.out.println("The Kyrgyzstan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Turkmenistan");
		System.out.println("The Turkmenistan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mongolia");
		System.out.println("The Mongolia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Slovenia");
		System.out.println("The Slovenia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bosnia and Herzegovina");
		System.out.println("The Bosnia and Herzegovina states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Montenegro");
		System.out.println("The Montenegro states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("North Macedonia");
		System.out.println("The North Macedonia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Albania");
		System.out.println("The Albania states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Moldova");
		System.out.println("The Moldova states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Luxembourg");
		System.out.println("The Luxembourg states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Malta");
		System.out.println("The Malta states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Cyprus");
		System.out.println("The Cyprus states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Belize");
		System.out.println("The Belize states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Guyana");
		System.out.println("The Guyana states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Suriname");
		System.out.println("The Suriname states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Papua New Guinea");
		System.out.println("The Papua New Guinea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Fiji");
		System.out.println("The Fiji states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Solomon Islands");
		System.out.println("The Solomon Islands states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Vanuatu");
		System.out.println("The Vanuatu states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bhutan");
		System.out.println("The Bhutan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Brunei");
		System.out.println("The Brunei states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Timor-Leste");
		System.out.println("The Timor-Leste states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Maldives");
		System.out.println("The Maldives states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Bahamas");
		System.out.println("The Bahamas states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Barbados");
		System.out.println("The Barbados states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Antigua and Barbuda");
		System.out.println("The Antigua and Barbuda states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Saint Kitts and Nevis");
		System.out.println("The Saint Kitts and Nevis states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Saint Lucia");
		System.out.println("The Saint Lucia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Saint Vincent and the Grenadines");
		System.out.println("The Saint Vincent and the Grenadines states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Grenada");
		System.out.println("The Grenada states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Trinidad and Tobago");
		System.out.println("The Trinidad and Tobago states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Dominica");
		System.out.println("The Dominica states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Cape Verde");
		System.out.println("The Cape Verde states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("São Tomé and Príncipe");
		System.out.println("The São Tomé and Príncipe states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Equatorial Guinea");
		System.out.println("The Equatorial Guinea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Guinea-Bissau");
		System.out.println("The Guinea-Bissau states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Guinea");
		System.out.println("The Guinea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Sierra Leone");
		System.out.println("The Sierra Leone states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Liberia");
		System.out.println("The Liberia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Côte d'Ivoire");
		System.out.println("The Côte d'Ivoire states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Burkina Faso");
		System.out.println("The Burkina Faso states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Togo");
		System.out.println("The Togo states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Benin");
		System.out.println("The Benin states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Central African Republic");
		System.out.println("The Central African Republic states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Djibouti");
		System.out.println("The Djibouti states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Eritrea");
		System.out.println("The Eritrea states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Somalia");
		System.out.println("The Somalia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Comoros");
		System.out.println("The Comoros states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Seychelles");
		System.out.println("The Seychelles states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mauritius");
		System.out.println("The Mauritius states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Eswatini");
		System.out.println("The Eswatini states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Lesotho");
		System.out.println("The Lesotho states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Andorra");
		System.out.println("The Andorra states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Monaco");
		System.out.println("The Monaco states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("San Marino");
		System.out.println("The San Marino states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Vatican City");
		System.out.println("The Vatican City states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Liechtenstein");
		System.out.println("The Liechtenstein states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Marshall Islands");
		System.out.println("The Marshall Islands states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Micronesia");
		System.out.println("The Micronesia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Palau");
		System.out.println("The Palau states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Nauru");
		System.out.println("The Nauru states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Kiribati");
		System.out.println("The Kiribati states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Tuvalu");
		System.out.println("The Tuvalu states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Samoa");
		System.out.println("The Samoa states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Tonga");
		System.out.println("The Tonga states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Mauritania");
		System.out.println("The Mauritania states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Gambia");
		System.out.println("The Gambia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Armenia");
		System.out.println("The Armenia states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Azerbaijan");
		System.out.println("The Azerbaijan states are:");
		Country.getStates(states);

		states = Country.findStatesByCountry("Georgia");
		System.out.println("The Georgia states are:");
		Country.getStates(states);

	}

}*/
