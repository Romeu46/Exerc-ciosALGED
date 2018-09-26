import javax.swing.JOptionPane;
public class InsertSort1{
   public static void main(String [] args){
      int vetor [] = new int [5];
      
       for (int i = 0; i <= vetor.length-1; i++) {
        	vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os números: ")); 
        }
      
      int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a busca: "));
        
      InsertSort(vetor);     
      System.out.println("============BUSCA BINARIA ==========="); 
      System.out.println("O numero " + c + " esta localizado no indice " + buscaBinaria(vetor,0,c));
      System.out.println("=====================================");
      System.out.println("");
      SelectSort(vetor);
      System.out.println("");
      SelectSortFinal(vetor);
   }
    //INSERTSORT
   public static void InsertSort(int vetor[]){
        int a,j;
      for(int i = 1; i < vetor.length; i++){
         a = vetor[i];
         j= i-1;      
         while(j >= 0 && vetor[j] > a){
            vetor[j + 1] = vetor[j];
            j--;
         }
         vetor[j+1] = a;
      }
      // Mostra o resultado na tela
    for(int i = 0; i < vetor.length; i++){
         System.out.println("Indice: " + i);
        System.out.println(vetor[i]);
    } 
  }
     //BUSCA BINARIA
  public static int buscaBinaria(int vetor[], int i,int c) {
			int vBaixo, vAlto, vMeio;
			
			vBaixo = 0;
			vAlto = vetor.length - 1;
			while(vBaixo <= vAlto) {
				vMeio= (vBaixo + vAlto) / 2;
				if(c < vetor[vMeio]) vAlto= vMeio-1;
				else if(c > vetor[vMeio]) vAlto = vMeio + 1;
					else return vMeio;
			}
			return -1;
		}
      
      //VETOR QUE RETORNA A POSIÇÃO INICIAL
       public static void SelectSort(int vetor[]){
      int menor;
	   int indiceMenor;
         for (int i = 0; i < vetor.length - 1; i++) {
         // antes de comparar, considera-se menor o valor atual do loop
           menor = vetor[i];
           indiceMenor = i;
             for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
              }
         }
           // Mostra o resultado na tela
            for(int i = 0; i < 1; i++){
            System.out.println("============POSICAO INICIAL==========");
            System.out.println("O numero que esta na posicao inicial e: " + vetor[i]);
            }
      }
      //VETOR QUE RETORNA A POSIÇÃO FINAL
       public static void SelectSortFinal(int vetor[]){
      int maior;
	   int indiceMaior;
         for (int i = 0; i < vetor.length - 1; i++) {
         // antes de comparar, considera-se menor o valor atual do loop
           maior = vetor[i];
           indiceMaior = i;
             for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] > maior){
                    maior = vetor[j];
                    indiceMaior = j;
                }
              }
         }
           // Mostra o resultado na tela
            for(int i = 0; i < vetor.length; i++){
            System.out.println("============POSICAO FINAL==========");
            System.out.println("O numero que esta na posicao final e: " + vetor[i]);
            }

      } 
}      

