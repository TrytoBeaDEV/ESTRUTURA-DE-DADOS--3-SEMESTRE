import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

// DECLARANDO UM ARAY UNIDIMENSIONAL
    int[] meu_array = new int [5];

// INICIALIZANDO OS VALORES POR ACESSO RÁPIDO

// NA POSIÇÃO 0 , GUARDANDO O ELEMENTO 10
meu_array [0]= 10;
// NA POSIÇÃO 1 , GUARDANDO O ELEMENTO 20
meu_array [1]= 20;
// NA POSIÇÃO 2 , GUARDANDO O ELEMENTO 30
meu_array [2]= 30;
// NA POSIÇÃO 3 , GUARDANDO O ELEMENTO 40
meu_array [3]= 40;
// NA POSIÇÃO 4 , GUARDANDO O ELEMENTO 50
meu_array [4]= 50;

// RECUPERAR OS ELEMENTOS DA ARRAY POR ACESSO RÁPIDO
int element0 = meu_array [2];
int element1 = meu_array [4];

System.out.println(element0);
System.out.println(element1);

// ARRAY DO TIPO TEXTO STRING
String[] lista_aluno = new String[5];

lista_aluno[0] = "JOÃO";
lista_aluno[1] = "VANESSA";
lista_aluno[2] = "DAVI";
lista_aluno[3] = "RENATA";
lista_aluno[4] = "HIGOR";

String element3 = lista_aluno[2];
String element2 = lista_aluno[3];
System.out.println(element2);
System.out.println(element3);


String[] lista_cidades = {"Poá", "Itaim","Suzano","Ferraz","Mogi"};
System.out.println(lista_cidades[2]);

for (int i=0; i<lista_aluno.length;i++){
    System.out.println("ELEMENTO"+i+":"+lista_aluno[i]);
}


for (int i = 0; i < meu_array.length; i++) {
    System.out.println("Elemento" + i + ":" + meu_array[i]);

    // EXIBINDO ARRAY DENTRO DE UM SYSoUT
    int[] array = {10,20,30,40,50};
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(lista_cidades));

    // verificando o tamanho da array

    System.out.println("O TAMANHO É:"+ array.length);
    System.out.println("O TAMANHO É:"+ lista_cidades.length);

    // COPIANDO UMA ARRAY
    int[] copia = array.clone();
    String[] copia_cidade = lista_cidades;

    System.out.println("CÓPIA :"+ Arrays.toString(copia));
    System.out.println("CÓPIA :"+ Arrays.toString(copia_cidade));

    // FUNÇÃO COPY OF, COPIAR UMA PARTE DA ARRAY PRA OUTRA
    String[] copia_sel = Arrays.copyOf(lista_cidades, 2);
    System.out.println("CÓPIA :"+ Arrays.toString(copia_sel));

    // ORGANIZANDO ELEMENTOS
    int[] nova_array = {5,6,4,2,3,1,0};
    Arrays.sort(nova_array);
    System.out.println("ORDENADA EM :" + Arrays.toString(nova_array));

// INSERINDO UM VALOR IGUAL EM TODAS AS POSIÇÕES
    int[] array_vazia = new int[5];
    Arrays.fill(array_vazia,10);

    System.out.println(":"+ Arrays.toString(array_vazia));
    Arrays.fill(array_vazia,10);
    System.out.println(":"+ Arrays.toString(array_vazia));

// FUNÇÃO PARA COMPARAR SE AS ARRAYS SÃO IGUAIS
    boolean resp = Arrays.equals(lista_cidades, copia_cidade);
    System.out.println("SÃO IGUAIS:" +resp);

    // TESTANDO IF, ELSE
    if(Arrays.equals(lista_cidades,copia_cidade)){
        System.out.println("ELAS SÃO IGUAIS");
    }   else{
        System.out.println("ELAS SÃO DIFERENTES");
    }
    
// PESQUISANDO POSIÇÃO
int POSIÇÃO = Arrays.binarySearch(lista_cidades, "Ferraz");
System.out.println("FOI LOCALIZADO NA POSIÇÃO:"+POSIÇÃO);


}
    }
}
