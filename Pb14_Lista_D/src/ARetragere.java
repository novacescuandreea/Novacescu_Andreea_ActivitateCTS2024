public abstract class ARetragere {
    abstract void introducereCard();
    abstract void introducerePin();
    abstract void specificareSuma();
    abstract void retragereSuma();
    abstract void retragereCard();

    public final void proceduraRetragereBani(){
        introducereCard();
        introducerePin();
        specificareSuma();
        retragereSuma();
        retragereCard();
    }
}
