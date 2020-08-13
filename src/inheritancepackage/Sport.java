package inheritancepackage;

public class Sport{//try final keyword
    private String sportname;
    private String type;
    private int number_of_formats;
    private String[] formats;//String array declaration
    private int number_of_players;

    public String[] getRoles() {//Returning an array of string
        return formats;
    }

    public int getNumber_of_players() {
        return number_of_players;
    }

    public String getSportname(){
        return sportname;
    }

    public String getType(){
        return type;
    }

    public int getNumber_of_formats() {
        return number_of_formats;
    }


    public String[] getFormats() {
        return formats;
    }


    public void setNumber_of_formats(int number_of_formats) {
        this.number_of_formats = number_of_formats;
    }

    public void setSportname(String sportname){
        this.sportname = sportname;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setFormats(String[] formats) {

        this.formats = formats;
    }

    public void setNumber_of_players(int number_of_players) {
        this.number_of_players = number_of_players;
    }

    public void display()//try final keyword
    {
        System.out.println("Name of the sport: "+this.sportname);
    }

}
