package com.marcuslucena.cursomc.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;

    public Category() {}

    public Category(Integer id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
