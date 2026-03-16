class Formula1Executor{

   public static void main(String[] args){

       Formula1 f1 = new Formula1();
       f1.teamName="Mercedes";
       f1.country="Germany";
       f1.teamPrincipal="Toto Wolff";
       f1.championships=8;
       Franchise fr1=new Franchise();
       fr1.franchiseName="Mercedes AMG";
       fr1.owner="Daimler AG";
       fr1.foundedYear=2010;
       fr1.headquarters="Brackley";
       f1.franchise=fr1;
       f1.getFormula1Details();

       Formula1 f2 = new Formula1();
       f2.teamName="Ferrari";
       f2.country="Italy";
       f2.teamPrincipal="Fred Vasseur";
       f2.championships=16;
       Franchise fr2=new Franchise();
       fr2.franchiseName="Scuderia Ferrari";
       fr2.owner="Ferrari NV";
       fr2.foundedYear=1929;
       fr2.headquarters="Maranello";
       f2.franchise=fr2;
       f2.getFormula1Details();

       Formula1 f3 = new Formula1();
       f3.teamName="Red Bull Racing";
       f3.country="Austria";
       f3.teamPrincipal="Christian Horner";
       f3.championships=6;
       Franchise fr3=new Franchise();
       fr3.franchiseName="Red Bull Racing";
       fr3.owner="Red Bull GmbH";
       fr3.foundedYear=2005;
       fr3.headquarters="Milton Keynes";
       f3.franchise=fr3;
       f3.getFormula1Details();

       Formula1 f4 = new Formula1();
       f4.teamName="McLaren";
       f4.country="UK";
       f4.teamPrincipal="Andrea Stella";
       f4.championships=8;
       Franchise fr4=new Franchise();
       fr4.franchiseName="McLaren Racing";
       fr4.owner="McLaren Group";
       fr4.foundedYear=1963;
       fr4.headquarters="Woking";
       f4.franchise=fr4;
       f4.getFormula1Details();

       Formula1 f5 = new Formula1();
       f5.teamName="Aston Martin";
       f5.country="UK";
       f5.teamPrincipal="Mike Krack";
       f5.championships=0;
       Franchise fr5=new Franchise();
       fr5.franchiseName="Aston Martin F1";
       fr5.owner="Lawrence Stroll";
       fr5.foundedYear=2021;
       fr5.headquarters="Silverstone";
       f5.franchise=fr5;
       f5.getFormula1Details();

       Formula1 f6 = new Formula1();
       f6.teamName="Alpine";
       f6.country="France";
       f6.teamPrincipal="Bruno Famin";
       f6.championships=2;
       Franchise fr6=new Franchise();
       fr6.franchiseName="Alpine F1";
       fr6.owner="Renault Group";
       fr6.foundedYear=2021;
       fr6.headquarters="Enstone";
       f6.franchise=fr6;
       f6.getFormula1Details();

       Formula1 f7 = new Formula1();
       f7.teamName="Williams";
       f7.country="UK";
       f7.teamPrincipal="James Vowles";
       f7.championships=9;
       Franchise fr7=new Franchise();
       fr7.franchiseName="Williams Racing";
       fr7.owner="Dorilton Capital";
       fr7.foundedYear=1977;
       fr7.headquarters="Grove";
       f7.franchise=fr7;
       f7.getFormula1Details();

       Formula1 f8 = new Formula1();
       f8.teamName="AlphaTauri";
       f8.country="Italy";
       f8.teamPrincipal="Franz Tost";
       f8.championships=0;
       Franchise fr8=new Franchise();
       fr8.franchiseName="Scuderia AlphaTauri";
       fr8.owner="Red Bull GmbH";
       fr8.foundedYear=2006;
       fr8.headquarters="Faenza";
       f8.franchise=fr8;
       f8.getFormula1Details();

       Formula1 f9 = new Formula1();
       f9.teamName="Haas";
       f9.country="USA";
       f9.teamPrincipal="Ayao Komatsu";
       f9.championships=0;
       Franchise fr9=new Franchise();
       fr9.franchiseName="Haas F1";
       fr9.owner="Gene Haas";
       fr9.foundedYear=2016;
       fr9.headquarters="Kannapolis";
       f9.franchise=fr9;
       f9.getFormula1Details();

       Formula1 f10 = new Formula1();
       f10.teamName="Sauber";
       f10.country="Switzerland";
       f10.teamPrincipal="Alessandro Alunni Bravi";
       f10.championships=0;
       Franchise fr10=new Franchise();
       fr10.franchiseName="Sauber Motorsport";
       fr10.owner="Sauber Holding";
       fr10.foundedYear=1970;
       fr10.headquarters="Hinwil";
       f10.franchise=fr10;
       f10.getFormula1Details();

       Formula1 f11 = new Formula1();
       f11.teamName="Jordan";
       f11.country="Ireland";
       f11.teamPrincipal="Eddie Jordan";
       f11.championships=0;
       Franchise fr11=new Franchise();
       fr11.franchiseName="Jordan Grand Prix";
       fr11.owner="Eddie Jordan";
       fr11.foundedYear=1991;
       fr11.headquarters="Silverstone";
       f11.franchise=fr11;
       f11.getFormula1Details();

       Formula1 f12 = new Formula1();
       f12.teamName="Lotus";
       f12.country="UK";
       f12.teamPrincipal="Eric Boullier";
       f12.championships=7;
       Franchise fr12=new Franchise();
       fr12.franchiseName="Lotus F1";
       fr12.owner="Genii Capital";
       fr12.foundedYear=1958;
       fr12.headquarters="Enstone";
       f12.franchise=fr12;
       f12.getFormula1Details();

       Formula1 f13 = new Formula1();
       f13.teamName="Toro Rosso";
       f13.country="Italy";
       f13.teamPrincipal="Franz Tost";
       f13.championships=0;
       Franchise fr13=new Franchise();
       fr13.franchiseName="Toro Rosso";
       fr13.owner="Red Bull GmbH";
       fr13.foundedYear=2006;
       fr13.headquarters="Faenza";
       f13.franchise=fr13;
       f13.getFormula1Details();

       Formula1 f14 = new Formula1();
       f14.teamName="Brawn GP";
       f14.country="UK";
       f14.teamPrincipal="Ross Brawn";
       f14.championships=1;
       Franchise fr14=new Franchise();
       fr14.franchiseName="Brawn GP";
       fr14.owner="Ross Brawn";
       fr14.foundedYear=2009;
       fr14.headquarters="Brackley";
       f14.franchise=fr14;
       f14.getFormula1Details();

       Formula1 f15 = new Formula1();
       f15.teamName="Benetton";
       f15.country="Italy";
       f15.teamPrincipal="Flavio Briatore";
       f15.championships=2;
       Franchise fr15=new Franchise();
       fr15.franchiseName="Benetton Formula";
       fr15.owner="Benetton Group";
       fr15.foundedYear=1986;
       fr15.headquarters="Enstone";
       f15.franchise=fr15;
       f15.getFormula1Details();

       Formula1 f16 = new Formula1();
       f16.teamName="Jaguar";
       f16.country="UK";
       f16.teamPrincipal="Niki Lauda";
       f16.championships=0;
       Franchise fr16=new Franchise();
       fr16.franchiseName="Jaguar Racing";
       fr16.owner="Ford";
       fr16.foundedYear=2000;
       fr16.headquarters="Milton Keynes";
       f16.franchise=fr16;
       f16.getFormula1Details();

       Formula1 f17 = new Formula1();
       f17.teamName="Force India";
       f17.country="India";
       f17.teamPrincipal="Vijay Mallya";
       f17.championships=0;
       Franchise fr17=new Franchise();
       fr17.franchiseName="Force India F1";
       fr17.owner="Vijay Mallya";
       fr17.foundedYear=2008;
       fr17.headquarters="Silverstone";
       f17.franchise=fr17;
       f17.getFormula1Details();

       Formula1 f18 = new Formula1();
       f18.teamName="Super Aguri";
       f18.country="Japan";
       f18.teamPrincipal="Aguri Suzuki";
       f18.championships=0;
       Franchise fr18=new Franchise();
       fr18.franchiseName="Super Aguri F1";
       fr18.owner="Aguri Suzuki";
       fr18.foundedYear=2006;
       fr18.headquarters="Tokyo";
       f18.franchise=fr18;
       f18.getFormula1Details();

       Formula1 f19 = new Formula1();
       f19.teamName="Minardi";
       f19.country="Italy";
       f19.teamPrincipal="Paul Stoddart";
       f19.championships=0;
       Franchise fr19=new Franchise();
       fr19.franchiseName="Minardi F1";
       fr19.owner="Paul Stoddart";
       fr19.foundedYear=1985;
       fr19.headquarters="Faenza";
       f19.franchise=fr19;
       f19.getFormula1Details();

       Formula1 f20 = new Formula1();
       f20.teamName="Toyota";
       f20.country="Japan";
       f20.teamPrincipal="Tadashi Yamashina";
       f20.championships=0;
       Franchise fr20=new Franchise();
       fr20.franchiseName="Toyota F1";
       fr20.owner="Toyota Motor Corporation";
       fr20.foundedYear=2002;
       fr20.headquarters="Cologne";
       f20.franchise=fr20;
       f20.getFormula1Details();

   }
}
