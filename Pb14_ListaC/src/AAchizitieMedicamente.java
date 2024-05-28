public abstract class AAchizitieMedicamente {
    abstract void sePrimesteReteta();
    abstract void seVerificaStoculMedicamentelor();
    abstract void seMergeInDepozit();
    abstract void seFaceAchizitia();
    abstract void seAducMedicamentele();
    abstract void seIncaseazaBanii();
    abstract void seScadeDinStoc();
    abstract void seEmiteBonul();

    public final void proceduraAchizitieMedicamente(){
        sePrimesteReteta();
        seVerificaStoculMedicamentelor();
        seMergeInDepozit();
        seFaceAchizitia();
        seAducMedicamentele();
        seIncaseazaBanii();
        seScadeDinStoc();
        seEmiteBonul();
    }
}
