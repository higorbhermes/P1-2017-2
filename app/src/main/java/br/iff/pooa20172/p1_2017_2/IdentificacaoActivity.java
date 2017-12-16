package br.iff.pooa20172.p1_2017_2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.io.Serializable;

public class IdentificacaoActivity extends AppCompatActivity implements Serializable{
    public Cliente objCliente;
    public Endereco objEndereco;
    public Pedido objPedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificacao);
        final String nome, cpf, telefone, rua, bairro, numero, complemento, ponto_referencia;
        Intent intent = getIntent();
        objPedido = (Pedido) intent.getSerializableExtra("pedido");
        final RadioButton rb_dinheiro = (RadioButton)findViewById(R.id.rb_dinheiro);
        final RadioButton rb_credito = (RadioButton)findViewById(R.id.rb_credito);
        final RadioButton rb_debito = (RadioButton)findViewById(R.id.rb_debito);
        EditText et_NomeCliente = (EditText) findViewById(R.id.et_NomeCliente);
        EditText et_Cpf = (EditText) findViewById(R.id.et_CpfCliente);
        EditText et_telefone = (EditText) findViewById(R.id.et_TelefoneCliente);
        EditText et_rua = (EditText) findViewById(R.id.et_Rua);
        EditText et_bairro = (EditText) findViewById(R.id.et_Bairro);
        EditText et_numero = (EditText) findViewById(R.id.et_Numero);
        EditText et_complemento = (EditText) findViewById(R.id.et_Complemento);
        EditText et_referencia = (EditText) findViewById(R.id.et_Referencia);
        nome = et_NomeCliente.getText().toString();
        cpf = et_Cpf.getText().toString();
        telefone = et_telefone.getText().toString();
        rua = et_rua.getText().toString();
        bairro = et_bairro.getText().toString();
        numero = et_numero.getText().toString();
        complemento = et_complemento.getText().toString();
        ponto_referencia = et_referencia.getText().toString();
        Button button_concluir = (Button) findViewById(R.id.button_concluir);
        button_concluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (nome.equals("") || cpf.equals("") || telefone.equals("") || rua.equals("") || bairro.equals("")){
                    String msg = "Ops! Você esqueceu de prencher algum campo importante!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(IdentificacaoActivity.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }*/
                //else{
                     String pagamento;
                    if(rb_dinheiro.isChecked()==true){
                        pagamento = "Dinheiro";
                        objPedido.setFormaPagamento(pagamento);
                    }
                    if(rb_credito.isChecked()==true){
                        pagamento = "Crédito";
                         objPedido.setFormaPagamento(pagamento);
                     }
                    if(rb_debito.isChecked()==true){
                         pagamento = "Débito";
                        objPedido.setFormaPagamento(pagamento);
                     }
                    objEndereco = new Endereco(rua, bairro, numero, complemento, ponto_referencia);
                    objCliente = new Cliente(nome, cpf, telefone, objEndereco);
                    objPedido.setObjCliente(objCliente);
                    String msg = "Seu pedido foi realizado com sucesso. Bom apatite!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(IdentificacaoActivity.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
               // }
            }
        });


    }
}
