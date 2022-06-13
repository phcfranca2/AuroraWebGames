package com.aurora.webgames.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="\"CadastroAuroraModel\"")
public class CadastroAuroraModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long cdCat;

    @NotEmpty(message = "O tipo da categoria deve ser informada!")
    private String teste;

    public Long getCdCat() {
        return cdCat;
    }

    public void setCdCat(Long cdCat) {
        this.cdCat = cdCat;
    }
	
    public String getTeste(){
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
}

