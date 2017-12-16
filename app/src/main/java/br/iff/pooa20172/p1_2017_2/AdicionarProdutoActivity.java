package br.iff.pooa20172.p1_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AdicionarProdutoActivity extends AppCompatActivity {
    double preco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_produto);
        TextView tv_Nome = (TextView) findViewById(R.id.tv_nome);
        TextView tv_Descricao = (TextView) findViewById(R.id.tv_descricao);
        TextView tv_preco = (TextView) findViewById(R.id.tv_preco);
        EditText et_QuantProduto = (EditText) findViewById(R.id.et_QuantProduto);
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");
        String descricao = (String) intent.getSerializableExtra("descricao");
        preco = (double) intent.getSerializableExtra("preco");
        int pos = (int) intent.getSerializableExtra("pos");
        tv_Nome.setText(nome);
        tv_Descricao.setText(descricao);
        String s_preco = String.valueOf(preco);
        tv_preco.setText("Preço: R$"+s_preco);
        ImageView imagemComida = (ImageView) findViewById(R.id.iv_comida);
        if (pos==0){
            imagemComida.setImageResource(R.drawable.produto1);
        }
        if (pos==1){
            imagemComida.setImageResource(R.drawable.produto2);
        }
        if (pos==2){
            imagemComida.setImageResource(R.drawable.produto3);
        }
        if (pos==3){
            imagemComida.setImageResource(R.drawable.produto4);
        }
        if (pos==4){
            imagemComida.setImageResource(R.drawable.produto5);
        }
        if (pos==5){
            imagemComida.setImageResource(R.drawable.sobremesa1);
        }
        if (pos==6){
            imagemComida.setImageResource(R.drawable.sobremesa2);
        }
        if (pos==7){
            imagemComida.setImageResource(R.drawable.sobremesa3);
        }
        if (pos==8){
            imagemComida.setImageResource(R.drawable.sobremesa4);
        }
        if (pos==9){
            imagemComida.setImageResource(R.drawable.sobremesa5);
        }
        if (pos==10){
            imagemComida.setImageResource(R.drawable.bebida1);
        }
        if (pos==11){
            imagemComida.setImageResource(R.drawable.bebida2);
        }
        if (pos==12){
            imagemComida.setImageResource(R.drawable.bebida3);
        }
    }

    public void finish() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        double valorPedido = preco * Double.parseDouble(((EditText) findViewById(R.id.et_QuantProduto)).getText().toString());
        bundle.putString("quantidade", ((EditText) findViewById(R.id.et_QuantProduto)).getText().toString());
        bundle.putDouble("valorPedido", valorPedido);
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
