public class Motorola extends Celular{

    private String versionAndroid;

    public Motorola (String modelo, int imei, String versionAndroid) {
        super(modelo,imei);
        this.versionAndroid = versionAndroid;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    @Override
    public String toString() {
        return "Motorola{" +
                "versionAndroid='" + versionAndroid + '\'' +
                "} " + super.toString();
    }

    @Override
    public void perderBateria() {

        System.out.println("Soy el celular " + this.getModelo() + ", tengo " + this.getBateria() + " de bateria");

        this.setBateria(this.getBateria() - 0.25);

        System.out.println("Soy el celular "+ this.getModelo() +", perdi bateria y me queda " +
                this.getBateria());
    }
}
