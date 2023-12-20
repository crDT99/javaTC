package relaciones;

import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;

    private Propietario owner; // Relacion 1 - 1

    private List<Propietario> ownerList;  // Relacion 1-n

    public Auto(Long id, String marca, String modelo, Propietario owner, List<Propietario> ownerList) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.owner = owner;
        this.ownerList = ownerList;
    }

    public List<Propietario> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Propietario> ownerList) {
        this.ownerList = ownerList;
    }

    public Auto() {
    }
    public Propietario getOwner() {
        return owner;
    }

    public void setOwner(Propietario owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
