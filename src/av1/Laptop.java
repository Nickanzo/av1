package av1;

public class Laptop {

    private int polegadas, ram;
    private Processador procesador;

    //Construtor padrão
    public Laptop() {
        this.polegadas  = 0;
        this.ram        = 0;
        this.procesador = null;
    }

    //Construtor explícito
    public Laptop(int polegadas, Processador procesador, int ram) {
        this.polegadas = polegadas;
        this.procesador = procesador;
        this.ram = ram;
    }

    /*
        Getters & Setters
     */

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public Processador getProcesador() {
        return procesador;
    }

    public void setProcesador(Processador procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //toString para resgatar informação organizada e tratada
    @Override
    public String toString() {
        return "Laptop {\n" +
                polegadas  + " polegadas\n" +
                ram        + "GB RAM\n" +
                procesador + "\n}";
    }
}
