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
        Produto produto1 = new Produto("Carne de sol com nata", "Tiras de carne de sol com molho de nata", 12.00, R.drawable.produto1);
        produto.add(produto1);
        Produto produto2 = new Produto("Arroz de Queijo", "Arroz feito com queijo de coalho", 8.00, R.drawable.produto2);
        produto.add(produto2);
        Produto produto3 = new Produto("Suvaco de Cobra", "Carne de sol moída, milho e cebola.", 15.00, R.drawable.produto3);
        produto.add(produto3);
        Produto produto4 = new Produto("Gororoba de Charque", "Purê com queijo e carne de charque.", 18.00, R.drawable.produto4);
        produto.add(produto4);
        Produto produto5 = new Produto("Buchada", "Feito com as vísceras de bode", 15.00, R.drawable.produto5);
        produto.add(produto5);
        return produto;
    }
}
