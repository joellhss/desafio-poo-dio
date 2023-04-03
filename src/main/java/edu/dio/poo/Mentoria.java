package edu.dio.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Mentoria extends Conteudo{
    private Date data;

    public Mentoria(String titulo) {
        setTitulo(titulo);
    }

    public Mentoria(String titulo, String descricao, String data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.setData(data);
    }

    public Date getData() {
        return data;
    }

    public void setData(String data){
        try {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            this.data = formatador.parse(data);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível inserir esta data. Pattern dd/MM/yyyy", e);
        }
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public Double calcularXP() {
        return getXP_PADRAO() + 20d;
    }
}
