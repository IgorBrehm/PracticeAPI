package com.api.shoppinglist.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_ITEM")
public class ItemModel implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 70)
    private String classe;
    @Column(nullable = false, length = 70)
    private String tipo;
    @Column(nullable = false, length = 70)
    private String marca;
    @Column(nullable = false)
    private int quantidade;
    @Column(nullable = true)
    private double preco;
    @Column(nullable = true)
    private boolean contemLactose;
    @Column(nullable = true)
    private boolean contemAlcool;
    @Column(nullable = true)
    private int teorGordura;
    @Column(nullable = true)
    private int teorAlcoolico;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isContemLactose() {
        return contemLactose;
    }

    public void setContemLactose(boolean contemLactose) {
        this.contemLactose = contemLactose;
    }

    public boolean isContemAlcool() {
        return contemAlcool;
    }

    public void setContemAlcool(boolean contemAlcool) {
        this.contemAlcool = contemAlcool;
    }

    public int getTeorGordura() {
        return teorGordura;
    }

    public void setTeorGordura(int teorGordura) {
        this.teorGordura = teorGordura;
    }

    public int getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(int teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

}
