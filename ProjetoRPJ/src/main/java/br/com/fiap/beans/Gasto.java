package br.com.fiap.beans;

import java.util.ArrayList;
import java.util.List;

public class Gasto {
 private int id;
 private String descricao;
 private double valor;
 private String categoria;
 private List<Gasto> listaGasto;

 // Construtor
 public Gasto(int id, String descricao, double valor, String categoria) {
     this.id = id;
     this.descricao = descricao;
     this.valor = valor;
     this.categoria = categoria;
     this.listaGasto = new ArrayList<>();
 }

 public Gasto() {
	super();
    this.listaGasto = new ArrayList<>();
 }

 // Getters e Setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getDescricao() {
     return descricao;
 }

 public void setDescricao(String descricao) {
     this.descricao = descricao;
 }

 public double getValor() {
     return valor;
 }

 public void setValor(double valor) {
     this.valor = valor;
 }

 public String getCategoria() {
     return categoria;
 }

 public void setCategoria(String categoria) {
     this.categoria = categoria;
 }

 public List<Gasto> getListaGasto() {
     return listaGasto;
 }

 public void setListaGasto(List<Gasto> listaGasto) {
     this.listaGasto = listaGasto;
 }
}
