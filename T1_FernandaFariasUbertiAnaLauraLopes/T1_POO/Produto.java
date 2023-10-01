public class Produto {
    private int codigo;
    private String descricao;
    private double precoUnitario;

    public Produto(int codigo, String descricao, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto [Código =" + codigo + 
        ", Descrição = " + descricao + 
        ", Preço Unitário = " + precoUnitario + "]";
    }
}