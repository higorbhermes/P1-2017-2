package br.iff.pooa20172.p1_2017_2;

/**
 * Created by Higor on 16/12/2017.
 */

public class Cliente {
    String nome, cpf, telefone;
    Endereco objEndereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getObjEndereco() {
        return objEndereco;
    }

    public void setObjEndereco(Endereco objEndereco) {
        this.objEndereco = objEndereco;
    }

    public Cliente(String nome, String cpf, String telefone, Endereco objEndereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.objEndereco = objEndereco;
    }
}
