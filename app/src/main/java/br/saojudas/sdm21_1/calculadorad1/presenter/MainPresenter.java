package br.saojudas.sdm21_1.calculadorad1.presenter;

import br.saojudas.sdm21_1.calculadorad1.model.Calculadora;
import br.saojudas.sdm21_1.calculadorad1.view.MainView;

public class MainPresenter implements Presenter{
    private Calculadora model;
    MainView view;

    public MainPresenter(MainView view){
        this.view = view;
        model = new Calculadora();
    }


    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void calcular(String valor1, String valor2, String operador){
        model.setValor1(valor1);
        model.setValor2(valor2);
        model.setOperador(operador);
        //model.calculo();
        configurarView();
    }

    public String getResultado(){
        return model.getResultado();
    }

    public void configurarView(){
        view.configurarView(model.getValor1(), model.getValor2(),
                model.getOperador(), model.getResultado());
    }
}
