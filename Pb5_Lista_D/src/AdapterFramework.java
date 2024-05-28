public class AdapterFramework implements IFramework {
    private Framework framework;

    public AdapterFramework(Framework framework) {
        this.framework = framework;
    }

    public void achizitioneazaFramework() {
        framework.cumparaFramework();
    }
}
