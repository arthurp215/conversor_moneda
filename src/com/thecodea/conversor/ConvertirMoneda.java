package com.thecodea.conversor;

public class ConvertirMoneda {
    private String monedaPrincipal;
    private String monedaSecundaria;
    private float cantidad;
    private Moneda moneda;
    private  ConsultaMoneda consulta;

    public ConvertirMoneda(String monedaPrincipal, String monedaSecundaria, float cantidad) {
        this.monedaPrincipal = monedaPrincipal;
        this.monedaSecundaria = monedaSecundaria;
        this.cantidad = cantidad;
        this.consulta = new ConsultaMoneda();
    }

    public double convertirMoneda() {
        this.moneda = this.consulta.buscarMoneda(this.monedaPrincipal);
        var conversion = moneda.conversion_rates().get(this.monedaSecundaria);
        return this.cantidad * conversion;
    }
}
