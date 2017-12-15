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
        Produto produto6 = new Produto("Cartola Oba-Oba", "Banana frita com queijo derretido", 5.00, R.drawable.sobremesa1);
        produto.add(produto6);
        Produto produto7 = new Produto("Cocada", "Cocada mole servida no prato", 4.00, R.drawable.sobremesa2);
        produto.add(produto7);
        Produto produto8 = new Produto("Côco Zoinho", "Uma quenga de côco com bananas caramelizadas", 10.00, R.drawable.sobremesa3);
        produto.add(produto8);
        Produto produto9 = new Produto("Torta de Maça", "Uma das tortas mais tradicionais do mundo", 19.00, R.drawable.sobremesa4);
        produto.add(produto9);
        Produto produto10 = new Produto("Doce de Caju", "Tradicional doce caseiro de caju", 5.00, R.drawable.sobremesa5);
        produto.add(produto10);
        Produto produto11 = new Produto("Caldo de Cana", "Líquido extraído na moagem da cana", 3.00, R.drawable.bebida1);
        produto.add(produto11);
        Produto produto12 = new Produto("Maltado Gelado", "Leite com chocalate em pó", 5.00, R.drawable.bebida2);
        produto.add(produto12);
        Produto produto13 = new Produto("Caipiroska", "Caipiroskas de frutas", 5.00, R.drawable.bebida2);
        produto.add(produto13);
        return produto;
    }
}
