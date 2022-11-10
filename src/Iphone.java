public class Iphone extends Celular{

    private String versionIos;

    public Iphone (String modelo, int imei, String versionAndroid) {
        super(modelo,imei);
        this.versionIos = versionIos;
    }

    public String getVersionIos() {
        return versionIos;
    }

    public void setVersionIos(String versionIos) {
        this.versionIos = versionIos;
    }

    @Override
    public void perderBateria() {

        System.out.println("Soy el celular " + this.getModelo() + ", tengo " + this.getBateria() + " de bateria");

        this.setBateria(this.getBateria() - 0.1);

        System.out.println("Soy el celular "+ this.getModelo() +", perdi bateria y me queda " +
                this.getBateria());
    }
}
