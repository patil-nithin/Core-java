
class Country{

static String[] findStatesByCountry(String countryName){
	
	if(countryName=="India"){
		String[] stateNames={"Karnataka","Maharashtra","Tamil Nadu","Kerala","Telangana","Andhra Pradesh","Uttar Pradesh","Rajasthan","Gujarat","Punjab","Haryana","West Bengal","Bihar","Odisha","Madhya Pradesh","Chhattisgarh","Jharkhand","Assam","Goa","Himachal Pradesh","Uttarakhand","Manipur","Meghalaya","Tripura","Nagaland","Mizoram","Sikkim","Arunachal Pradesh"};
		return stateNames;
	}
	
	else if(countryName=="USA"){	
		String[] stateNames={"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		return stateNames;	
	}


	else if(countryName=="South Korea"){
		String[] stateNames={"Seoul","Busan","Daegu","Incheon","Gwangju","Daejeon","Ulsan","Sejong","Gyeonggi","Gangwon","North Chungcheong","South Chungcheong","North Jeolla","South Jeolla","North Gyeongsang","South Gyeongsang","Jeju"};
		return stateNames;
	}
	
	else if(countryName=="North Korea"){
		String[] stateNames={"Pyongyang","Rason","Nampo","Kaesong","North Pyongan","South Pyongan","Chagang","North Hamgyong","South Hamgyong","Ryanggang","North Hwanghae","South Hwanghae","Kangwon"};
		return stateNames;
	}
	
	else if(countryName=="Japan"){	
		String[] stateNames={"Hokkaido","Aomori","Iwate","Miyagi","Akita","Yamagata","Fukushima","Ibaraki","Tochigi","Gunma","Saitama","Chiba","Tokyo","Kanagawa","Niigata","Toyama","Ishikawa","Fukui","Yamanashi","Nagano","Gifu","Shizuoka","Aichi","Mie","Shiga","Kyoto","Osaka","Hyogo","Nara","Wakayama","Tottori","Shimane","Okayama","Hiroshima","Yamaguchi","Tokushima","Kagawa","Ehime","Kochi","Fukuoka","Saga","Nagasaki","Kumamoto","Oita","Miyazaki","Kagoshima","Okinawa"};
		return stateNames;
	}
	
	else if(countryName=="China"){
		String[] stateNames={"Anhui","Fujian","Gansu","Guangdong","Guizhou","Hainan","Hebei","Heilongjiang","Henan","Hubei","Hunan","Jiangsu","Jiangxi","Jilin","Liaoning","Qinghai","Shaanxi","Shandong","Shanxi","Sichuan","Yunnan","Zhejiang","Taiwan","Guangxi","Inner Mongolia","Ningxia","Tibet","Xinjiang","Beijing","Shanghai","Tianjin","Chongqing","Hong Kong","Macau"};
		return stateNames;
	}
	
	else if(countryName=="Germany"){
		String[] stateNames={"Bavaria","Berlin","Brandenburg","Bremen","Hamburg","Hesse","Lower Saxony","Mecklenburg-Vorpommern","North Rhine-Westphalia","Rhineland-Palatinate","Saarland","Saxony","Saxony-Anhalt","Schleswig-Holstein","Thuringia"};
		return stateNames;
	}

	else if(countryName=="France"){
		String[] stateNames={"Auvergne-Rhône-Alpes","Bourgogne-Franche-Comté","Brittany","Centre-Val de Loire","Corsica","Grand Est","Hauts-de-France","Île-de-France","Normandy","Nouvelle-Aquitaine","Occitanie","Pays de la Loire","Provence-Alpes-Côte d’Azur"};
		return stateNames;
	}

	else if(countryName=="United Kingdom"){
		String[] stateNames={"England","Scotland","Wales","Northern Ireland"};
		return stateNames;
	}

	else if(countryName=="Canada"){
		String[] stateNames={"Ontario","Quebec","British Columbia","Alberta","Manitoba","Saskatchewan","Nova Scotia","New Brunswick","Newfoundland and Labrador","Prince Edward Island","Northwest Territories","Yukon","Nunavut"};
		return stateNames;
	}

	else if(countryName=="Australia"){
		String[] stateNames={"New South Wales","Victoria","Queensland","Western Australia","South Australia","Tasmania","Northern Territory","Australian Capital Territory"};
		return stateNames;
	}

	else if(countryName=="Brazil"){
		String[] stateNames={"Acre","Alagoas","Amapá","Amazonas","Bahia","Ceará","Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Pará","Paraíba","Paraná","Pernambuco","Piauí","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins","Federal District"};
		return stateNames;
	}

	else if(countryName=="Russia"){
		String[] stateNames={"Moscow","Saint Petersburg","Siberia","Ural","Volga","Far Eastern","North Caucasus","Southern","Central","Northwestern"};
		return stateNames;
	}

	else if(countryName=="Italy"){
		String[] stateNames={"Abruzzo","Basilicata","Calabria","Campania","Emilia-Romagna","Friuli-Venezia Giulia","Lazio","Liguria","Lombardy","Marche","Molise","Piedmont","Puglia","Sardinia","Sicily","Trentino-Alto Adige","Tuscany","Umbria","Valle d’Aosta","Veneto"};
		return stateNames;
	}

	else if(countryName=="Spain"){
		String[] stateNames={"Andalusia","Aragon","Asturias","Balearic Islands","Basque Country","Canary Islands","Cantabria","Castile and León","Castile-La Mancha","Catalonia","Extremadura","Galicia","La Rioja","Madrid","Murcia","Navarre","Valencian Community"};
		return stateNames;
	}

	else if(countryName=="Mexico"){
		String[] stateNames={"Aguascalientes","Baja California","Baja California Sur","Campeche","Chiapas","Chihuahua","Coahuila","Colima","Durango","Guanajuato","Guerrero","Hidalgo","Jalisco","Mexico City","Mexico State","Michoacán","Morelos","Nayarit","Nuevo León","Oaxaca","Puebla","Querétaro","Quintana Roo","San Luis Potosí","Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatán","Zacatecas"};
		return stateNames;
	}

	else if(countryName=="South Africa"){
		String[] stateNames={"Eastern Cape","Free State","Gauteng","KwaZulu-Natal","Limpopo","Mpumalanga","Northern Cape","North West","Western Cape"};
		return stateNames;
	}

	else if(countryName=="Argentina"){
		String[] stateNames={"Buenos Aires","Catamarca","Chaco","Chubut","Córdoba","Corrientes","Entre Ríos","Formosa","Jujuy","La Pampa","La Rioja","Mendoza","Misiones","Neuquén","Río Negro","Salta","San Juan","San Luis","Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego","Tucumán"};
		return stateNames;
	}

	else if(countryName=="Indonesia"){
		String[] stateNames={"Aceh","Bali","Banten","Bengkulu","Central Java","Central Kalimantan","Central Sulawesi","East Java","East Kalimantan","East Nusa Tenggara","Gorontalo","Jakarta","Jambi","Lampung","Maluku","North Kalimantan","North Maluku","North Sulawesi","North Sumatra","Papua","Riau","Riau Islands","South Kalimantan","South Sulawesi","South Sumatra","West Java","West Kalimantan","West Nusa Tenggara","West Papua","West Sulawesi","West Sumatra","Yogyakarta"};
		return stateNames;
	}

	else if(countryName=="Saudi Arabia"){
		String[] stateNames={"Riyadh","Mecca","Medina","Eastern Province","Asir","Tabuk","Hail","Northern Borders","Jazan","Najran","Al Bahah","Al Jawf","Qassim"};
		return stateNames;
	}

	else if(countryName=="Turkey"){
		String[] stateNames={"Adana","Ankara","Antalya","Bursa","Istanbul","Izmir","Konya","Gaziantep","Kayseri","Mersin","Samsun","Trabzon","Van"};
		return stateNames;
	}

	else if(countryName=="Iran"){
		String[] stateNames={"Tehran","Isfahan","Fars","Khuzestan","East Azerbaijan","West Azerbaijan","Kerman","Kurdistan","Mazandaran","Gilan","Hormozgan","Yazd","Qom","Alborz"};
		return stateNames;
	}

	else if(countryName=="Thailand"){
		String[] stateNames={"Bangkok","Chiang Mai","Chiang Rai","Phuket","Krabi","Chonburi","Rayong","Ayutthaya","Nakhon Ratchasima","Udon Thani","Khon Kaen","Surat Thani"};
		return stateNames;
	}

	else if(countryName=="Malaysia"){
		String[] stateNames={"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan","Pahang","Penang","Perak","Perlis","Sabah","Sarawak","Selangor","Terengganu","Kuala Lumpur","Putrajaya","Labuan"};
		return stateNames;
	}

	else if(countryName=="Philippines"){
		String[] stateNames={"Ilocos","Cagayan Valley","Central Luzon","Calabarzon","Mimaropa","Bicol","Western Visayas","Central Visayas","Eastern Visayas","Zamboanga Peninsula","Northern Mindanao","Davao","Soccsksargen","Caraga","Bangsamoro","Metro Manila"};
		return stateNames;
	}


	else if(countryName=="Thailand"){
		String[] stateNames={"Bangkok","Chiang Mai","Chiang Rai","Phuket","Krabi","Chonburi","Rayong","Ayutthaya","Nakhon Ratchasima","Udon Thani","Khon Kaen","Surat Thani"};
		return stateNames;
	}


	else if(countryName=="Malaysia"){
		String[] stateNames={"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan","Pahang","Penang","Perak","Perlis","Sabah","Sarawak","Selangor","Terengganu","Kuala Lumpur","Putrajaya","Labuan"};
		return stateNames;
	}

	else if(countryName=="Pakistan"){
		String[] stateNames={"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan","Gilgit-Baltistan","Azad Kashmir","Islamabad Capital Territory"};
		return stateNames;
	}

	else if(countryName=="Bangladesh"){
		String[] stateNames={"Dhaka","Chittagong","Rajshahi","Khulna","Barisal","Sylhet","Rangpur","Mymensingh"};
		return stateNames;
	}

	else if(countryName=="Egypt"){
		String[] stateNames={"Cairo","Alexandria","Giza","Qalyubia","Port Said","Suez","Luxor","Aswan","Red Sea","South Sinai","North Sinai","Matrouh","Faiyum","Minya","Asyut","Sohag","Qena","Ismailia","Damietta","Dakahlia","Sharqia","Gharbia","Kafr El Sheikh","Monufia","Beheira","Beni Suef","New Valley"};
		return stateNames;
	}

	else if(countryName=="Nigeria"){
		String[] stateNames={"Abia","Adamawa","Akwa Ibom","Anambra","Bauchi","Bayelsa","Benue","Borno","Cross River","Delta","Ebonyi","Edo","Ekiti","Enugu","Gombe","Imo","Jigawa","Kaduna","Kano","Katsina","Kebbi","Kogi","Kwara","Lagos","Nasarawa","Niger","Ogun","Ondo","Osun","Oyo","Plateau","Rivers","Sokoto","Taraba","Yobe","Zamfara","Federal Capital Territory"};
		return stateNames;
	}

	else if(countryName=="Kenya"){
		String[] stateNames={"Mombasa","Kwale","Kilifi","Tana River","Lamu","Taita-Taveta","Garissa","Wajir","Mandera","Marsabit","Isiolo","Meru","Tharaka-Nithi","Embu","Kitui","Machakos","Makueni","Nyandarua","Nyeri","Kirinyaga","Murang'a","Kiambu","Turkana","West Pokot","Samburu","Trans-Nzoia","Uasin Gishu","Elgeyo-Marakwet","Nandi","Baringo","Laikipia","Nakuru","Narok","Kajiado","Kericho","Bomet","Kakamega","Vihiga","Bungoma","Busia","Siaya","Kisumu","Homa Bay","Migori","Kisii","Nyamira","Nairobi"};
		return stateNames;
	}

	else if(countryName=="Colombia"){
		String[] stateNames={"Amazonas","Antioquia","Arauca","Atlántico","Bolívar","Boyacá","Caldas","Caquetá","Casanare","Cauca","Cesar","Chocó","Córdoba","Cundinamarca","Guainía","Guaviare","Huila","La Guajira","Magdalena","Meta","Nariño","Norte de Santander","Putumayo","Quindío","Risaralda","San Andrés y Providencia","Santander","Sucre","Tolima","Valle del Cauca","Vaupés","Vichada","Bogotá"};
		return stateNames;
	}

	else if(countryName=="Peru"){
		String[] stateNames={"Amazonas","Ancash","Apurímac","Arequipa","Ayacucho","Cajamarca","Callao","Cusco","Huancavelica","Huánuco","Ica","Junín","La Libertad","Lambayeque","Lima","Loreto","Madre de Dios","Moquegua","Pasco","Piura","Puno","San Martín","Tacna","Tumbes","Ucayali"};
		return stateNames;
	}

	else if(countryName=="Chile"){
		String[] stateNames={"Arica y Parinacota","Tarapacá","Antofagasta","Atacama","Coquimbo","Valparaíso","Metropolitana de Santiago","O'Higgins","Maule","Ñuble","Biobío","Araucanía","Los Ríos","Los Lagos","Aysén","Magallanes"};
		return stateNames;
	}

	else if(countryName=="Venezuela"){
		String[] stateNames={"Amazonas","Anzoátegui","Apure","Aragua","Barinas","Bolívar","Carabobo","Cojedes","Delta Amacuro","Falcón","Guárico","Lara","Mérida","Miranda","Monagas","Nueva Esparta","Portuguesa","Sucre","Táchira","Trujillo","La Guaira","Yaracuy","Zulia","Capital District"};
		return stateNames;
	}

	else if(countryName=="Netherlands"){
		String[] stateNames={"Drenthe","Flevoland","Friesland","Gelderland","Groningen","Limburg","North Brabant","North Holland","Overijssel","South Holland","Utrecht","Zeeland"};
		return stateNames;
	}

	else if(countryName=="Belgium"){
		String[] stateNames={"Antwerp","East Flanders","Flemish Brabant","Limburg","West Flanders","Hainaut","Liège","Luxembourg","Namur","Walloon Brabant","Brussels Capital Region"};
		return stateNames;
	}

	else if(countryName=="Switzerland"){
		String[] stateNames={"Aargau","Appenzell Ausserrhoden","Appenzell Innerrhoden","Basel-Landschaft","Basel-Stadt","Bern","Fribourg","Geneva","Glarus","Graubünden","Jura","Lucerne","Neuchâtel","Nidwalden","Obwalden","Schaffhausen","Schwyz","Solothurn","St. Gallen","Thurgau","Ticino","Uri","Valais","Vaud","Zug","Zurich"};
		return stateNames;
	}

	else if(countryName=="Sweden"){
		String[] stateNames={"Stockholm","Västerbotten","Norrbotten","Uppsala","Södermanland","Östergötland","Jönköping","Kronoberg","Kalmar","Gotland","Blekinge","Skåne","Halland","Västra Götaland","Värmland","Örebro","Västmanland","Dalarna","Gävleborg","Västernorrland","Jämtland"};
		return stateNames;
	}

	else if(countryName=="Norway"){
		String[] stateNames={"Agder","Innlandet","Møre og Romsdal","Nordland","Oslo","Rogaland","Troms og Finnmark","Trøndelag","Vestfold og Telemark","Vestland","Viken"};
		return stateNames;
	}

	else if(countryName=="Austria"){
		String[] stateNames={"Burgenland","Carinthia","Lower Austria","Salzburg","Styria","Tyrol","Upper Austria","Vienna","Vorarlberg"};
		return stateNames;
	}

	else if(countryName=="Greece"){
		String[] stateNames={"Attica","Central Greece","Central Macedonia","Crete","Eastern Macedonia and Thrace","Epirus","Ionian Islands","North Aegean","Peloponnese","South Aegean","Thessaly","Western Greece","Western Macedonia","Mount Athos"};
		return stateNames;
	}

	else if(countryName=="Portugal"){
		String[] stateNames={"Alentejo","Algarve","Central","Lisbon","Northern","Azores","Madeira"};
		return stateNames;
	}

	else if(countryName=="New Zealand"){
		String[] stateNames={"Northland","Auckland","Waikato","Bay of Plenty","Gisborne","Hawke's Bay","Taranaki","Manawatū-Whanganui","Wellington","Tasman","Nelson","Marlborough","West Coast","Canterbury","Otago","Southland"};
		return stateNames;
	}

	else if(countryName=="Ireland"){
		String[] stateNames={"Carlow","Cavan","Clare","Cork","Donegal","Dublin","Galway","Kerry","Kildare","Kilkenny","Laois","Leitrim","Limerick","Longford","Louth","Mayo","Meath","Monaghan","Offaly","Roscommon","Sligo","Tipperary","Waterford","Westmeath","Wexford","Wicklow"};
		return stateNames;
	}

	else if(countryName=="United Arab Emirates"){
		String[] stateNames={"Abu Dhabi","Dubai","Sharjah","Ajman","Umm Al Quwain","Ras Al Khaimah","Fujairah"};
		return stateNames;
	}

	else if(countryName=="Israel"){
		String[] stateNames={"Northern","Haifa","Central","Tel Aviv","Jerusalem","Southern"};
		return stateNames;
	}

	else if(countryName=="Vietnam"){
		String[] stateNames={"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong","Can Tho","An Giang","Ba Ria-Vung Tau","Bac Giang","Bac Kan","Bac Lieu","Bac Ninh","Ben Tre","Binh Dinh","Binh Duong","Binh Phuoc","Binh Thuan","Ca Mau","Cao Bang","Dak Lak","Dak Nong","Dien Bien","Dong Nai","Dong Thap","Gia Lai","Ha Giang","Ha Nam","Ha Tinh","Hai Duong","Hau Giang","Hoa Binh","Hung Yen","Khanh Hoa","Kien Giang","Kon Tum","Lai Chau","Lam Dong","Lang Son","Lao Cai","Long An","Nam Dinh","Nghe An","Ninh Binh","Ninh Thuan","Phu Tho","Quang Binh","Quang Nam","Quang Ngai","Quang Ninh","Quang Tri","Soc Trang","Son La","Tay Ninh","Thai Binh","Thai Nguyen","Thanh Hoa","Thua Thien Hue","Tien Giang","Tra Vinh","Tuyen Quang","Vinh Long","Vinh Phuc","Yen Bai"};
		return stateNames;
	}

	else if(countryName=="Poland"){
		String[] stateNames={"Greater Poland","Kuyavian-Pomeranian","Lesser Poland","Lodz","Lower Silesian","Lublin","Lubusz","Masovian","Opole","Podkarpackie","Podlaskie","Pomeranian","Silesian","Holy Cross","Warmian-Masurian","West Pomeranian"};
		return stateNames;
	}

	else if(countryName=="Ukraine"){
		String[] stateNames={"Cherkasy","Chernihiv","Chernivtsi","Dnipropetrovsk","Donetsk","Ivano-Frankivsk","Kharkiv","Kherson","Khmelnytskyi","Kyiv","Kirovohrad","Luhansk","Lviv","Mykolaiv","Odesa","Poltava","Rivne","Sumy","Ternopil","Vinnytsia","Volyn","Zakarpattia","Zaporizhzhia","Zhytomyr","Crimea"};
		return stateNames;
	}

	else if(countryName=="Romania"){
		String[] stateNames={"Alba","Arad","Argeș","Bacău","Bihor","Bistrița-Năsăud","Botoșani","Brașov","Brăila","Buzău","Caraș-Severin","Călărași","Cluj","Constanța","Covasna","Dâmbovița","Dolj","Galați","Giurgiu","Gorj","Harghita","Hunedoara","Ialomița","Iași","Ilfov","Maramureș","Mehedinți","Mureș","Neamț","Olt","Prahova","Satu Mare","Sălaj","Sibiu","Suceava","Teleorman","Timiș","Tulcea","Vaslui","Vâlcea","Vrancea","Bucharest"};
		return stateNames;
	}

	else if(countryName=="Morocco"){
		String[] stateNames={"Tanger-Tetouan-Al Hoceima","Oriental","Fès-Meknès","Rabat-Salé-Kénitra","Béni Mellal-Khénifra","Casablanca-Settat","Marrakesh-Safi","Drâa-Tafilalet","Souss-Massa","Guelmim-Oued Noun","Laâyoune-Sakia El Hamra","Dakhla-Oued Ed-Dahab"};
		return stateNames;
	}

	else if(countryName=="Algeria"){
		String[] stateNames={"Adrar","Chlef","Laghouat","Oum El Bouaghi","Batna","Béjaïa","Biskra","Béchar","Blida","Bouira","Tamanrasset","Tébessa","Tlemcen","Tiaret","Tizi Ouzou","Algiers","Djelfa","Jijel","Sétif","Saïda","Skikda","Sidi Bel Abbès","Annaba","Guelma","Constantine","Médéa","Mostaganem","M'Sila","Mascara","Ouargla","Oran","El Bayadh","Illizi","Bordj Bou Arréridj","Boumerdès","El Tarf","Tindouf","Tissemsilt","El Oued","Khenchela","Souk Ahras","Tipaza","Mila","Aïn Defla","Naâma","Aïn Témouchent","Ghardaïa","Relizane"};
		return stateNames;
	}

	else if(countryName=="Ethiopia"){
		String[] stateNames={"Afar","Amhara","Benishangul-Gumuz","Gambela","Harari","Oromia","Sidama","Somali","South West Ethiopia Peoples' Region","Southern Nations, Nationalities, and Peoples' Region","Tigray","Addis Ababa","Dire Dawa"};
		return stateNames;
	}

	else if(countryName=="Ghana"){
		String[] stateNames={"Ashanti","Ahafo","Bono","Bono East","Central","Eastern","Greater Accra","Northern","Savannah","North East","Upper East","Upper West","Volta","Oti","Western","Western North"};
		return stateNames;
	}

	else if(countryName=="Ecuador"){
		String[] stateNames={"Azuay","Bolívar","Cañar","Carchi","Chimborazo","Cotopaxi","El Oro","Esmeraldas","Galápagos","Guayas","Imbabura","Loja","Los Ríos","Manabí","Morona-Santiago","Napo","Orellana","Pastaza","Pichincha","Santa Elena","Santo Domingo de los Tsáchilas","Sucumbíos","Tungurahua","Zamora-Chinchipe"};
		return stateNames;
	}

	else if(countryName=="Bolivia"){
		String[] stateNames={"Beni","Chuquisaca","Cochabamba","La Paz","Oruro","Pando","Potosí","Santa Cruz","Tarija"};
		return stateNames;
	}

	else if(countryName=="Uruguay"){
		String[] stateNames={"Artigas","Canelones","Cerro Largo","Colonia","Durazno","Flores","Florida","Lavalleja","Maldonado","Montevideo","Paysandú","Río Negro","Rivera","Rocha","Salto","San José","Soriano","Tacuarembó","Treinta y Tres"};
		return stateNames;
	}

	else if(countryName=="Paraguay"){
		String[] stateNames={"Alto Paraguay","Alto Paraná","Amambay","Boquerón","Caaguazú","Caazapá","Canindeyú","Central","Concepción","Cordillera","Guairá","Itapúa","Misiones","Ñeembucú","Paraguarí","Presidente Hayes","San Pedro","Asunción"};
		return stateNames;
	}

	else if(countryName=="Denmark"){
		String[] stateNames={"Capital Region of Denmark","Central Denmark Region","North Denmark Region","Region Zealand","Region of Southern Denmark"};
		return stateNames;
	}

	else if(countryName=="Finland"){
		String[] stateNames={"Lapland","North Ostrobothnia","Kainuu","North Karelia","Northern Savonia","Southern Savonia","South Karelia","Central Finland","South Ostrobothnia","Ostrobothnia","Central Ostrobothnia","Pirkanmaa","Satakunta","Päijänne Tavastia","Tavastia Proper","Kymenlaakso","Uusimaa","Southwest Finland","Åland"};
		return stateNames;
	}

	else if(countryName=="Hungary"){
		String[] stateNames={"Bács-Kiskun","Baranya","Békés","Borsod-Abaúj-Zemplén","Csongrád-Csanád","Fejér","Győr-Moson-Sopron","Hajdú-Bihar","Heves","Jász-Nagykun-Szolnok","Komárom-Esztergom","Nógrád","Pest","Somogy","Szabolcs-Szatmár-Bereg","Tolna","Vas","Veszprém","Zala","Budapest"};
		return stateNames;
	}

	else if(countryName=="Czech Republic"){
		String[] stateNames={"Prague","Central Bohemian","South Bohemian","Plzen","Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove","Pardubice","Vysocina","South Moravian","Olomouc","Zlin","Moravian-Silesian"};
		return stateNames;
	}

	else if(countryName=="Cuba"){
		String[] stateNames={"Artemisa","Camaguey","Ciego de Avila","Cienfuegos","Granma","Guantanamo","Holguin","La Habana","Las Tunas","Matanzas","Mayabeque","Pinar del Rio","Sancti Spiritus","Santiago de Cuba","Isla de la Juventud"};
		return stateNames;
	}

	else if(countryName=="Costa Rica"){
		String[] stateNames={"Alajuela","Cartago","Guanacaste","Heredia","Limón","Puntarenas","San José"};
		return stateNames;
	}

	else if(countryName=="Afghanistan"){
		String[] stateNames={"Badakhshan","Badghis","Baghlan","Balkh","Bamyan","Daykundi","Farah","Faryab","Ghazni","Ghor","Helmand","Herat","Jowzjan","Kabul","Kandahar","Kapisa","Khost","Kunar","Kunduz","Laghman","Logar","Nangarhar","Nimruz","Nuristan","Paktia","Paktika","Panjshir","Parwan","Samangan","Sar-e Pol","Takhar","Uruzgan","Wardak","Zabul"};
		return stateNames;
	}
	
	else if(countryName=="Iraq"){
		String[] stateNames={"Baghdad","Basra","Nineveh","Erbil","Najaf","Al Anbar","Babil","Diyala","Duhok","Halabja","Karbala","Kirkuk","Maysan","Al-Qadisiyyah","Saladin","Sulaymaniyah","Dhi Qar","Wasit"};
		return stateNames;
	}

	else if(countryName=="Syria"){
		String[] stateNames={"Damascus","Rif Dimashq","Aleppo","Homs","Hama","Latakia","Idlib","Al-Hasakah","Deir ez-Zor","Tartus","Raqqa","Daraa","Al-Suwayda","Quneitra"};
		return stateNames;
	}

	else if(countryName=="Lebanon"){
		String[] stateNames={"Beirut","Mount Lebanon","North","Akkar","Baalbek-Hermel","Beqaa","South","Nabatieh"};
		return stateNames;
	}

	else if(countryName=="Jordan"){
		String[] stateNames={"Amman","Zarqa","Irbid","Mafraq","Ajloun","Jerash","Madaba","Balqa","Karak","Tafileh","Ma'an","Aqaba"};
		return stateNames;
	}

	else if(countryName=="Yemen"){
		String[] stateNames={"Sanaa","Aden","Amran","Abyan","Al Bayda","Al Dhale'e","Al Hudaydah","Al Jawf","Al Mahrah","Al Mahwit","Amanat Al Asimah","Dhamar","Hadhramaut","Hajjah","Ibb","Lahij","Ma'rib","Raymah","Saada","Socotra","Taiz"};
		return stateNames;
	}

	else if(countryName=="Oman"){
		String[] stateNames={"Muscat","Dhofar","Musandam","Al Buraimi","Ad Dakhiliyah","Ad Dhahirah","North Al Batinah","South Al Batinah","North Ash Sharqiyah","South Ash Sharqiyah","Al Wusta"};
		return stateNames;
	}

	else if(countryName=="Kuwait"){
		String[] stateNames={"Al Asimah","Hawalli","Farwaniya","Mubarak Al-Kabeer","Ahmadi","Jahra"};
		return stateNames;
	}

	else if(countryName=="Qatar"){
		String[] stateNames={"Doha","Al Rayyan","Al Wakrah","Al Khor","Al Daayen","Umm Salal","Madinat ash Shamal","Al Shahaniya"};
		return stateNames;
	}

	else if(countryName=="Bahrain"){
		String[] stateNames={"Capital","Muharraq","Northern","Southern"};
		return stateNames;
	}

	else if(countryName=="Nepal"){
		String[] stateNames={"Koshi","Madhesh","Bagmati","Gandaki","Lumbini","Karnali","Sudurpashchim"};
		return stateNames;
	}

	else if(countryName=="Sri Lanka"){
		String[] stateNames={"Western","Central","Southern","Northern","Eastern","North Western","North Central","Uva","Sabaragamuwa"};
		return stateNames;
	}

	else if(countryName=="Myanmar"){
		String[] stateNames={"Kachin","Kayah","Kayin","Chin","Sagaing","Tanintharyi","Bago","Magway","Mandalay","Mon","Rakhine","Yangon","Shan","Ayeyarwady","Naypyidaw"};
		return stateNames;
	}

	else if(countryName=="Cambodia"){
		String[] stateNames={"Phnom Penh","Banteay Meanchey","Battambang","Kampong Cham","Kampong Chhnang","Kampong Speu","Kampong Thom","Kampot","Kandal","Kep","Koh Kong","Kratié","Mondulkiri","Oddar Meanchey","Pailin","Preah Sihanouk","Preah Vihear","Pursat","Prey Veng","Ratanakiri","Siem Reap","Stung Treng","Svay Rieng","Takéo","Tboung Khmum"};
		return stateNames;
	}

	else if(countryName=="Laos"){
		String[] stateNames={"Vientiane Prefecture","Vientiane Province","Phongsaly","Luang Namtha","Oudomxay","Bokeo","Luang Prabang","Huaphanh","Xayabury","Xieng Khouang","Bolikhamxay","Khammouane","Savannakhet","Salavan","Sekong","Champasak","Attapeu","Xaisomboun"};
		return stateNames;
	}

	else if(countryName=="Singapore"){
		String[] stateNames={"Central","East","North","North-East","West"};
		return stateNames;
	}

	else if(countryName=="Kazakhstan"){
		String[] stateNames={"Abai","Akmola","Aktobe","Almaty","Atyrau","East Kazakhstan","Jambyl","Jetisu","Karaganda","Kostanay","Kyzylorda","Mangystau","North Kazakhstan","Pavlodar","Turkistan","Ulytau","West Kazakhstan","Astana","Shymkent"};
		return stateNames;
	}

	else if(countryName=="Uzbekistan"){
		String[] stateNames={"Andijan","Bukhara","Fergana","Jizzakh","Khorezm","Namangan","Navoiy","Kashkadarya","Samarqand","Sirdaryo","Surxondaryo","Tashkent","Karakalpakstan"};
		return stateNames;
	}

	else if(countryName=="Slovakia"){
		String[] stateNames={"Bratislava","Trnava","Trencin","Nitra","Zilina","Banska Bystrica","Presov","Kosice"};
		return stateNames;
	}

	else if(countryName=="Croatia"){
		String[] stateNames={"Zagreb","Krapina-Zagorje","Sisak-Moslavina","Karlovac","Varaždin","Koprivnica-Križevci","Bjelovar-Bilogora","Primorje-Gorski Kotar","Lika-Senj","Virovitica-Podravina","Požega-Slavonia","Brod-Posavina","Zadar","Osijek-Baranja","Šibenik-Knin","Vukovar-Srijem","Split-Dalmatia","Istria","Dubrovnik-Neretva","Međimurje","City of Zagreb"};
		return stateNames;
	}

	else if(countryName=="Serbia"){
		String[] stateNames={"Belgrade","Vojvodina","Šumadija and Western Serbia","Southern and Eastern Serbia","Kosovo and Metohija"};
		return stateNames;
	}

	else if(countryName=="Bulgaria"){
		String[] stateNames={"Blagoevgrad","Burgas","Dobrich","Gabrovo","Haskovo","Kardzhali","Kyustendil","Lovech","Montana","Pazardzhik","Pernik","Pleven","Plovdiv","Razgrad","Ruse","Shumen","Silistra","Sliven","Smolyan","Sofia City","Sofia Province","Stara Zagora","Targovishte","Varna","Veliko Tarnovo","Vidin","Vratsa","Yambol"};
		return stateNames;
	}

	else if(countryName=="Belarus"){
		String[] stateNames={"Brest","Gomel","Grodno","Minsk Region","Minsk City","Mogilev","Vitebsk"};
		return stateNames;
	}

	else if(countryName=="Lithuania"){
		String[] stateNames={"Alytus","Kaunas","Klaipėda","Marijampolė","Panevėžys","Šiauliai","Tauragė","Telšiai","Utena","Vilnius"};
		return stateNames;
	}

	else if(countryName=="Latvia"){
		String[] stateNames={"Kurzeme","Latgale","Riga","Pieriga","Vidzeme","Zemgale"};
		return stateNames;
	}

	else if(countryName=="Estonia"){
		String[] stateNames={"Harju","Hiiu","Ida-Viru","Jõgeva","Järva","Lääne","Lääne-Viru","Põlva","Pärnu","Rapla","Saare","Tartu","Valga","Viljandi","Võru"};
		return stateNames;
	}

	else if(countryName=="Iceland"){
		String[] stateNames={"Capital Region","Southern Peninsula","Western Region","Westfjords","Northwestern Region","Northeastern Region","Eastern Region","Southern Region"};
		return stateNames;
	}

	else if(countryName=="Tanzania"){
		String[] stateNames={"Arusha","Dar es Salaam","Dodoma","Geita","Iringa","Kagera","Katavi","Kigoma","Kilimanjaro","Lindi","Manyara","Mara","Mbeya","Morogoro","Mtwara","Mwanza","Njombe","Pemba North","Pemba South","Pwani","Rukwa","Ruvuma","Shinyanga","Simiyu","Singida","Songwe","Tabora","Tanga","Zanzibar Central/South","Zanzibar North","Zanzibar Urban/West"};
		return stateNames;
	}

	else if(countryName=="Uganda"){
		String[] stateNames={"Central","Eastern","Northern","Western"};
		return stateNames;
	}

	else if(countryName=="Zambia"){
		String[] stateNames={"Central","Copperbelt","Eastern","Luapula","Lusaka","Muchinga","Northern","North-Western","Southern","Western"};
		return stateNames;
	}

	else if(countryName=="Zimbabwe"){
		String[] stateNames={"Bulawayo","Harare","Manicaland","Mashonaland Central","Mashonaland East","Mashonaland West","Masvingo","Matabeleland North","Matabeleland South","Midlands"};
		return stateNames;
	}

	else if(countryName=="Angola"){
		String[] stateNames={"Bengo","Benguela","Bié","Cabinda","Cuando Cubango","Cuanza Norte","Cuanza Sul","Cunene","Huambo","Huíla","Luanda","Lunda Norte","Lunda Sul","Malanje","Moxico","Namibe","Uíge","Zaire"};
		return stateNames;
	}

	else if(countryName=="Madagascar"){
		String[] stateNames={"Diana","Sava","Itasy","Analamanga","Vakinankaratra","Bongolava","Sofia","Boeny","Betsiboka","Melaky","Alaotra-Mangoro","Atsinanana","Analanjirofo","Amoron'i Mania","Haute Matsiatra","Vatovavy","Fitovinany","Atsimo-Atsinanana","Ihorombe","Menabe","Atsimo-Andrefana","Androy","Anosy"};
		return stateNames;
	}

	else if(countryName=="Senegal"){
		String[] stateNames={"Dakar","Diourbel","Fatick","Kaffrine","Kaolack","Kédougou","Kolda","Louga","Matam","Saint-Louis","Sédhiou","Tambacounda","Thiès","Ziguinchor"};
		return stateNames;
	}

	else if(countryName=="Guatemala"){
		String[] stateNames={"Alta Verapaz","Baja Verapaz","Chimaltenango","Chiquimula","El Progreso","Escuintla","Guatemala","Huehuetenango","Izabal","Jalapa","Jutiapa","Petén","Quetzaltenango","Quiché","Retalhuleu","Sacatepéquez","San Marcos","Santa Rosa","Sololá","Suchitepéquez","Totonicapán","Zacapa"};
		return stateNames;
	}

	else if(countryName=="Honduras"){
		String[] stateNames={"Atlántida","Choluteca","Colón","Comayagua","Copán","Cortés","El Paraíso","Francisco Morazán","Gracias a Dios","Intibucá","Islas de la Bahía","La Paz","Lempira","Ocotepeque","Olancho","Santa Bárbara","Valle","Yoro"};
		return stateNames;
	}

	else if(countryName=="El Salvador"){
		String[] stateNames={"Ahuachapán","Cabañas","Chalatenango","Cuscatlán","La Libertad","La Paz","La Unión","Morazán","San Miguel","San Salvador","San Vicente","Santa Ana","Sonsonate","Usulután"};
		return stateNames;
	}

	else if(countryName=="Nicaragua"){
		String[] stateNames={"Boaco","Carazo","Chinandega","Chontales","Estelí","Granada","Jinotega","León","Madriz","Managua","Masaya","Matagalpa","Nueva Segovia","Rivas","Río San Juan","North Caribbean Coast","South Caribbean Coast"};
		return stateNames;
	}

	else if(countryName=="Panama"){
		String[] stateNames={"Bocas del Toro","Chiriquí","Coclé","Colón","Darién","Herrera","Los Santos","Panamá","Panamá Oeste","Veraguas","Emberá","Guna Yala","Ngäbe-Buglé"};
		return stateNames;
	}

	else if(countryName=="Dominican Republic"){
		String[] stateNames={"Distrito Nacional","Azua","Baoruco","Barahona","Dajabón","Duarte","El Seibo","Elías Piña","Espaillat","Hato Mayor","Hermanas Mirabal","Independencia","La Altagracia","La Romana","La Vega","María Trinidad Sánchez","Monseñor Nouel","Monte Cristi","Monte Plata","Pedernales","Peravia","Puerto Plata","Samaná","San Cristóbal","San José de Ocoa","San Juan","San Pedro de Macorís","Sánchez Ramírez","Santiago","Santiago Rodríguez","Santo Domingo","Valverde"};
		return stateNames;
	}

	else if(countryName=="Jamaica"){
		String[] stateNames={"Clarendon","Hanover","Kingston","Manchester","Portland","Saint Andrew","Saint Ann","Saint Catherine","Saint Elizabeth","Saint James","Saint Mary","Saint Thomas","Trelawny","Westmoreland"};
		return stateNames;
	}

	else if(countryName=="Haiti"){
		String[] stateNames={"Artibonite","Centre","Grand'Anse","Nippes","Nord","Nord-Est","Nord-Ouest","Ouest","Sud","Sud-Est"};
		return stateNames;
	}
	
	else if(countryName=="Mali"){
		String[] stateNames={"Kayes","Koulikoro","Sikasso","Ségou","Mopti","Tombouctou","Gao","Kidal","Taoudénit","Ménaka","Bamako"};
		return stateNames;
	}

	else if(countryName=="Niger"){
		String[] stateNames={"Agadez","Diffa","Dosso","Maradi","Tahoua","Tillabéri","Zinder","Niamey"};
		return stateNames;
	}

	else if(countryName=="Chad"){
		String[] stateNames={"Batha","Chari-Baguirmi","Hadjer-Lamis","Wadi Fira","Bahr el Gazel","Borkou","Ennedi-Est","Ennedi-Ouest","Guéra","Kanem","Lac","Logone Occidental","Logone Oriental","Mandoul","Mayo-Kebbi Est","Mayo-Kebbi Ouest","Moyen-Chari","Ouaddaï","Salamat","Sila","Tibesti","N'Djamena"};
		return stateNames;
	}

	else if(countryName=="Sudan"){
		String[] stateNames={"Khartoum","North Kordofan","Northern","Kassala","Blue Nile","North Darfur","South Darfur","South Kordofan","Gezira","White Nile","River Nile","Red Sea","Al Qadarif","Sennar","West Darfur","Central Darfur","East Darfur"};
		return stateNames;
	}

	else if(countryName=="South Sudan"){
		String[] stateNames={"Central Equatoria","Eastern Equatoria","Jonglei","Lakes","Northern Bahr el Ghazal","Unity","Upper Nile","Warrap","Western Bahr el Ghazal","Western Equatoria"};
		return stateNames;
	}

	else if(countryName=="Cameroon"){
		String[] stateNames={"Adamawa","Centre","East","Far North","Littoral","North","Northwest","South","Southwest","West"};
		return stateNames;
	}

	else if(countryName=="Democratic Republic of the Congo"){
		String[] stateNames={"Kinshasa","Kongo Central","Kwango","Kwilu","Mai-Ndombe","Kasaï","Kasaï-Central","Kasaï-Oriental","Lomami","Sankuru","Maniema","South Kivu","North Kivu","Ituri","Haut-Uele","Tshopo","Bas-Uele","Nord-Ubangi","Mongala","Sud-Ubangi","Équateur","Tshuapa","Tanganyika","Haut-Lomami","Lualaba","Haut-Katanga"};
		return stateNames;
	}

	else if(countryName=="Republic of the Congo"){
		String[] stateNames={"Bouenza","Cuvette","Cuvette-Ouest","Kouilou","Lékoumou","Likouala","Niari","Plateaux","Pool","Sangha","Brazzaville","Pointe-Noire"};
		return stateNames;
	}

	else if(countryName=="Gabon"){
		String[] stateNames={"Estuaire","Haut-Ogooué","Moyen-Ogooué","Ngounié","Nyanga","Ogooué-Ivindo","Ogooué-Lolo","Ogooué-Maritime","Woleu-Ntem"};
		return stateNames;
	}

	else if(countryName=="Rwanda"){
		String[] stateNames={"Kigali","Northern","Southern","Eastern","Western"};
		return stateNames;
	}

	else if(countryName=="Burundi"){
		String[] stateNames={"Bubanza","Bujumbura Mairie","Bujumbura Rural","Bururi","Cankuzo","Cibitoke","Gitega","Karuzi","Kayanza","Kirundo","Makamba","Muramvya","Muyinga","Mwaro","Ngozi","Rumonge","Rutana","Ruyigi"};
		return stateNames;
	}

	else if(countryName=="Malawi"){
		String[] stateNames={"Northern","Central","Southern"};
		return stateNames;
	}

	else if(countryName=="Mozambique"){
		String[] stateNames={"Cabo Delgado","Gaza","Inhambane","Manica","Maputo City","Maputo Province","Nampula","Niassa","Sofala","Tete","Zambezia"};
		return stateNames;
	}

	else if(countryName=="Botswana"){
		String[] stateNames={"Central","Ghanzi","Kgalagadi","Kgatleng","Kweneng","North-East","North-West","South-East","Southern"};
		return stateNames;
	}

	else if(countryName=="Namibia"){
		String[] stateNames={"Erongo","Hardap","Kharas","Kavango East","Kavango West","Khomas","Kunene","Ohangwena","Omaheke","Omusati","Oshana","Oshikoto","Otjozondjupa","Zambezi"};
		return stateNames;
	}

	else if(countryName=="Tajikistan"){
		String[] stateNames={"Sughd","Khatlon","Gorno-Badakhshan","Districts of Republican Subordination","Dushanbe"};
		return stateNames;
	}

	else if(countryName=="Kyrgyzstan"){
		String[] stateNames={"Batken","Chüy","Jalal-Abad","Naryn","Osh","Talas","Issyk-Kul","Bishkek"};
		return stateNames;
	}

	else if(countryName=="Turkmenistan"){
		String[] stateNames={"Ahal","Balkan","Daşoguz","Lebap","Mary","Ashgabat"};
		return stateNames;
	}

	else if(countryName=="Mongolia"){
		String[] stateNames={"Arkhangai","Bayan-Ölgii","Bayankhongor","Bulgan","Darkhan-Uul","Dornod","Dornogovi","Dundgovi","Govi-Altai","Govisümber","Khentii","Khovd","Khövsgöl","Ömnögovi","Orkhon","Övörkhangai","Selenge","Sükhbaatar","Töv","Uvs","Zavkhan","Ulaanbaatar"};
		return stateNames;
	}

	else if(countryName=="Slovenia"){
		String[] stateNames={"Pomurska","Podravska","Koroška","Savinjska","Zasavska","Posavska","Jugovzhodna Slovenija","Osrednjeslovenska","Gorenjska","Primorsko-notranjska","Goriška","Obalno-kraška"};
		return stateNames;
	}

	else if(countryName=="Bosnia and Herzegovina"){
		String[] stateNames={"Federation of Bosnia and Herzegovina","Republika Srpska","Brcko District"};
		return stateNames;
	}
	
	else if(countryName=="Montenegro"){
		String[] stateNames={"Andrijevica","Bar","Berane","Bijelo Polje","Budva","Cetinje","Danilovgrad","Gusinje","Herceg Novi","Kolašin","Kotor","Mojkovac","Nikšić","Petnjica","Plav","Plužine","Pljevlja","Podgorica","Rožaje","Šavnik","Tivat","Tuzi","Ulcinj","Žabljak","Zeta"};
		return stateNames;
	}

	else if(countryName=="North Macedonia"){
		String[] stateNames={"Eastern","Northeastern","Pelagonia","Polog","Skopje","Southeastern","Southwestern","Vardar"};
		return stateNames;
	}

	else if(countryName=="Albania"){
		String[] stateNames={"Berat","Dibër","Durrës","Elbasan","Fier","Gjirokastër","Korçë","Kukës","Lezhë","Shkodër","Tirana","Vlorë"};
		return stateNames;
	}

	else if(countryName=="Moldova"){
		String[] stateNames={"Chișinău","Bălți","Bender","Gagauzia","Transnistria","Anenii Noi","Basarabeasca","Briceni","Cahul","Cantemir","Călărași","Căușeni","Cimișlia","Criuleni","Dondușeni","Drochia","Dubăsari","Edineț","Fălești","Florești","Glodeni","Hîncești","Ialoveni","Leova","Nisporeni","Ocnița","Orhei","Rezina","Rîșcani","Sîngerei","Soroca","Strășeni","Șoldănești","Ștefan Vodă","Taraclia","Telenești","Ungheni"};
		return stateNames;
	}

	else if(countryName=="Luxembourg"){
		String[] stateNames={"Capellen","Clervaux","Diekirch","Echternach","Esch-sur-Alzette","Grevenmacher","Luxembourg","Mersch","Redange","Remich","Vianden","Wiltz"};
		return stateNames;
	}

	else if(countryName=="Malta"){
		String[] stateNames={"Central","Gozo","Northern","South Eastern","Southern"};
		return stateNames;
	}

	else if(countryName=="Cyprus"){
		String[] stateNames={"Nicosia","Limassol","Larnaca","Paphos","Famagusta","Kyrenia"};
		return stateNames;
	}

	else if(countryName=="Belize"){
		String[] stateNames={"Belize","Cayo","Corozal","Orange Walk","Stann Creek","Toledo"};
		return stateNames;
	}

	else if(countryName=="Guyana"){
		String[] stateNames={"Barima-Waini","Pomeroon-Supenaam","Essequibo Islands-West Demerara","Demerara-Mahaica","Mahaica-Berbice","East Berbice-Corentyne","Cuyuni-Mazaruni","Potaro-Siparuni","Upper Takutu-Upper Essequibo","Upper Demerara-Berbice"};
		return stateNames;
	}

	else if(countryName=="Suriname"){
		String[] stateNames={"Brokopondo","Commewijne","Coronie","Marowijne","Nickerie","Para","Paramaribo","Saramacca","Sipaliwini","Wanica"};
		return stateNames;
	}

	else if(countryName=="Papua New Guinea"){
		String[] stateNames={"Central","Chimbu","Eastern Highlands","East New Britain","East Sepik","Enga","Gulf","Hela","Jiwaka","Madang","Manus","Milne Bay","Morobe","New Ireland","Northern","Southern Highlands","Western","Western Highlands","West New Britain","West Sepik","Bougainville","National Capital District"};
		return stateNames;
	}

	else if(countryName=="Fiji"){
		String[] stateNames={"Central","Eastern","Northern","Western","Rotuma"};
		return stateNames;
	}

	else if(countryName=="Solomon Islands"){
		String[] stateNames={"Central","Choiseul","Guadalcanal","Isabel","Makira-Ulawa","Malaita","Rennell and Bellona","Temotu","Western","Honiara"};
		return stateNames;
	}

	else if(countryName=="Vanuatu"){
		String[] stateNames={"Malampa","Penama","Sanma","Shefa","Tafea","Torba"};
		return stateNames;
	}

	else if(countryName=="Bhutan"){
		String[] stateNames={"Bumthang","Chukha","Dagana","Gasa","Haa","Lhuntse","Mongar","Paro","Pemagatshel","Punakha","Samdrup Jongkhar","Samtse","Sarpang","Thimphu","Trashigang","Trashi Yangtse","Trongsa","Tsirang","Wangdue Phodrang","Zhemgang"};
		return stateNames;
	}

	else if(countryName=="Brunei"){
		String[] stateNames={"Belait","Brunei-Muara","Temburong","Tutong"};
		return stateNames;
	}

	else if(countryName=="Timor-Leste"){
		String[] stateNames={"Aileu","Ainaro","Atauro","Baucau","Bobonaro","Covalima","Dili","Ermera","Lautém","Liquiçá","Manatuto","Manufahi","Viqueque"};
		return stateNames;
	}

	else if(countryName=="Maldives"){
		String[] stateNames={"Malé","Addu","Fuvahmulah","Kulhudhuffushi","Haa Alif","Haa Dhaalu","Shaviyani","Noonu","Raa","Baa","Lhaviyani","Kaafu","Alif Alif","Alif Dhaal","Vaavu","Meemu","Faafu","Dhaalu","Thaa","Laamu","Gaafu Alif","Gaafu Dhaalu","Gnaviyani","Seenu"};
		return stateNames;
	}

	else if(countryName=="Bahamas"){
		String[] stateNames={"Acklins","Berry Islands","Bimini","Black Point","Cat Island","Central Abaco","Central Andros","Central Eleuthera","City of Freeport","Crooked Island","East Grand Bahama","Exuma","Grand Cay","Harbour Island","Hope Town","Inagua","Long Island","Mangrove Cay","Mayaguana","Moore's Island","North Abaco","North Andros","North Eleuthera","Ragged Island","Rum Cay","San Salvador","South Abaco","South Andros","South Eleuthera","Spanish Wells","West Grand Bahama"};
		return stateNames;
	}
	
	else if(countryName=="Barbados"){
		String[] stateNames={"Christ Church","Saint Andrew","Saint George","Saint James","Saint John","Saint Joseph","Saint Lucy","Saint Michael","Saint Peter","Saint Philip","Saint Thomas"};
		return stateNames;
	}

	else if(countryName=="Antigua and Barbuda"){
		String[] stateNames={"Saint George","Saint John","Saint Mary","Saint Paul","Saint Peter","Saint Philip","Barbuda","Redonda"};
		return stateNames;
	}

	else if(countryName=="Saint Kitts and Nevis"){
		String[] stateNames={"Christ Church Nichola Town","Saint Anne Sandy Point","Saint George Basseterre","Saint George Gingerland","Saint James Windward","Saint John Capisterre","Saint John Figtree","Saint Mary Cayon","Saint Paul Capisterre","Saint Paul Charlestown","Saint Peter Basseterre","Saint Thomas Lowland","Saint Thomas Middle Island","Trinity Palmetto Point"};
		return stateNames;
	}

	else if(countryName=="Saint Lucia"){
		String[] stateNames={"Anse la Raye","Canaries","Castries","Choiseul","Dennery","Gros Islet","Laborie","Micoud","Soufrière","Vieux Fort"};
		return stateNames;
	}

	else if(countryName=="Saint Vincent and the Grenadines"){
		String[] stateNames={"Charlotte","Saint Andrew","Saint David","Saint George","Saint Patrick","Grenadines"};
		return stateNames;
	}

	else if(countryName=="Grenada"){
		String[] stateNames={"Saint Andrew","Saint David","Saint George","Saint John","Saint Mark","Saint Patrick","Carriacou and Petite Martinique"};
		return stateNames;
	}

	else if(countryName=="Trinidad and Tobago"){
		String[] stateNames={"Port of Spain","San Fernando","Arima","Chaguanas","Point Fortin","Couva-Tabaquite-Talparo","Diego Martin","Penal-Debe","Princes Town","Rio Claro-Mayaro","San Juan-Laventille","Sangre Grande","Siparia","Tunapuna-Piarco","Tobago"};
		return stateNames;
	}

	else if(countryName=="Dominica"){
		String[] stateNames={"Saint Andrew","Saint David","Saint George","Saint John","Saint Joseph","Saint Luke","Saint Mark","Saint Patrick","Saint Paul","Saint Peter"};
		return stateNames;
	}

	else if(countryName=="Cape Verde"){
		String[] stateNames={"Boa Vista","Brava","Maio","Mosteiros","Paul","Porto Novo","Praia","Ribeira Brava","Ribeira Grande","Ribeira Grande de Santiago","Sal","Santa Catarina","Santa Catarina do Fogo","Santa Cruz","São Domingos","São Filipe","São Lourenço dos Órgãos","São Miguel","São Nicolau","São Vicente","Tarrafal","Tarrafal de São Nicolau"};
		return stateNames;
	}

	else if(countryName=="São Tomé and Príncipe"){
		String[] stateNames={"Agua Grande","Cantagalo","Caue","Lemba","Lobata","Me-Zochi","Pague"};
		return stateNames;
	}

	else if(countryName=="Equatorial Guinea"){
		String[] stateNames={"Annobón","Bioko Norte","Bioko Sur","Centro Sur","Djibloho","Kié-Ntem","Litoral","Wele-Nzas"};
		return stateNames;
	}

	else if(countryName=="Guinea-Bissau"){
		String[] stateNames={"Bafatá","Biombo","Bissau","Bolama","Cacheu","Gabú","Oio","Quinara","Tombali"};
		return stateNames;
	}

	else if(countryName=="Guinea"){
		String[] stateNames={"Boké","Conakry","Faranah","Kankan","Kindia","Labé","Mamou","Nzérékoré"};
		return stateNames;
	}

	else if(countryName=="Sierra Leone"){
		String[] stateNames={"Eastern","Northern","North Western","Southern","Western Area"};
		return stateNames;
	}

	else if(countryName=="Liberia"){
		String[] stateNames={"Bomi","Bong","Gbarpolu","Grand Bassa","Grand Cape Mount","Grand Gedeh","Grand Kru","Lofa","Margibi","Maryland","Montserrado","Nimba","Rivercess","River Gee","Sinoe"};
		return stateNames;
	}

	else if(countryName=="Côte d'Ivoire"){
		String[] stateNames={"Abidjan","Bas-Sassandra","Comoé","Denguélé","Gôh-Djiboua","Lacs","Lagunes","Montagnes","Sassandra-Marahoué","Savanes","Vallée du Bandama","Woroba","Yamoussoukro","Zanzan"};
		return stateNames;
	}

	else if(countryName=="Burkina Faso"){
		String[] stateNames={"Boucle du Mouhoun","Cascades","Centre","Centre-Est","Centre-Nord","Centre-Ouest","Centre-Sud","Est","Hauts-Bassins","Nord","Plateau-Central","Sahel","Sud-Ouest"};
		return stateNames;
	}

	else if(countryName=="Togo"){
		String[] stateNames={"Centrale","Kara","Maritime","Plateaux","Savanes"};
		return stateNames;
	}

	else if(countryName=="Benin"){
		String[] stateNames={"Alibori","Atakora","Atlantique","Borgou","Collines","Couffo","Donga","Littoral","Mono","Ouémé","Plateau","Zou"};
		return stateNames;
	}

	else if(countryName=="Central African Republic"){
		String[] stateNames={"Bamingui-Bangoran","Bangui","Basse-Kotto","Haute-Kotto","Haut-Mbomou","Kémo","Lobaye","Mambéré","Mambéré-Kadéï","Mbomou","Nana-Gribizi","Nana-Mambéré","Ombella-M'Poko","Ouaka","Ouham","Ouham-Fafa","Ouham-Pendé","Sangha-Mbaéré","Vakaga"};
		return stateNames;
	}

	else if(countryName=="Djibouti"){
		String[] stateNames={"Ali Sabieh","Arta","Dikhil","Djibouti","Obock","Tadjourah"};
		return stateNames;
	}

	else if(countryName=="Eritrea"){
		String[] stateNames={"Anseba","Central","Gash-Barka","Northern Red Sea","Southern","Southern Red Sea"};
		return stateNames;
	}

	else if(countryName=="Somalia"){
		String[] stateNames={"Banadir","Galmudug","Hirshabelle","Jubaland","Puntland","South West","Somaliland"};
		return stateNames;
	}

	else if(countryName=="Comoros"){
		String[] stateNames={"Grande Comore","Mohéli","Anjouan"};
		return stateNames;
	}

	else if(countryName=="Seychelles"){
		String[] stateNames={"Anse aux Pins","Anse Boileau","Anse Etoile","Au Cap","Baie Lazare","Baie Sainte Anne","Beau Vallon","Bel Air","Bel Ombre","Cascade","English River","Glacis","Grand Anse Mahe","Grand Anse Praslin","Inner Islands","Les Mamelles","Mont Buxton","Mont Fleuri","Plaisance","Pointe Larue","Port Glaud","Roche Caiman","Saint Louis","Takamaka"};
		return stateNames;
	}

	else if(countryName=="Mauritius"){
		String[] stateNames={"Black River","Flacq","Grand Port","Moka","Pamplemousses","Plaines Wilhems","Port Louis","Rivière du Rempart","Savanne","Rodrigues"};
		return stateNames;
	}

	else if(countryName=="Eswatini"){
		String[] stateNames={"Hhohho","Lubombo","Manzini","Shiselweni"};
		return stateNames;
	}

	else if(countryName=="Lesotho"){
		String[] stateNames={"Berea","Butha-Buthe","Leribe","Mafeteng","Maseru","Mohale's Hoek","Mokhotlong","Qacha's Nek","Quthing","Thaba-Tseka"};
		return stateNames;
	}

	else if(countryName=="Andorra"){
		String[] stateNames={"Andorra la Vella","Canillo","Encamp","Escaldes-Engordany","La Massana","Ordino","Sant Julià de Lòria"};
		return stateNames;
	}

	else if(countryName=="Monaco"){
		String[] stateNames={"Monte Carlo","La Condamine","Fontvieille","Les Moneghetti","Monaco-Ville","Ravin de Sainte-Dévote","La Rousse","Larvotto","Saint Michel","La Colle"};
		return stateNames;
	}

	else if(countryName=="San Marino"){
		String[] stateNames={"Acquaviva","Borgo Maggiore","Chiesanuova","Domagnano","Faetano","Fiorentino","Montegiardino","San Marino","Serravalle"};
		return stateNames;
	}

	else if(countryName=="Vatican City"){
		String[] stateNames={"Vatican City"};
		return stateNames;
	}

	else if(countryName=="Liechtenstein"){
		String[] stateNames={"Balzers","Eschen","Gamprin","Mauren","Planken","Ruggell","Schaan","Schellenberg","Triesen","Triesenberg","Vaduz"};
		return stateNames;
	}

	else if(countryName=="Marshall Islands"){
		String[] stateNames={"Ailinglaplap","Ailuk","Arno","Aur","Ebon","Enewetak","Jabat","Jaluit","Kili","Kwajalein","Lae","Lib","Likiep","Majuro","Maloelap","Mejit","Mili","Namdrik","Namu","Rongelap","Ujae","Utirik","Wotho","Wotje"};
		return stateNames;
	}

	else if(countryName=="Micronesia"){
		String[] stateNames={"Chuuk","Kosrae","Pohnpei","Yap"};
		return stateNames;
	}

	else if(countryName=="Palau"){
		String[] stateNames={"Aimeliik","Airai","Angaur","Hatohobei","Kayangel","Koror","Melekeok","Ngaraard","Ngarchelong","Ngardmau","Ngatpang","Ngchesar","Ngeremlengui","Ngiwal","Peleliu","Sonsorol"};
		return stateNames;
	}

	else if(countryName=="Nauru"){
		String[] stateNames={"Aiwo","Anabar","Anetan","Anibare","Baiti","Boe","Buada","Denigomodu","Ewa","Ijuw","Meneng","Nibok","Uaboe","Yaren"};
		return stateNames;
	}

	else if(countryName=="Kiribati"){
		String[] stateNames={"Gilbert Islands","Line Islands","Phoenix Islands"};
		return stateNames;
	}

	else if(countryName=="Tuvalu"){
		String[] stateNames={"Funafuti","Nanumanga","Nanumea","Niutao","Nui","Nukufetau","Nukulaelae","Vaitupu"};
		return stateNames;
	}

	else if(countryName=="Samoa"){
		String[] stateNames={"A'ana","Aiga-i-le-Tai","Atua","Fa'asaleleaga","Gaga'emauga","Gaga'ifomauga","Palauli","Satupa'itea","Tuamasaga","Va'a-o-Fonoti","Vaisigano"};
		return stateNames;
	}

	else if(countryName=="Tonga"){
		String[] stateNames={"'Eua","Ha'apai","Niuas","Tongatapu","Vava'u"};
		return stateNames;
	}

	else if(countryName=="Mauritania"){
		String[] stateNames={"Adrar","Assaba","Brakna","Dakhlet Nouadhibou","Gorgol","Guidimaka","Hodh Ech Chargui","Hodh El Gharbi","Inchiri","Nouakchott-Nord","Nouakchott-Ouest","Nouakchott-Sud","Tagant","Tiris Zemmour","Trarza"};
		return stateNames;
	}

	else if(countryName=="Gambia"){
		String[] stateNames={"Banjul","Central River","Lower River","North Bank","Upper River","West Coast"};
		return stateNames;
	}

	else if(countryName=="Armenia"){
		String[] stateNames={"Aragatsotn","Ararat","Armavir","Gegharkunik","Kotayk","Lori","Shirak","Syunik","Tavush","Vayots Dzor","Yerevan"};
		return stateNames;
	}

	else if(countryName=="Azerbaijan"){
		String[] stateNames={"Absheron","Ganja-Dashkasan","Shaki-Zagatala","Lankaran-Astara","Guba-Khachmaz","Aran","Yukhari Shirvan","Kalbajar-Lachin","Daghlig Shirvan","Nakhchivan"};
		return stateNames;
	}

	else if(countryName=="Georgia"){
		String[] stateNames={"Abkhazia","Adjara","Guria","Imereti","Kakheti","Kvemo Kartli","Mtskheta-Mtianeti","Racha-Lechkhumi and Kvemo Svaneti","Samegrelo-Zemo Svaneti","Samtskhe-Javakheti","Shida Kartli","Tbilisi"};
		return stateNames;
	}

	else{
		System.out.println("You have entered word has spelling mistake");
		return null;
	}
	
}

static void getStates(String[] stateNames){
	
	for(String stateName:stateNames){
		System.out.println(stateName);
		
	}
	
}

}
