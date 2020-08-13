package abstractpackage;

public class SingerMain {
    public static void main(String[] args) {
        SingerAbstract s1 = new SonuNigam("Sonu nigam");
        SingerAbstract s2 = new KailashKher("Kailash kher");
        Sing s = new Sing();
        s.sing(s1);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = ");
        s.sing(s2);

    }
}
