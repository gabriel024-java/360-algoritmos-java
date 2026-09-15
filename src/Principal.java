public class Principal {
    void main(){
        //É uma instância de uma classe
        Algoritmo31 objeto = new Algoritmo31();
        //classe   //obj //a //op //operador
        IO.println(objeto.getAloMundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("Digite seu nome: ");
        objeto2.mostrarSalaEco("JP max plus");
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala("Maria Eduarda"));
    }
}
