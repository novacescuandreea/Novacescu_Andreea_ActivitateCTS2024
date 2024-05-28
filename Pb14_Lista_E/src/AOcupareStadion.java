public abstract class AOcupareStadion {
    abstract void asezareLaCoada();
    abstract void prezintaBiletul();
    abstract void controlCorporal();
    abstract void intraStadion();
    abstract void ocupaLocul();

    public final void proceduraOcupareStadion(){
        asezareLaCoada();
        prezintaBiletul();
        controlCorporal();
        intraStadion();
        ocupaLocul();
    }
}
