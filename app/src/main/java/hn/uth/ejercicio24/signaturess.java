package hn.uth.ejercicio24;

public class signaturess {
    private String descripcion;
    private byte[] firmaDigital;

    public signaturess(String descripcion, byte[] firmaDigital) {
        this.descripcion = descripcion;
        this.firmaDigital = firmaDigital;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public byte[] getFirmaDigital() {
        return firmaDigital;
    }
}
