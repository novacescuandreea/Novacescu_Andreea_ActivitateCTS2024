public abstract class ANod {

    public abstract String getDenumire();

    public String getInfo(){
        return this.getDenumire() + " ";
    }

    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public ANod getNod (int i){
        throw new UnsupportedOperationException();
    }
}
