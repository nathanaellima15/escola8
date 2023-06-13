/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola8.entits;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Disciplina8 {
  private String nome;
  private int semestre;
  private String horario;
  private Professor8 professor;
  
    /**
     *
     */
    public List<Aluno8> lstAlunos;  

    public Disciplina8(String nome, int semestre, String horario, Professor8 professor, List<Aluno8> lstAlunos) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
        this.professor = professor;
        this.lstAlunos = lstAlunos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor8 getProfessor() {
        return professor;
    }
    public void setProfessor(Professor8 professor) {
        this.professor = professor;
    }
    public List<Aluno8> getLstAlunos() {
        return lstAlunos;
    }
    public void setLstAlunos(List<Aluno8> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }
  
}
