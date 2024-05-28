public class AdapterSoft implements ISoftBucatarie {
        private SoftBar softBar;

        public AdapterSoft(SoftBar softBar) {
            this.softBar = softBar;
        }

        @Override
        public void printeazaFactura(String numeProdus, double pret) {
        softBar.printeazaComanda(numeProdus, pret);
        }
}
