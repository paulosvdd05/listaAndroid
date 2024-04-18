package devandroid.dias.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.dias.applistacurso.R;
import devandroid.dias.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa = new Pessoa();
    String dadosPessoa;

    EditText editPrimeiroNome;
    EditText editSobreNome;
    EditText editCursoDesejado;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPrimeiroNome = findViewById(R.id.inputNome);
        editSobreNome = findViewById(R.id.inputSobrenome);
        editCursoDesejado = findViewById(R.id.inputNomeCurso);
        editTelefoneContato = findViewById(R.id.inputTelefone);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        pessoa.setPrimeiroNome("Paulo");
        pessoa.setSobreNome("Dias");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("12999999999");

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());


        Log.i("toString", pessoa.toString());



    }
}