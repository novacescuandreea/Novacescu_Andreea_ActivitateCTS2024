public class Client{
        private String nume;
        private Strategy plata;

        public Client(String nume, Strategy plata) {
            this.nume = nume;
            this.plata = plata;
        }

        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public Strategy getPlata() {
            return plata;
        }

        public void setPlata(Strategy plata) {
            this.plata = plata;
        }
}
