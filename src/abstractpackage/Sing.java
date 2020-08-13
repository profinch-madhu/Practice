package abstractpackage;

public class Sing {
    void sing(SingerAbstract s){
        //sing
        System.out.println(s.name+" is singing a song");
        s.singHighNotes();
        s.singWithVibrato();
    }
}
