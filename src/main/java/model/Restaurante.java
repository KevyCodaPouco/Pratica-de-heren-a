package model;

import javax.swing.JOptionPane;

public final class Restaurante extends Empresa {

    private String tipoComida;
    private double preçoMedio;

    public Restaurante() {
        this("", "", "", "", "", "", "", 0);
    }

    public Restaurante(String nome, String endereco, String cidade,
            String estado, String cep, String fone,
            String tipoComida, double precoMedio) {
        
        super(nome, endereco, cidade, estado, cep, fone);
       
        setTipoComida(tipoComida);
        setPreçoMedio(precoMedio);
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPreçoMedio() {
        return preçoMedio;
    }

    public void setPreçoMedio(double preçoMedio) {
        this.preçoMedio = preçoMedio;
    }
    @Override
    public void leitura(){
        super.leitura();
        
        setTipoComida(JOptionPane.showInputDialog("Tipo de Comida:"));
        setPreçoMedio(Double.parseDouble(JOptionPane.showInputDialog("Preço Medio")));
    }
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, paraString());   
    }

    /**
     *
     * @return
     */
    @Override
    public String paraString(){
        return(super.paraString() + "\ntipo de comida " + getTipoComida() + "\npreço medio " + getPreçoMedio());
    }
}
