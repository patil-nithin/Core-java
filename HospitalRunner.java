 class HospitalRunner {


        public static void main(String[] hos) {
            System.out.println("main started");
            String specialization = "General Medicine";
            String[] doctors = Hospital.findDoctorsBySpecilization(specialization);
            Hospital.getDoctors(doctors);


            specialization = "Ortho";
            doctors = Hospital.findDoctorsBySpecilization(specialization);
            Hospital.getDoctors(doctors);

            System.out.println("main ended");
        }


    }
