public abstract class ANod {
    public abstract String getDenumire();


    public String getDescriere(){
        return this.getDenumire();
    }

    public void adauga(ANod copil){
        throw new UnsupportedOperationException();
    }

    public void sterge(ANod copil){
        throw new UnsupportedOperationException();
    }

    public ANod getCopil(int index){
        throw new UnsupportedOperationException();
    }
}
