package com.ti2cc;

public class Canetas {
    private String tampa;
    private String tamanho;
    private String tipo;

    public Canetas()
    {
        this.tampa="transparente";
        this.tamanho="medio";
        this.tipo="normal";
    }
    
    public Canetas(String tampa, String tamanho, String tipo)
    {
        this.tampa=tampa;
        this.tamanho=tamanho;
        this.tipo=tipo;
    }
    
    public String getTampa() {
		return tampa;
	}

	public void setTampa(String tampa) {
		this.tampa = tampa;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }

	@Override
	public String toString() {
		return "Caneta [tampa=" + tampa + ", tamanho=" + tamanho + ", tipo =" + tipo + "]";
	}	


    
}
