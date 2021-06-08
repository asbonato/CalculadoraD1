package br.saojudas.sdm21_1.calculadorad1.view;

import androidx.appcompat.app.AppCompatActivity;
import br.saojudas.sdm21_1.calculadorad1.R;
import br.saojudas.sdm21_1.calculadorad1.model.Calculadora;
import br.saojudas.sdm21_1.calculadorad1.presenter.MainPresenter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainView{
    EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operador = findViewById(R.id.operador);
        resultado = findViewById(R.id.resultado);
        presenter.onCreate();
    }

    public void calcular(View view) {
        presenter.calcular(valor1.getText().toString(),
                valor2.getText().toString(), operador.getText().toString());
    }

    @Override
    public void configurarView(String v1, String v2, String op, String res) {
        valor1.setText(v1);
        valor2.setText(v2);
        operador.setText(op);
        resultado.setText(res);
    }

    @Override
    public String getResultado() {
        return resultado.getText().toString();
    }
}