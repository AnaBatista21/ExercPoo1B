package Q01;

public class Fatura {
    String codigoProduto;
    String descricaoProduto;
    int quantidadeComprada;
    double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public double getTotalFatura() {
        return precoPorItem * quantidadeComprada;
    }


    public void printFatura() {
        if (getTotalFatura() > 0)
            System.out.println("Total Fatura: " + getTotalFatura());
        else {
            System.out.println("0");
        }
    }
}

