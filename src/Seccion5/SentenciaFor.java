package Seccion5;

public class SentenciaFor {

	public static void main(String[] args) {
		
	
		for(int i = 0; i <= 10; i++) {  // se puede inicializar fuero, pero es ideal denntyro del for, tener en cuenta el incremento de i 
            System.out.println("i = " + i);
        }
        
        for(int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }
        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        for(int i = 0; i <= 10; i++) {
            if( !(i % 2 == 0) ){  // calcular par o impar con la negacion 
                continue;  
            }
        System.out.println("i = " + i);
        }
    }
}