package abstractpackage;

public class SonuNigam extends SingerAbstract{


        @Override
        void singHighNotes(){
            System.out.println("Sonu nigam singing high notes");
        }

        @Override
        void singWithVibrato(){
            System.out.println("Sonu nigam singing a song with vibrato");
    }

    public SonuNigam(String name){
        this.name=name;
    }
}
