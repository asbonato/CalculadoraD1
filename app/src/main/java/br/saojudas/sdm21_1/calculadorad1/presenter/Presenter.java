package br.saojudas.sdm21_1.calculadorad1.presenter;

public interface Presenter {
    void onCreate();
    void onStart();
    void onRestart();
    void onPause();
    void onStop();
    void onResume();
    void onDestroy();
}
