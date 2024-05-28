public class Rezervare{
        private int numarMasa;
        private int numarPersoane;
        private String oraRezervare;
        private IFlyweight persoanaFlyweight;

        public Rezervare(int numarMasa, int numarPersoane, String oraRezervare, IFlyweight persoanaFlyweight) {
            this.numarMasa = numarMasa;
            this.numarPersoane = numarPersoane;
            this.oraRezervare = oraRezervare;
            this.persoanaFlyweight = persoanaFlyweight;
        }

        public void printeazaInformatiiRezervare() {
            System.out.println( numarMasa);
            System.out.println( numarPersoane);
            System.out.println(oraRezervare);
            System.out.println("Informatii:");
            persoanaFlyweight.printeazaInformatii();
        }
}