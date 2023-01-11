 


public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=12;
      
      int sum = suma(x, y, z);
      System.out.println("Sum function = " + sum);
      
      Coche miCoche = new Coche(4);
      miCoche.showGates();
      miCoche.addGates();
      miCoche.showGates();

      
    }
    
    public static int suma(int a, int b, int c){
        int resp = a+b+c;
        return resp;
    }
    
    
    
}

class Coche{
        private int puertas;
        
        public Coche(int puerta){
            this.puertas = puerta;
        }
        
        public void addGates(){
            this.puertas = puertas + 1;
        }
        
        public void showGates(){
            System.out.println("Puertas totales: "+ this.puertas);
        }
    }
    
   