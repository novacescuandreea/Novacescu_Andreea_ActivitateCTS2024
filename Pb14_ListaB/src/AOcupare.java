public abstract class AOcupare {
    abstract void curatareMasa();
    abstract void asezareServetele();
    abstract void asezareTacamuri();
    abstract void invitatePersoaneMasa();

    public final void proceduraOcupareMese(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitatePersoaneMasa();
    }
}
