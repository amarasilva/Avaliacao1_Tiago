package com.example.avaliacao1.model;

import com.example.avaliacao1.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private int id;
    private String nome;
    private String senha;

    public static List<Usuarios> users;

    public Usuarios() {
    }

    public Usuarios(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static List<Usuarios> getUser() {
        if (users == null) {
            users = new ArrayList<>();
            users.add(new Usuarios(1, "Arthur", "111111"));
            users.add(new Usuarios(2, "Breno", "222222"));
            users.add(new Usuarios(3, "Carlos", "333333"));
            users.add(new Usuarios(4, "Daniel", "444444"));
            users.add(new Usuarios(5, "Eduardo", "555555"));
        }
        return users;


    }


}
