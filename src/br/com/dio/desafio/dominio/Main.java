package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Jasa");
        mentoria1.setDescricao("mentoria sobre Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);





    }



}
