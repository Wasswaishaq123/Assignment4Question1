public class Fantasyteam {
    String teamname;
    int numberofplayers;
    String sponsername;
    {
        teamname = "Homies FC";
        numberofplayers = 25;
        sponsername = "ADIDAS";
        System.out.println("other datatype IIB " + teamname);
        System.out.println("unique value IIB " + numberofplayers);
        System.out.println("other data type IIB " + sponsername);


    }
    public Fantasyteam(String TM, int NP, String SN){
        this.teamname=TM;
        this.numberofplayers=NP;
        this.sponsername=SN;
        System.out.println("other datatype constructor " + teamname);
        System.out.println("unique value constructor " + numberofplayers);
        System.out.println("other datatype constructor " + sponsername);



    }

    public String getTeamname() {
        return teamname;
    }

    public int getNumberofplayers() {
        return numberofplayers;
    }

    public String getSponsername() {
        return sponsername;
    }
}
