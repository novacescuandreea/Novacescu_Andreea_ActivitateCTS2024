public abstract class Decorator extends CreareCont{

    protected CreareCont creareCont;

    public Decorator(CreareCont creareCont) {
        this.creareCont = creareCont;
    }

    @Override
    public void adaugaCreareCont() {
        super.adaugaCreareCont();
    }
}
