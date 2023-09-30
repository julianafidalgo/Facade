public class Combo {

    private Burger burger = new Burger();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void CriarCombo(int tipo)  {
        switch (tipo) {
            case 1:
                burger.setGramas(250);
                burger.setDescricao("Burger Pizza Pit");
                burger.setPreco(2.9);

                sobremesa.setTamanho("Pequeno");
                sobremesa.setDescricao("Milk Shake Cassino");
                sobremesa.setPreco(24.9);

                bebida.setMl(510);
                bebida.setDescricao("Refrigerante Gaivota");
                bebida.setPreco(7.7);
            break;
            case 2:
                burger.setGramas(140);
                burger.setDescricao("Burger Dubai");
                burger.setPreco(24.9);

                sobremesa.setTamanho("Grande");
                sobremesa.setDescricao("Milk Shake Mandalorian");
                sobremesa.setPreco(6.8);

                bebida.setMl(211);
                bebida.setDescricao("Refrigerante Boba Fett");
                bebida.setPreco(1.50);
            break;
        }
    }

    @Override
    public String toString(){
        String retorno = "Hambúrguer -> Gramas:" + burger.getGramas() + ", Descrição: " + burger.getDescricao() + ", Preço: R$" + burger.getPreco();
        retorno += "\n Sobremesa -> Tamanho: " + sobremesa.getTamanho() + ", Descrição: " + sobremesa.getDescricao() + ", Preco: R$" + sobremesa.getPreco();
        retorno += "\n Bebida -> Ml: " + bebida.getMl() + ", Descrição: " + bebida.getDescricao() + ", Preço: R$" + bebida.getPreco();

        return retorno;
    }
}
