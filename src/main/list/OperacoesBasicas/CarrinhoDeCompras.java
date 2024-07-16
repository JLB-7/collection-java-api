package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItens = new ArrayList<>();
        if(!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItens.add(i);
                }
            }
            itemList.removeAll(removerItens);
        }   else {
            System.out.println("A lista esta vazia!");
        }
    }


    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
          throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + itemList +
            '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha",2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lapis");

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
