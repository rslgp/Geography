public class CountriesToContinent {
	//0 s.america 1 oceania 2 n.america 3 asia 4 europe 5 africa
	final static String [] continentes = 
	{
		//0
		"Argentina, Bolivia, Brazil, Chile, Colombia, Ecuador, Guyana, Paraguay, Peru, Suriname, Uruguay, Venezuela",
		//1
		"Australia, Fiji, Kiribati, Marshall Islands, Micronesia, Nauru, New Zealand, Palau, Papua New Guinea, Samoa, Solomon Islands, Tonga, Tuvalu, Vanuatu",
		//2
		"Antigua and Barbuda, Bahamas, Barbados, Belize, Canada, Costa Rica, Cuba, Dominica, Dominican Republic, El Salvador, Grenada, Guatemala, Haiti, Honduras, Jamaica, Mexico, Nicaragua, Panama, Saint Kitts and Nevis, Saint Lucia, Saint Vincent and the Grenadines, Trinidad and Tobago, United States",
		//3
		"Afghanistan, Bahrain, Bangladesh, Bhutan, Brunei, Burma (Myanmar), Cambodia, China, East Timor, India, Indonesia, Iran, Iraq, Israel, Japan, Jordan, Kazakhstan, Korea, North, Korea, South, Kuwait, Kyrgyzstan, Laos, Lebanon, Malaysia, Maldives, Mongolia, Nepal, Oman, Pakistan, Philippines, Qatar, Russian Federation, Saudi Arabia, Singapore, Sri Lanka, Syria, Tajikistan, Thailand, Turkey, Turkmenistan, United Arab Emirates, Uzbekistan, Vietnam, Yemen",
		//4
		"Albania, Andorra, Armenia, Austria, Azerbaijan, Belarus, Belgium, Bosnia and Herzegovina, Bulgaria, Croatia, Cyprus, Czech Republic, Denmark, Estonia, Finland, France, Georgia, Germany, Greece, Hungary, Iceland, Ireland, Italy, Latvia, Liechtenstein, Lithuania, Luxembourg, Macedonia, Malta, Moldova, Monaco, Montenegro, Netherlands, Norway, Poland, Portugal, Romania, San Marino, Serbia, Slovakia, Slovenia, Spain, Sweden, Switzerland, Ukraine, United Kingdom, Vatican City",
		//5
		"Algeria, Angola, Benin, Botswana, Burkina, Burundi, Cameroon, Cape Verde, Central African Republic, Chad, Comoros, Congo, Congo, Democratic Republic of, Djibouti, Egypt, Equatorial Guinea, Eritrea, Ethiopia, Gabon, Gambia, Ghana, Guinea, Guinea-Bissau, Ivory Coast, Kenya, Lesotho, Liberia, Libya, Madagascar, Malawi, Mali, Mauritania, Mauritius, Morocco, Mozambique, Namibia, Niger, Nigeria, Rwanda, Sao Tome and Principe, Senegal, Seychelles, Sierra Leone, Somalia, South Africa, South Sudan, Sudan, Swaziland, Tanzania, Togo, Tunisia, Uganda, Zambia, Zimbabwe"
	};

	final static String[] nomeContinentes={"S. America", "Oceania", "N. America", "Asia", "Europe", "Africa"};
	
	public static int countryToContinent(String pais){
		int i=0;
		for(String continente : continentes){
			if(continente.contains(pais)){
				return i;
			}
			++i;
		}
		return -1;
	}
	
	public static String concatResult(String pais, int indice, String[] retorno){
		if(retorno[indice]==null){
			retorno[indice]=nomeContinentes[indice]+": "+pais;
		}else{
			retorno[indice]+=", "+pais;
		}
		return retorno[indice];
	}
	
	public static String countriesToContinent(String paises){
		String [] ArrayPaises= paises.split(", ");
		String [] retorno = new String[6];
		int indice;
		for(String pais : ArrayPaises){
			indice=countryToContinent(pais);
			retorno[indice]=concatResult(pais, indice, retorno);
		}
		
		String output= new String();
		for(String resultado : retorno){
			if(resultado!=null){
				output+=resultado+"\n\n";
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(countriesToContinent("Brazil, United States, Argentina, Australia"));
	}
}
