package br.saojudas.sdm21_1.calculadorad1.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

import br.saojudas.sdm21_1.calculadorad1.view.MainActivity;
import br.saojudas.sdm21_1.calculadorad1.view.MainView;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setup(){
        presenter = new MainPresenter(view);
    }

    @Test
    public void testSoma() {
        presenter.calcular("2", "3", "+");
        when(view.getResultado()).thenReturn("5");
        assertEquals(view.getResultado(), presenter.getResultado());
    }
    @Test
    public void testMultiplicacao(){
        presenter.calcular("1", "2", "*");
        when(view.getResultado()).thenReturn("2");
        assertEquals(view.getResultado(), presenter.getResultado());
    }
}
