
class Hospital {

    public static String[] findDoctorsBySpecilization(String specialization) {
        System.out.println("invoked findDoctorsBySpecilization");

        if (specialization == "Cardiac Sciences") {
            String[] doctors = {"Dr.Arun","Dr.Bhaskar","Dr.Chandru","Dr.Deepak","Dr.Eshwar","Dr.Farhan","Dr.Girish","Dr.Harsha","Dr.Irfan","Dr.Jagan","Dr.Kiran","Dr.Lokesh","Dr.Manoj","Dr.Naveen","Dr.Omkar"};
            System.out.println("Cardiac Sciences doctors found");
            return doctors;
        }

        else if (specialization == "Dental Science") {
            String[] doctors = {"Dr.Priya","Dr.Rohini","Dr.Sindhu","Dr.Tejaswini","Dr.Uma","Dr.Varsha","Dr.Wilson","Dr.Xavier","Dr.Yamini","Dr.Zubin","Dr.Akshay","Dr.Bharath","Dr.Chetan","Dr.Divya","Dr.Ekta"};
            System.out.println("Dental Science doctors found");
            return doctors;
        }

        else if (specialization == "Dermatology") {
            String[] doctors = {"Dr.Fathima","Dr.Gayathri","Dr.Hemanth","Dr.Ishita","Dr.Jyothi","Dr.Karthik","Dr.Lavanya","Dr.Madhavi","Dr.Nisha","Dr.Ojas","Dr.Pooja","Dr.Qureshi","Dr.Ramesh","Dr.Sagar","Dr.Tanvi"};
            return doctors;
        }

        else if (specialization == "Diabetology/Endocrinology") {
            String[] doctors = {"Dr.Amar","Dr.Bindu","Dr.Cyril","Dr.Darshan","Dr.Ekansh","Dr.Fiona","Dr.Gokul","Dr.Harini","Dr.Imran","Dr.Jyoti","Dr.Kamal","Dr.Latha","Dr.Mahesh","Dr.Nidhi","Dr.Oviya"};
            return doctors;
        }

        else if (specialization == "ENT") {
            String[] doctors = {"Dr.Pavan","Dr.Quincy","Dr.Raj","Dr.Shalini","Dr.Tarun","Dr.Uday","Dr.Vani","Dr.Waseem","Dr.Xena","Dr.Yogesh","Dr.Zara","Dr.Abhay","Dr.Bhavya","Dr.Chetna","Dr.Dev"};
            return doctors;
        }

        else if (specialization == "Emergency and Trauma") {
            String[] doctors = {"Dr.Eshan","Dr.Farida","Dr.Gautam","Dr.Hitesh","Dr.Ila","Dr.Joseph","Dr.Kavita","Dr.Lohith","Dr.Mira","Dr.Naman","Dr.Omar","Dr.Prakash","Dr.Qadir","Dr.Ritika","Dr.Sunil"};
            return doctors;
        }

        else if (specialization == "Foetal Medicine") {
            String[] doctors = {"Dr.Anjali","Dr.Balaji","Dr.Charvi","Dr.Dinesh","Dr.Eesha","Dr.Feroz","Dr.Ganesh","Dr.Himani","Dr.Irfana","Dr.Jatin","Dr.Kirti","Dr.Lalitha","Dr.Mohan","Dr.Nazim","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {
            String[] doctors = {"Dr.Poojan","Dr.Rhea","Dr.Samir","Dr.Tanu","Dr.Umesh","Dr.Ved","Dr.Wahid","Dr.Xavier","Dr.Yash","Dr.Zeenat","Dr.Akram","Dr.Bina","Dr.Carlos","Dr.Diya","Dr.Ehsan"};
            return doctors;
        }

        else if (specialization == "General Surgery") {
            String[] doctors = {"Dr.Suresh","Dr.Ramesh","Dr.Lokendra","Dr.Mithun","Dr.Naresh","Dr.Omprakash","Dr.Prasad","Dr.Rohit","Dr.Swati","Dr.Tushar","Dr.Usha","Dr.Vikram","Dr.William","Dr.Xara","Dr.Yamini"};
            return doctors;
        }

        else if (specialization == "Haematology") {
            String[] doctors = {"Dr.Aditi","Dr.Bhavik","Dr.Celine","Dr.Dheeraj","Dr.Elina","Dr.Farooq","Dr.Gauri","Dr.Hari","Dr.Iqbal","Dr.Jaya","Dr.Krishna","Dr.Lina","Dr.Mehul","Dr.Naveena","Dr.Oshin"};
            return doctors;
        }

        else if (specialization == "Infectious Diseases") {
            String[] doctors = {"Dr.Ali","Dr.Bhoomi","Dr.Cyrus","Dr.Dipti","Dr.Ekram","Dr.Falguni","Dr.Girish","Dr.Haroon","Dr.Ira","Dr.Jeevan","Dr.Kalpana","Dr.Liyakat","Dr.Malini","Dr.Nisar","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Infertility medicine") {
            String[] doctors = {"Dr.Asha","Dr.Benita","Dr.Chitra","Dr.Deb","Dr.Elson","Dr.Fatima","Dr.Gopal","Dr.Hema","Dr.Ivan","Dr.Jothi","Dr.Karan","Dr.Latha","Dr.Malini","Dr.Nandini","Dr.Omar"};
            return doctors;
        }

        else if (specialization == "Internal Medicine") {
            String[] doctors = {"Dr.Ravi","Dr.Sanjay","Dr.Kishore","Dr.Manasa","Dr.Naveen","Dr.Omkar","Dr.Pooja","Dr.Qureshi","Dr.Ritika","Dr.Satish","Dr.Tej","Dr.Umesh","Dr.Vinay","Dr.Wilson","Dr.Yogita"};
            return doctors;
        }

        else if (specialization == "Mental Health and Behavioural Sciences") {
            String[] doctors = {"Dr.Aman","Dr.Bindu","Dr.Chandni","Dr.Dheer","Dr.Ekta","Dr.Firoz","Dr.Gagan","Dr.Harini","Dr.Ishwar","Dr.Janvi","Dr.Krish","Dr.Lavina","Dr.Mohit","Dr.Nikita","Dr.Ojas"};
            return doctors;
        }

        else if (specialization == "Nephrology") {
            String[] doctors = {"Dr.Abhishek","Dr.Bhavana","Dr.Chetan","Dr.Damini","Dr.Ekansh","Dr.Faizan","Dr.Gokul","Dr.Harsh","Dr.Ishika","Dr.Jatin","Dr.Karan","Dr.Lokesh","Dr.Maya","Dr.Nitin","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Neurointerventional Radiology") {
            String[] doctors = {"Dr.Akila","Dr.Bala","Dr.Chirag","Dr.Devika","Dr.Eshan","Dr.Farhan","Dr.Gauri","Dr.Harshita","Dr.Iqra","Dr.Josh","Dr.Kruti","Dr.Lalit","Dr.Mayur","Dr.Nikhil","Dr.Omkar"};
            return doctors;
        }

        else if (specialization == "Neurology") {
            String[] doctors = {"Dr.Rajesh","Dr.Sonia","Dr.Tarini","Dr.Uday","Dr.Vani","Dr.Waseem","Dr.Xavier","Dr.Yash","Dr.Zubin","Dr.Aparna","Dr.Bhargav","Dr.Cyrus","Dr.Deepika","Dr.Elvin","Dr.Faiz"};
            return doctors;
        }

        else if (specialization == "Neurosurgery") {
            String[] doctors = {"Dr.Arunesh","Dr.Bhavna","Dr.Chandra","Dr.Dev","Dr.Ekagra","Dr.Fathima","Dr.Ganesh","Dr.Hitesh","Dr.Ila","Dr.Jeevan","Dr.Karan","Dr.Latha","Dr.Mohini","Dr.Naveed","Dr.Omprakash"};
            return doctors;
        }

        else if (specialization == "Obstetrics and Gynaecology") {
            String[] doctors = {"Dr.Anusha","Dr.Bhavya","Dr.Chitra","Dr.Divya","Dr.Eesha","Dr.Farida","Dr.Gayathri","Dr.Himani","Dr.Ira","Dr.Jyoti","Dr.Kavya","Dr.Lalitha","Dr.Megha","Dr.Nisha","Dr.Oviya"};
            return doctors;
        }

        else if (specialization == "Oncology") {
            String[] doctors = {"Dr.Akshay","Dr.Balraj","Dr.Chetna","Dr.Deepak","Dr.Ekta","Dr.Farooq","Dr.Girish","Dr.Harini","Dr.Irfan","Dr.Joshna","Dr.Kamal","Dr.Lokesh","Dr.Madhav","Dr.Nidhi","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Ophthalmology") {
            String[] doctors = {"Dr.Rina","Dr.Sameer","Dr.Tina","Dr.Usha","Dr.Vikas","Dr.William","Dr.Xena","Dr.Yamini","Dr.Zara","Dr.Abhay","Dr.Bharath","Dr.Celine","Dr.Darshan","Dr.Elina","Dr.Firoz"};
            return doctors;
        }

        else if (specialization == "Organ Transplant") {
            String[] doctors = {"Dr.Aman","Dr.Bhargavi","Dr.Carlos","Dr.Dinesh","Dr.Eshan","Dr.Falguni","Dr.Gopal","Dr.Hari","Dr.Irfana","Dr.Jagan","Dr.Krish","Dr.Lokendra","Dr.Mehul","Dr.Nasir","Dr.Omar"};
            return doctors;
        }

        else if (specialization == "Orthopaedics") {
            String[] doctors = {"Dr.Gangadhar","Dr.Vikas","Dr.Ramesh","Dr.Sunil","Dr.Tarun","Dr.Uday","Dr.Vani","Dr.Waseem","Dr.Xavier","Dr.Yash","Dr.Zubin","Dr.Akash","Dr.Bhavya","Dr.Chetan","Dr.Dinesh"};
            return doctors;
        }

        else if (specialization == "Paediatrics") {
            String[] doctors = {"Dr.Anil","Dr.Bhavna","Dr.Chetna","Dr.Deep","Dr.Ekram","Dr.Farida","Dr.Gagan","Dr.Hema","Dr.Ishita","Dr.Jaya","Dr.Kriti","Dr.Lokesh","Dr.Malini","Dr.Nazim","Dr.Ojas"};
            return doctors;
        }

        else if (specialization == "Physiotherapy and Rehabilitation") {
            String[] doctors = {"Dr.Ajay","Dr.Bhavik","Dr.Chandni","Dr.Devika","Dr.Elson","Dr.Farhan","Dr.Gokul","Dr.Himani","Dr.Ira","Dr.Jatin","Dr.Kruti","Dr.Lavanya","Dr.Mohit","Dr.Nisha","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Plastic and Reconstructive Surgery") {
            String[] doctors = {"Dr.Ashwin","Dr.Bhavya","Dr.Chirag","Dr.Damini","Dr.Ekta","Dr.Farooq","Dr.Gauri","Dr.Hitesh","Dr.Iqbal","Dr.Jeevan","Dr.Karan","Dr.Lina","Dr.Mohini","Dr.Nitin","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Pulmonology") {
            String[] doctors = {"Dr.Akram","Dr.Bina","Dr.Chetan","Dr.Darshan","Dr.Eesha","Dr.Firoz","Dr.Girish","Dr.Harsha","Dr.Ila","Dr.Jagan","Dr.Krish","Dr.Lalitha","Dr.Mayur","Dr.Naveen","Dr.Omkar"};
            return doctors;
        }

        else if (specialization == "Radiology") {
            String[] doctors = {"Dr.Aditi","Dr.Bhavna","Dr.Carlos","Dr.Dheer","Dr.Elina","Dr.Farhan","Dr.Ganesh","Dr.Harini","Dr.Irfan","Dr.Jyoti","Dr.Kamal","Dr.Lokesh","Dr.Madhavi","Dr.Naveed","Dr.Ojas"};
            return doctors;
        }

        else if (specialization == "Rheumatology") {
            String[] doctors = {"Dr.Aman","Dr.Bharath","Dr.Chitra","Dr.Deepika","Dr.Ekram","Dr.Falguni","Dr.Gopal","Dr.Hari","Dr.Ishita","Dr.Jeevan","Dr.Krishna","Dr.Lavina","Dr.Mohit","Dr.Nikita","Dr.Omar"};
            return doctors;
        }

        else if (specialization == "Support Specialties") {
            String[] doctors = {"Dr.Abhay","Dr.Bhavya","Dr.Chetan","Dr.Dev","Dr.Ekta","Dr.Farooq","Dr.Gokul","Dr.Himani","Dr.Iqra","Dr.Josh","Dr.Kruti","Dr.Lokesh","Dr.Malini","Dr.Nazim","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Thoracic Surgery") {
            String[] doctors = {"Dr.Akshay","Dr.Balaji","Dr.Chandra","Dr.Dinesh","Dr.Eshan","Dr.Firoz","Dr.Girish","Dr.Harini","Dr.Irfan","Dr.Jagan","Dr.Kamal","Dr.Lokendra","Dr.Mehul","Dr.Naveen","Dr.Omkar"};
            return doctors;
        }

        else if (specialization == "Transfusion Medicine") {
            String[] doctors = {"Dr.Aman","Dr.Bhavna","Dr.Carlos","Dr.Dipti","Dr.Elson","Dr.Farhan","Dr.Gauri","Dr.Hari","Dr.Ishika","Dr.Jatin","Dr.Karan","Dr.Lavanya","Dr.Malini","Dr.Nikhil","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Urology") {
            String[] doctors = {"Dr.Ajay","Dr.Bharath","Dr.Chetan","Dr.Darshan","Dr.Ekta","Dr.Firoz","Dr.Gokul","Dr.Harsha","Dr.Ila","Dr.Jeevan","Dr.Krish","Dr.Lalitha","Dr.Mayur","Dr.Naveen","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Endocrine Surgery") {
            String[] doctors = {"Dr.Akram","Dr.Bina","Dr.Chetan","Dr.Devika","Dr.Elina","Dr.Farooq","Dr.Girish","Dr.Himani","Dr.Iqbal","Dr.Josh","Dr.Kamal","Dr.Lokesh","Dr.Malini","Dr.Naveed","Dr.Ojas"};
            return doctors;
        }

        else if (specialization == "Vascular Surgery") {
            String[] doctors = {"Dr.Abhay","Dr.Bhavya","Dr.Chandra","Dr.Deep","Dr.Eesha","Dr.Firoz","Dr.Gopal","Dr.Hari","Dr.Ira","Dr.Jatin","Dr.Krish","Dr.Lokendra","Dr.Maya","Dr.Nitin","Dr.Omar"};
            return doctors;
        }

        else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {
            String[] doctors = {"Dr.Aman","Dr.Balraj","Dr.Carlos","Dr.Darshan","Dr.Elson","Dr.Farhan","Dr.Gokul","Dr.Himani","Dr.Irfan","Dr.Jeevan","Dr.Kruti","Dr.Lalitha","Dr.Mehul","Dr.Naveen","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Palliative Medicine") {
            String[] doctors = {"Dr.Akshay","Dr.Bhavna","Dr.Chitra","Dr.Dipti","Dr.Ekram","Dr.Falguni","Dr.Girish","Dr.Hari","Dr.Ishita","Dr.Joshna","Dr.Kamal","Dr.Lokesh","Dr.Malini","Dr.Nazim","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Medical Genetics") {
            String[] doctors = {"Dr.Aditi","Dr.Bharath","Dr.Chetan","Dr.Devika","Dr.Elina","Dr.Firoz","Dr.Ganesh","Dr.Harini","Dr.Iqbal","Dr.Jatin","Dr.Krishna","Dr.Lavina","Dr.Mohit","Dr.Nikhil","Dr.Ojas"};
            return doctors;
        }

        else if (specialization == "Pain and Palliative Medicine") {
            String[] doctors = {"Dr.Abhishek","Dr.Bhavya","Dr.Chirag","Dr.Darshan","Dr.Ekta","Dr.Farhan","Dr.Gopal","Dr.Himani","Dr.Ira","Dr.Jatin","Dr.Kruti","Dr.Lokesh","Dr.Malini","Dr.Naveed","Dr.Omar"};
            return doctors;
        }

        else if (specialization == "Geriatric Medicine") {
            String[] doctors = {"Dr.Akram","Dr.Balaji","Dr.Chetan","Dr.Dev","Dr.Elson","Dr.Firoz","Dr.Girish","Dr.Hari","Dr.Ishika","Dr.Jeevan","Dr.Kamal","Dr.Lalitha","Dr.Mehul","Dr.Nitin","Dr.Owais"};
            return doctors;
        }

        else if (specialization == "Critical Care") {
            String[] doctors = {"Dr.Ajay","Dr.Bhavna","Dr.Chitra","Dr.Deepak","Dr.Eesha","Dr.Falguni","Dr.Gokul","Dr.Harini","Dr.Irfan","Dr.Josh","Dr.Krish","Dr.Lokendra","Dr.Malini","Dr.Naveen","Dr.Om"};
            return doctors;
        }

        else if (specialization == "Nuclear Medicine") {
            String[] doctors = {"Dr.Abhay","Dr.Bharath","Dr.Carlos","Dr.Dipti","Dr.Elina","Dr.Farhan","Dr.Ganesh","Dr.Himani","Dr.Iqbal","Dr.Jatin","Dr.Krishna","Dr.Lavanya","Dr.Mohit","Dr.Nikhil","Dr.Ojas"};
            return doctors;
        }

        else {
            System.out.println(specialization + " not found here");
        }

        return null;
    }

    public static void getDoctors(String[] doctors) {
        System.out.println("fetching doctors....");
        System.out.println("--------------------------------");

       
            for (String doctor : doctors) {
                System.out.println(doctor);
            }
        

        System.out.println("Above are the doctors List");
        System.out.println("--------------------------------");
    }
}
