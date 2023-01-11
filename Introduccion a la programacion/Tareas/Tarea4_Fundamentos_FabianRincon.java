public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=-25;
      int z=0;
      
      //IF
      compare(x);
      compare(y);
      compare(z);

    //While and Do-While
      miWhile(-3);
      miDoWhile(1);
      
     //For
        miFor();
        
     //Switch
        miSwitch(0);
        miSwitch(2);
        miSwitch(5);
    }
    
    public static void compare(int x){
        if (x>0){
            System.out.println("Numero positivo");
        }
        if(x<0){
            System.out.println("Numero negativo");
        }
        if(x==0){
            System.out.println("Cero");
        }
    }
    
    public static void miWhile(int numeroWhile){
        if(numeroWhile>=3){
            System.out.println("Numero mayor que 3");
        }
        do{
            numeroWhile = numeroWhile+1;
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);
    }
    
    public static void miDoWhile(int numeroWhile){
        if(numeroWhile>=3){
            System.out.println("Numero mayor que 3");
        }
        while(numeroWhile<3){
            numeroWhile = numeroWhile+1;
            System.out.println(numeroWhile);
        }
    }
    
    public static void miFor(){
        int numeroFor;
        for(numeroFor=0; numeroFor < 3; numeroFor++){
            System.out.println("For : " +numeroFor);
        }
    }
    
     public static void miSwitch(int estacion){
        
        switch(estacion){
            case 0:
                System.out.println("Estacion actual: Primavera");
                break;
            case 1:
                System.out.println("Estacion actual: Verano");
                break;
            case 2:
                System.out.println("Estacion actual: Otoño");
                break;
            case 3:
                System.out.println("Estacion actual: Invierno");
                break;
            default:
                System.out.println("Escoga una estacion valida: 0=P, 1=V, 2=O, 3=I");
                break;
        }
    }
        
    
    
    
}

