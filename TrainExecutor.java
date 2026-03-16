class TrainExecutor{

   public static void main(String[] args){

       Train train1 = new Train();
       train1.trainName="Shatabdi Express";
       train1.trainNumber="12001";
       train1.source="Bangalore";
       train1.destination="Chennai";
       Boggy boggy1=new Boggy();
       boggy1.boggyType="AC Chair Car";
       boggy1.seatCount=78;
       boggy1.color="Blue";
       boggy1.coachCode="C1";
       train1.boggy=boggy1;
       train1.getTrainDetails();

       Train train2 = new Train();
       train2.trainName="Rajdhani Express";
       train2.trainNumber="12951";
       train2.source="Delhi";
       train2.destination="Mumbai";
       Boggy boggy2=new Boggy();
       boggy2.boggyType="AC First Class";
       boggy2.seatCount=48;
       boggy2.color="Red";
       boggy2.coachCode="A1";
       train2.boggy=boggy2;
       train2.getTrainDetails();

       Train train3 = new Train();
       train3.trainName="Duronto Express";
       train3.trainNumber="12213";
       train3.source="Mumbai";
       train3.destination="Delhi";
       Boggy boggy3=new Boggy();
       boggy3.boggyType="Sleeper";
       boggy3.seatCount=72;
       boggy3.color="Blue";
       boggy3.coachCode="S1";
       train3.boggy=boggy3;
       train3.getTrainDetails();

       Train train4 = new Train();
       train4.trainName="Garib Rath";
       train4.trainNumber="12211";
       train4.source="Chennai";
       train4.destination="Bangalore";
       Boggy boggy4=new Boggy();
       boggy4.boggyType="AC 3 Tier";
       boggy4.seatCount=64;
       boggy4.color="Green";
       boggy4.coachCode="B1";
       train4.boggy=boggy4;
       train4.getTrainDetails();

       Train train5 = new Train();
       train5.trainName="Humsafar Express";
       train5.trainNumber="22305";
       train5.source="Kolkata";
       train5.destination="Delhi";
       Boggy boggy5=new Boggy();
       boggy5.boggyType="AC 3 Tier";
       boggy5.seatCount=64;
       boggy5.color="Grey";
       boggy5.coachCode="B2";
       train5.boggy=boggy5;
       train5.getTrainDetails();

       Train train6 = new Train();
       train6.trainName="Jan Shatabdi";
       train6.trainNumber="12075";
       train6.source="Mysore";
       train6.destination="Chennai";
       Boggy boggy6=new Boggy();
       boggy6.boggyType="Chair Car";
       boggy6.seatCount=80;
       boggy6.color="Blue";
       boggy6.coachCode="C2";
       train6.boggy=boggy6;
       train6.getTrainDetails();

       Train train7 = new Train();
       train7.trainName="Intercity Express";
       train7.trainNumber="12679";
       train7.source="Bangalore";
       train7.destination="Hubli";
       Boggy boggy7=new Boggy();
       boggy7.boggyType="Sleeper";
       boggy7.seatCount=72;
       boggy7.color="Blue";
       boggy7.coachCode="S2";
       train7.boggy=boggy7;
       train7.getTrainDetails();

       Train train8 = new Train();
       train8.trainName="Udyan Express";
       train8.trainNumber="11301";
       train8.source="Mumbai";
       train8.destination="Bangalore";
       Boggy boggy8=new Boggy();
       boggy8.boggyType="AC 2 Tier";
       boggy8.seatCount=54;
       boggy8.color="Red";
       boggy8.coachCode="A2";
       train8.boggy=boggy8;
       train8.getTrainDetails();

       Train train9 = new Train();
       train9.trainName="Double Decker";
       train9.trainNumber="22625";
       train9.source="Chennai";
       train9.destination="Bangalore";
       Boggy boggy9=new Boggy();
       boggy9.boggyType="Double Decker Coach";
       boggy9.seatCount=120;
       boggy9.color="Yellow";
       boggy9.coachCode="D1";
       train9.boggy=boggy9;
       train9.getTrainDetails();

       Train train10 = new Train();
       train10.trainName="Tejas Express";
       train10.trainNumber="22119";
       train10.source="Mumbai";
       train10.destination="Goa";
       Boggy boggy10=new Boggy();
       boggy10.boggyType="Executive Chair Car";
       boggy10.seatCount=56;
       boggy10.color="Orange";
       boggy10.coachCode="E1";
       train10.boggy=boggy10;
       train10.getTrainDetails();

       Train train11 = new Train();
       train11.trainName="Karnataka Express";
       train11.trainNumber="12627";
       train11.source="Bangalore";
       train11.destination="Delhi";
       Boggy boggy11=new Boggy();
       boggy11.boggyType="Sleeper";
       boggy11.seatCount=72;
       boggy11.color="Blue";
       boggy11.coachCode="S3";
       train11.boggy=boggy11;
       train11.getTrainDetails();

       Train train12 = new Train();
       train12.trainName="Chennai Mail";
       train12.trainNumber="11027";
       train12.source="Mumbai";
       train12.destination="Chennai";
       Boggy boggy12=new Boggy();
       boggy12.boggyType="AC 2 Tier";
       boggy12.seatCount=54;
       boggy12.color="Red";
       boggy12.coachCode="A3";
       train12.boggy=boggy12;
       train12.getTrainDetails();

       Train train13 = new Train();
       train13.trainName="Goa Express";
       train13.trainNumber="12779";
       train13.source="Delhi";
       train13.destination="Goa";
       Boggy boggy13=new Boggy();
       boggy13.boggyType="Sleeper";
       boggy13.seatCount=72;
       boggy13.color="Blue";
       boggy13.coachCode="S4";
       train13.boggy=boggy13;
       train13.getTrainDetails();

       Train train14 = new Train();
       train14.trainName="Coimbatore Express";
       train14.trainNumber="12675";
       train14.source="Chennai";
       train14.destination="Coimbatore";
       Boggy boggy14=new Boggy();
       boggy14.boggyType="Chair Car";
       boggy14.seatCount=80;
       boggy14.color="Blue";
       boggy14.coachCode="C3";
       train14.boggy=boggy14;
       train14.getTrainDetails();

       Train train15 = new Train();
       train15.trainName="Kerala Express";
       train15.trainNumber="12625";
       train15.source="Delhi";
       train15.destination="Trivandrum";
       Boggy boggy15=new Boggy();
       boggy15.boggyType="AC 3 Tier";
       boggy15.seatCount=64;
       boggy15.color="Green";
       boggy15.coachCode="B3";
       train15.boggy=boggy15;
       train15.getTrainDetails();

       Train train16 = new Train();
       train16.trainName="Mysore Express";
       train16.trainNumber="16236";
       train16.source="Mysore";
       train16.destination="Chennai";
       Boggy boggy16=new Boggy();
       boggy16.boggyType="Sleeper";
       boggy16.seatCount=72;
       boggy16.color="Blue";
       boggy16.coachCode="S5";
       train16.boggy=boggy16;
       train16.getTrainDetails();

       Train train17 = new Train();
       train17.trainName="Hubli Express";
       train17.trainNumber="17312";
       train17.source="Bangalore";
       train17.destination="Hubli";
       Boggy boggy17=new Boggy();
       boggy17.boggyType="AC 3 Tier";
       boggy17.seatCount=64;
       boggy17.color="Grey";
       boggy17.coachCode="B4";
       train17.boggy=boggy17;
       train17.getTrainDetails();

       Train train18 = new Train();
       train18.trainName="Madurai Express";
       train18.trainNumber="22623";
       train18.source="Chennai";
       train18.destination="Madurai";
       Boggy boggy18=new Boggy();
       boggy18.boggyType="Sleeper";
       boggy18.seatCount=72;
       boggy18.color="Blue";
       boggy18.coachCode="S6";
       train18.boggy=boggy18;
       train18.getTrainDetails();

       Train train19 = new Train();
       train19.trainName="Pune Express";
       train19.trainNumber="11013";
       train19.source="Mumbai";
       train19.destination="Pune";
       Boggy boggy19=new Boggy();
       boggy19.boggyType="Chair Car";
       boggy19.seatCount=80;
       boggy19.color="Blue";
       boggy19.coachCode="C4";
       train19.boggy=boggy19;
       train19.getTrainDetails();

       Train train20 = new Train();
       train20.trainName="Hyderabad Express";
       train20.trainNumber="12723";
       train20.source="Bangalore";
       train20.destination="Hyderabad";
       Boggy boggy20=new Boggy();
       boggy20.boggyType="AC 2 Tier";
       boggy20.seatCount=54;
       boggy20.color="Red";
       boggy20.coachCode="A4";
       train20.boggy=boggy20;
       train20.getTrainDetails();

   }
}
