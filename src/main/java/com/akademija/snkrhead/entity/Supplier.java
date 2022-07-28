package com.akademija.snkrhead.entity;

import javax.persistence.*;

@Entity
@Table(name = "supplier", schema = "snkrhead")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplier_id;
    private String ime;
    private String adresa;

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier_id=" + supplier_id +
                ", ime='" + ime + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
