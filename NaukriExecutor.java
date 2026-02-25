
class NaukriExecutor{

public static void main(String[] args){


String[] listOfCompanies = {
    "Google", "Microsoft", "Apple", "Amazon", "Meta", "Netflix", "Tesla", "IBM", "Intel", "Oracle",
    "Cisco", "SAP", "Salesforce", "Adobe", "HP", "Dell", "Lenovo", "Sony", "Samsung", "LG",
    "Panasonic", "NVIDIA", "AMD", "Qualcomm", "TSMC", "Broadcom", "Texas Instruments", "Micron", "ASML", "Applied Materials",
    "Tata Consultancy Services", "Infosys", "Wipro", "HCL Technologies", "Tech Mahindra", "Cognizant", "Accenture", "Capgemini", "Deloitte", "PwC",
    "EY", "KPMG", "Goldman Sachs", "JPMorgan Chase", "Morgan Stanley", "Bank of America", "Citigroup", "Wells Fargo", "HSBC", "Barclays",
    "Credit Suisse", "UBS", "Deutsche Bank", "Standard Chartered", "Visa", "Mastercard", "American Express", "PayPal", "Square", "Stripe",
    "Robinhood", "Coinbase", "Siemens", "General Electric", "Bosch", "Honeywell", "3M", "Schneider Electric", "ABB", "Philips",
    "Boeing", "Airbus", "Lockheed Martin", "Raytheon", "Northrop Grumman", "General Dynamics", "BAE Systems", "SpaceX", "Blue Origin", "Virgin Galactic",
    "Nike", "Adidas", "Toyota", "Ford", "General Motors", "Volkswagen", "BMW", "Mercedes-Benz", "Honda", "Hyundai",
    "Coca-Cola", "PepsiCo", "Walmart", "Target", "Starbucks", "McDonald's", "Uber", "Lyft", "Airbnb", "Spotify",
    "Twitter", "LinkedIn", "Zoom", "Slack", "Logitech", "Razer", "Canon", "Nikon", "Snapchat", "TikTok",
    "Dropbox", "Pinterest", "Peloton", "DoorDash", "Instacart", "Shopify", "Nokia", "Ericsson", "Verizon", "AT&T",
    "T-Mobile", "Vodafone", "Nintendo", "Ubisoft", "Electronic Arts", "Activision Blizzard", "Epic Games", "Roblox", "Unity", "GitHub",
    "Autodesk", "Intuit", "Workday", "ServiceNow", "Palantir", "Snowflake", "Databricks", "Splunk", "Zscaler", "CrowdStrike",
    "Okta", "Twilio", "Atlassian", "Monday.com", "Asana", "Figma", "Canva", "HubSpot", "Zendesk", "Netflix",
    "Chevron", "ExxonMobil", "Shell", "BP", "TotalEnergies", "Saudi Aramco", "Petrobras", "Reliance Industries", "Costco", "Home Depot",
    "Lowe's", "CVS Health", "UnitedHealth Group", "Pfizer", "Moderna", "Johnson & Johnson", "Roche", "Novartis", "Merck", "AstraZeneca",
    "Sanofi", "Gilead Sciences", "Amgen", "Bayer", "Nestle"};
	
for(String listOfCompany: listOfCompanies){
	
	String[] companies=Naukri.searchJobsByCompany(listOfCompany);
	System.out.println("The list of job openings in "+listOfCompany+" are:");
	Naukri.getJobNames(companies);
	System.out.println("------------------------------------------");
	



}

}


}
