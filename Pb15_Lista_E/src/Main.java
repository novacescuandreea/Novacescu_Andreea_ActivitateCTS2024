public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        Meci meci1 = new Meci(12032024,"A", "B",200,150,100,25,50);

        Meci meci2 = new Meci(15032024,"C", "D",200,150,100,25,50);

        meci1.adaugaVariante("Var1");
        System.out.println(meci1);

        meci2.adaugaVariante("Var2");
        System.out.println(meci2);

        manager.adaugaVersiune(meci1.salvare());

        meci1.adaugaVariante("Var3");
        System.out.println(meci1);
        manager.adaugaVersiune(meci1.salvare());

        meci1.refacereVarianteMeci(manager.recuperareVersiune(0));
        System.out.println(meci1);
    }

}
