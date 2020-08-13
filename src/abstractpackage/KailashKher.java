package abstractpackage;

public class KailashKher extends SingerAbstract{

    @Override
    void singHighNotes(){
        System.out.println("Kailash kher singing high notes");
    }

    @Override
    void singWithVibrato(){
        System.out.println("Kailash kher singing a song with vibrato");
    }

    public KailashKher(String name){
        this.name=name;
    }
}
