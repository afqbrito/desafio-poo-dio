package br.com.dio.desafio.dominio;

import java.util.Collection;

public class Global {
    protected static final int XP_PADRAO = 10;

    public static String collectionToString(Collection collection) {
        StringBuilder sb = new StringBuilder();
        String separador = ", ";

        for (Object c : collection) sb.append(c.toString()).append(separador);

        return sb.deleteCharAt(sb.length() - separador.length()).toString();
    }
}
