package br.iff.pooa20172.p1_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProdutoActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private ArrayList<Produto> produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        ListView lista = (ListView) findViewById(R.id.lvEquipes);
        final ArrayList<Produto> produto = adicionarProduto();
        adapter = new ProdutoAdapter(this, produto);
        lista.setAdapter(adapter);
    }
    private ArrayList<Produto> adicionarProduto() {
        produto = new ArrayList<Produto>();
        Produto produto1 = new Produto("Nome do Prato", "Esta", 0.0, R.drawable.prato);
        produto.add(produto1);
        Produto produto2 = new Produto("Nome do Prato", "Esta", 0.0, R.drawable.prato);
        produto.add(produto2);
        return produto;
    }
}
