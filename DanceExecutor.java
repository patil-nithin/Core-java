class DanceExecutor{

   public static void main(String[] args){

       Dance d1=new Dance();
       d1.danceStyle="Classical";
       d1.originCountry="India";
       d1.famousPerformer="Rukmini Devi";
       d1.popularityRank=1;
       Form f1=new Form();
       f1.formName="Bharatanatyam";
       f1.difficultyLevel="High";
       f1.costumeType="Traditional";
       f1.averageDuration=45;
       d1.form=f1;
       d1.getDanceDetails();

       Dance d2=new Dance();
       d2.danceStyle="Classical";
       d2.originCountry="India";
       d2.famousPerformer="Kelucharan Mohapatra";
       d2.popularityRank=2;
       Form f2=new Form();
       f2.formName="Odissi";
       f2.difficultyLevel="High";
       f2.costumeType="Traditional";
       f2.averageDuration=40;
       d2.form=f2;
       d2.getDanceDetails();

       Dance d3=new Dance();
       d3.danceStyle="Classical";
       d3.originCountry="India";
       d3.famousPerformer="Birju Maharaj";
       d3.popularityRank=3;
       Form f3=new Form();
       f3.formName="Kathak";
       f3.difficultyLevel="Medium";
       f3.costumeType="Traditional";
       f3.averageDuration=35;
       d3.form=f3;
       d3.getDanceDetails();

       Dance d4=new Dance();
       d4.danceStyle="Classical";
       d4.originCountry="India";
       d4.famousPerformer="Raja Reddy";
       d4.popularityRank=4;
       Form f4=new Form();
       f4.formName="Kuchipudi";
       f4.difficultyLevel="High";
       f4.costumeType="Traditional";
       f4.averageDuration=40;
       d4.form=f4;
       d4.getDanceDetails();

       Dance d5=new Dance();
       d5.danceStyle="Classical";
       d5.originCountry="India";
       d5.famousPerformer="Kalamandalam Gopi";
       d5.popularityRank=5;
       Form f5=new Form();
       f5.formName="Kathakali";
       f5.difficultyLevel="High";
       f5.costumeType="Heavy Costume";
       f5.averageDuration=60;
       d5.form=f5;
       d5.getDanceDetails();

       Dance d6=new Dance();
       d6.danceStyle="Folk";
       d6.originCountry="India";
       d6.famousPerformer="Local Artists";
       d6.popularityRank=6;
       Form f6=new Form();
       f6.formName="Bhangra";
       f6.difficultyLevel="Medium";
       f6.costumeType="Colorful";
       f6.averageDuration=25;
       d6.form=f6;
       d6.getDanceDetails();

       Dance d7=new Dance();
       d7.danceStyle="Folk";
       d7.originCountry="India";
       d7.famousPerformer="Village Artists";
       d7.popularityRank=7;
       Form f7=new Form();
       f7.formName="Garba";
       f7.difficultyLevel="Medium";
       f7.costumeType="Traditional";
       f7.averageDuration=30;
       d7.form=f7;
       d7.getDanceDetails();

       Dance d8=new Dance();
       d8.danceStyle="Folk";
       d8.originCountry="India";
       d8.famousPerformer="Village Groups";
       d8.popularityRank=8;
       Form f8=new Form();
       f8.formName="Ghoomar";
       f8.difficultyLevel="Medium";
       f8.costumeType="Traditional";
       f8.averageDuration=30;
       d8.form=f8;
       d8.getDanceDetails();

       Dance d9=new Dance();
       d9.danceStyle="Modern";
       d9.originCountry="USA";
       d9.famousPerformer="Michael Jackson";
       d9.popularityRank=9;
       Form f9=new Form();
       f9.formName="Hip Hop";
       f9.difficultyLevel="Medium";
       f9.costumeType="Casual";
       f9.averageDuration=20;
       d9.form=f9;
       d9.getDanceDetails();

       Dance d10=new Dance();
       d10.danceStyle="Modern";
       d10.originCountry="USA";
       d10.famousPerformer="Various Artists";
       d10.popularityRank=10;
       Form f10=new Form();
       f10.formName="Breakdance";
       f10.difficultyLevel="High";
       f10.costumeType="Casual";
       f10.averageDuration=20;
       d10.form=f10;
       d10.getDanceDetails();

       Dance d11=new Dance();
       d11.danceStyle="Modern";
       d11.originCountry="USA";
       d11.famousPerformer="Dance Crews";
       d11.popularityRank=11;
       Form f11=new Form();
       f11.formName="Street Dance";
       f11.difficultyLevel="Medium";
       f11.costumeType="Casual";
       f11.averageDuration=25;
       d11.form=f11;
       d11.getDanceDetails();

       Dance d12=new Dance();
       d12.danceStyle="Latin";
       d12.originCountry="Cuba";
       d12.famousPerformer="Salsa Artists";
       d12.popularityRank=12;
       Form f12=new Form();
       f12.formName="Salsa";
       f12.difficultyLevel="Medium";
       f12.costumeType="Elegant";
       f12.averageDuration=30;
       d12.form=f12;
       d12.getDanceDetails();

       Dance d13=new Dance();
       d13.danceStyle="Latin";
       d13.originCountry="Dominican Republic";
       d13.famousPerformer="Latin Dancers";
       d13.popularityRank=13;
       Form f13=new Form();
       f13.formName="Bachata";
       f13.difficultyLevel="Medium";
       f13.costumeType="Elegant";
       f13.averageDuration=30;
       d13.form=f13;
       d13.getDanceDetails();

       Dance d14=new Dance();
       d14.danceStyle="Latin";
       d14.originCountry="Brazil";
       d14.famousPerformer="Carnival Artists";
       d14.popularityRank=14;
       Form f14=new Form();
       f14.formName="Samba";
       f14.difficultyLevel="High";
       f14.costumeType="Colorful";
       f14.averageDuration=25;
       d14.form=f14;
       d14.getDanceDetails();

       Dance d15=new Dance();
       d15.danceStyle="Ballroom";
       d15.originCountry="Europe";
       d15.famousPerformer="Professional Couples";
       d15.popularityRank=15;
       Form f15=new Form();
       f15.formName="Waltz";
       f15.difficultyLevel="Medium";
       f15.costumeType="Formal";
       f15.averageDuration=30;
       d15.form=f15;
       d15.getDanceDetails();

       Dance d16=new Dance();
       d16.danceStyle="Ballroom";
       d16.originCountry="Europe";
       d16.famousPerformer="Professional Couples";
       d16.popularityRank=16;
       Form f16=new Form();
       f16.formName="Tango";
       f16.difficultyLevel="High";
       f16.costumeType="Formal";
       f16.averageDuration=30;
       d16.form=f16;
       d16.getDanceDetails();

       Dance d17=new Dance();
       d17.danceStyle="Ballroom";
       d17.originCountry="Europe";
       d17.famousPerformer="Professional Couples";
       d17.popularityRank=17;
       Form f17=new Form();
       f17.formName="Foxtrot";
       f17.difficultyLevel="Medium";
       f17.costumeType="Formal";
       f17.averageDuration=30;
       d17.form=f17;
       d17.getDanceDetails();

       Dance d18=new Dance();
       d18.danceStyle="Contemporary";
       d18.originCountry="USA";
       d18.famousPerformer="Modern Dancers";
       d18.popularityRank=18;
       Form f18=new Form();
       f18.formName="Contemporary";
       f18.difficultyLevel="Medium";
       f18.costumeType="Simple";
       f18.averageDuration=35;
       d18.form=f18;
       d18.getDanceDetails();

       Dance d19=new Dance();
       d19.danceStyle="Fusion";
       d19.originCountry="Global";
       d19.famousPerformer="Creative Artists";
       d19.popularityRank=19;
       Form f19=new Form();
       f19.formName="Bollywood";
       f19.difficultyLevel="Medium";
       f19.costumeType="Colorful";
       f19.averageDuration=25;
       d19.form=f19;
       d19.getDanceDetails();

       Dance d20=new Dance();
       d20.danceStyle="Experimental";
       d20.originCountry="Global";
       d20.famousPerformer="Independent Artists";
       d20.popularityRank=20;
       Form f20=new Form();
       f20.formName="Freestyle";
       f20.difficultyLevel="Varies";
       f20.costumeType="Any";
       f20.averageDuration=20;
       d20.form=f20;
       d20.getDanceDetails();

   }
}
