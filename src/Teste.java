import java.util.Scanner;
public class Teste{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pedido pd = new Pedido();

        System.out.println("Informe o produto: ");
        String produto = sc.nextLine();
           
            if(!(produto.equals(""))){
                pd.setProduto(produto);
            }
            else{
                System.out.println("Produto inválido! Tente novamente.");
            }

        System.out.println("Informe a quantidade: ");
        int qtde = sc.nextInt();
            if(qtde > 0){
                pd.setQtde(qtde);
            }
            else{
                System.out.println("Quantidade inválida! Tente novamente.");
            }
        
        System.out.println("Informe o valor do produto: ");
        double valor = sc.nextDouble();
            if(valor > 0){
                pd.setValor(valor);
            }
            else{
                System.out.println("Valor inválido! Tente novamente.");
            }
        
        System.out.printf("Produto:  %s\n"+
                          "Quantidade:  %d\n"+
                          "Valor unitário:  %.2f\n"+
                          "Total: %.2f",pd.getProduto(),pd.getQtde(),pd.getValor(),pd.calcularValor()
        );
    }
}
