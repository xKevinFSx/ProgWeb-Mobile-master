package br.com.meuprimeiroappccp3anmca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEdiText;
    public static final String CHAVE_MSG = "br.usjt.msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// inflando a viw
        mensagemEdiText = findViewById(R.id.mensagemEditText);
    }
    public void enviarMensagem(View view){
        String mensagem = mensagemEdiText.getEditableText().toString();
        Intent intent = new Intent (this, ExibeMensagemActivity.class);
        intent.putExtra(CHAVE_MSG,mensagem);
        startActivity(intent);

    }


}
