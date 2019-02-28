package br.com.meuprimeiroappccp3anmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {
    private TextView exibeMensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        Intent origemIntent = getIntent();
        String msg = origemIntent.getStringExtra(MainActivity.CHAVE_MSG);
        exibeMensagemTextView = findViewById(R.id.exibeMensagemTextView);
        exibeMensagemTextView.setText(msg);
    }
}
