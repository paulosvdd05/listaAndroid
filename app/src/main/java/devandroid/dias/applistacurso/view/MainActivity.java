package devandroid.dias.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.dias.applistacurso.R;
import devandroid.dias.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa = new Pessoa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa.setPrimeiroNome("Paulo");
        pessoa.setSobreNome("Dias");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("129942342");
        pessoa.getPrimeiroNome();

        int parada = 0;


    }
}