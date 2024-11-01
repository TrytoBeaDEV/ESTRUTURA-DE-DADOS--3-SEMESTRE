import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



public class App {
 
    public static void main(String[] args) throws Exception {
    ListaCircular playlist = new ListaCircular();
    playlist.adicionar("Dani California - Red Hot Chili Peppers");    
    playlist.adicionar("Can't stop - Red Hot Chili Peppers");    
    playlist.adicionar("By the way - Red Hot Chili Peppers");    
    playlist.adicionar("Callifornication - Red Hot Chili Peppers");    
    playlist.adicionar("Thriller - Michael Jackson");    
    playlist.adicionar("Hello - Adele");    
    playlist.adicionar("Que Xou Da Xuxa é esse - Xuxa"); 
    
    playlist.percorrer(4);
    }
 
 
    public static void lista_simples(String[] args) throws Exception {

        //criando uma lista
    ArrayList<String> frutas = new ArrayList<>(); 
    ArrayList<String> feira = new ArrayList<>(); 
    
//adicionando elementos 
    frutas.add("banana");
    frutas.add("Laranja");
    frutas.add("Melancia");
    frutas.add("Uva");

//remover elementos : REMOVE(index)
    frutas.remove(1);

//consultando elementos de acesso direto : GET(index)
   System.out.println(frutas.get(0));
   
//consultar o tamanho da lista : SIZE()
   System.out.println("O tamanho da lista é: "+ frutas.size());

//verificar se lista está vazia : ISEMPTY()
   System.out.println("A lista de frutas está vazia: "+ frutas.isEmpty());
   System.out.println("A lista da feira está vazia: "+ feira.isEmpty());

//Percorrendo uma lista com FOREACH
   System.out.println("Lista de Frutas:");
   for(String item: frutas){
    System.out.println(item);
   }
    }




    public static void lista_encadeada() {
        //criando uma lista encadeada
        LinkedList<String> carros = new LinkedList<>();

        //adicionando itens na lista
        carros.add("Corsa");
        carros.add("Gol");
        carros.add("HB20");
        carros.add("Astra");
        System.out.println("LISTAR CARROS:");
        System.out.println(carros.toString());

        //adicionando no inicio da lista
        carros.addFirst("Kwid");
        
        //adicionando no fim da lista
        carros.addLast("Argo");
        System.out.println("LISTAR CARROS:");
        System.out.println(carros.toString());

        //REMOVENDO ELEMENTOS
        carros.remove(1);
        System.out.println("Listar carros removidos:");
        System.out.println(carros.toString());

        //removendo no inicio da lista
        carros.removeFirst();
        System.out.println("Listar carros removidos:");
        System.out.println(carros.toString());
        
        //removendo no fim da lista
        carros.removeLast();
        System.out.println("Listar carros removidos:");
        System.out.println(carros.toString());

        //consultar um elemento especifico
        System.out.println("Acesso direto: "+carros.get(0));
        System.out.println("Acessando primeiro item da lista :"+carros.getFirst());
        System.out.println("Acessando o ultimo item da lista :"+carros.getLast());

        //percorrendo uma lista 
        System.out.println("Percorrendo uma lista do inicio ao fim : ");
        ListIterator<String> it = carros.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Percorrendo uma lista do fim ao inicio: ");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    } 
}