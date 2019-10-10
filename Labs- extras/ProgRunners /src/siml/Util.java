package siml;

import java.util.Calendar;

public class Util {

    public static void validadorParametro(String parametro, String mensagem) {
        if(parametro == null || parametro.trim().equals("")) {
            throw new IllegalArgumentException(mensagem);
        }
    }

    public static void validadorDataFutura(int data, String mensagem) {
        Calendar cal = Calendar.getInstance();

        int dataAtual = cal.get(Calendar.YEAR);

        if (data > dataAtual) {
            throw new IllegalArgumentException(mensagem);
        }
    }
}
