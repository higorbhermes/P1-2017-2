package br.iff.pooa20172.p1_2017_2;

import android.os.Bundle;

/**
 * Created by Higor on 15/12/2017.
 */

public class Produto {
    public Produto(String nome, String descricao, double preco, int imagem){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }
    public Bundle toBundle(){
        Bundle bundle = new Bundle();
        bundle.putString("nome", nome);
        bundle.putString("descricao", descricao);
        bundle.putInt("imagem", imagem);
        bundle.putDouble("preco", preco);
        return bundle;
    }
    protected String nome, descricao;
    protected double preco;
    protected int imagem;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double Preco) {
        this.preco = Preco;
    }
    public int getImagem() {
        return imagem;
    }
    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
