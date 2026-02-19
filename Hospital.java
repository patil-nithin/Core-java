
 class Hospital {


        public static String[] findDoctorsBySpecilization(String specialization) {
            System.out.println("invoked findDoctorsBySpecilization");


            if (specialization == "General Medicine") {
                String[] generalMedicineDoctors = {"Dr.Yashwanth", "Dr.Anitha", "Dr.Rakshitha"};

                System.out.println("general medicine doctors are found");

                return generalMedicineDoctors;
            } else if (specialization == "Ortho") {
                String[] orthoDoctors = {"Dr.Gangadhar", "Dr.Vikas Rao"};

                System.out.println("Ortho doctors are found");

                return orthoDoctors;
            } else {
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
