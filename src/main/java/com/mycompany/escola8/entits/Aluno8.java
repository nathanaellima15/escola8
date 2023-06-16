/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola8.entits;


/**
 *
 * @author aluno
 */

public class Aluno8 {
  private String nome;
  private char sexo;
  private int idade;
  private String matricula;
  private int ano;

    public Aluno8(String nome, char sexo, int idade, String matricula, int ano) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.matricula = matricula;
        this.ano = ano;
    }
    public Aluno8(){
      this.nome = "";
      this.sexo = ' ';
      this.idade = 0;
      this.matricula = "";
      this.ano = 0;
    }  
    public String toString(){
        return("\nNome: "+ this.nome + "\nSexo:" + this.sexo + "\nIdade: " + this.idade + "\nMatricula: "+ this.matricula + "\nIngresso: "+ this.ano +"\n__________________________\n");
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
  
}
