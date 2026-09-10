public class Algoritmo14 {
    public void main(){
      IO.println("Dungeon roguelike");
      IO.readln("Pressione start!");
      IO.println("Bem-vindo a Dungeon roguelike!");
      String nome = IO.readln("Digite seu nome: ");
      IO.println("Olá, " + nome + " escolha a tropa!");
      IO.println("1. Arqueiro, 2. Barbaro, 3. Mago, 4. Paladino");
      IO.readln("Pressione a tecla: ");
      int tropas = 1;
      switch (tropas){
         case 1 -> IO.println("Arqueiro");
         case 2 -> IO.println("Barbaro");
         case 3 -> IO.println("Mago");
         case 4 -> IO.println("Paladino");
      }
    }
}
