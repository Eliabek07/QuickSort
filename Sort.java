public class Sort{
public static void bubbleSort(int vetor[], int tamanho){
int itera; // iteracoes a serem realizadas
int pos; // posicao atual
int aux; // variavel auxiliar para a troca
// iteracoes a serem executadas
for(itera = 0; itera < tamanho - 1; itera++){
// percorrendo o vetor e excluindo a posicao final apos as iteracoes
for(pos = 0; pos < tamanho - 1 - itera; pos++){
// comparando o valor de uma posicao com o valor da posicao seguinte
if(vetor[pos] > vetor[pos+1]){
// realizando a troca dos elementos
aux = vetor[pos];
vetor[pos] = vetor[pos+1];
vetor[pos + 1] = aux;
}
}
System.out.print("FIM DA ITERACAO DE NUMERO " + (itera+1) + ": ");
System.out.println("");
printVetor(vetor);
}

}
public static void printVetor(int vetor[]){
for(int i = 0; i < vetor.length; i++){
System.out.print(vetor[i] + " ");
}
System.out.println("");
}
}
