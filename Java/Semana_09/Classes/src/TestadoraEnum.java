public class TestadoraEnum {
  public static void escolheOpcao(OpcoesMenu opcao) {
    if (opcao == OpcoesMenu.SALVAR) {
      System.out.println("Salvando o arquivo!");
    }
    else if (opcao == OpcoesMenu.IMPRIMIR){
      System.out.println("Imprimindo o arquivo!");
    }
    else if (opcao == OpcoesMenu.ABRIR){
      System.out.println("Abrindo o arquivo!");
    }
    else if (opcao == OpcoesMenu.VISUALIZAR){
      System.out.println("Visualizando o arquivo!");
    }
    else if (opcao == OpcoesMenu.FECHAR){
      System.out.println("Fechando o arquivo!");
    }
  }
}
