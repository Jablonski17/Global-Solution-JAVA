package br.com.fiap.beans;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.beans.Gasto;

public class Empresa {
 private static int id;
 private String nome;
 private String cnpj;
 private List<Gasto> listaDeGastos;
 private List<Empresa> listaEmpresa;

 // Construtor
 public Empresa(int id, String nome, String cnpj) {
     this.id = id;
     this.nome = nome;
     this.cnpj = cnpj;
     this.listaDeGastos = new ArrayList<>();
     this.listaEmpresa = new ArrayList<>();
 }

 public Empresa() {
	super();
    this.listaDeGastos = new ArrayList<>();
    this.listaEmpresa = new ArrayList<>();
 }

 // Getters e Setters
 public static int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getCnpj() {
     return cnpj;
 }

 public void setCnpj(String cnpj) {
     this.cnpj = cnpj;
 }

 public List<Gasto> getListaDeGastos() {
     return listaDeGastos;
 }

 public void setListaDeGastos(List<Gasto> listaDeGastos) {
     this.listaDeGastos = listaDeGastos;
 }

 public List<Empresa> getListaEmpresa() {
     return listaEmpresa;
 }

 public void setListaEmpresa(List<Empresa> listaEmpresa) {
     this.listaEmpresa = listaEmpresa;
 }

 // Método para adicionar um gasto
 public void adicionarGasto(Gasto gasto) {
     listaDeGastos.add(gasto);
 }
}
