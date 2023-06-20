/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola8.entits;

/**
 *
 * @author aluno
 */
public class Professor8 {
  private String nome;
  private char sexo;
  private int idade;
  private int cpf;

    public Professor8(String nome, char sexo, int idade, int cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Professor8(){
      this.nome = "";
      this.sexo = ' ';
      this.idade = 0;
      this.cpf = 0;
    }  
    public String toString(){
        return("\nNome: "+ this.nome + "\nSexo:" + this.sexo + "\nIdade: " + this.idade +  "\nCPF: "+ this.cpf +"\n__________________________\n");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
  
}
