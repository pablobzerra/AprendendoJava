import java.util.Arrays;
import main.teste_main;

//nao precisa colocar "import" para importar outro script
//a nao ser que tenha um nome de pacote(package)

public class teste {
    //PRIMEIRO CODIGO 13/NOV/23
    //java é um demonio

    public static void main(String[] args) {
        //java doente por tipagem 2023

        teste2.mostrarmsg();
        teste_main.teste3();

        int n = 0; //você é um numero
        String str; // você é um texto
        boolean t; // você é você
        String n2; //você é um texto
        int[] array_int = new int[1]; //você é uma lista so de numero seu merda e ainda tem q ter um limite
        String[] array_str = new String[1]; //você é uma lista so de texto seu merda e ainda tem que ter um limite

        String[] array_str2 = {"a", "b"}; //array sem limite
        
        //mostrar array Arrays.toString({variavel array tipo str})
        System.err.println(Arrays.toString(array_str2)); //num poderia colocar simplismente a variavel la (carinha triste)


        n = 1; //você nao pode ter texto
        str = "isso é um teste"; //você nao pode ter numeros | A n ser que formate/concatenar
        t = true; // você é você

       
        //nao pode usar variaveis diretamente na string
        n2 = String.format("Você tem %d balas", n);

        //&& (and)
        //|| (or)
        //{variaveloustr}.lenght(); (len do python (carinha triste) )
        

        //ta deboa
        if(t == true) {

            //poderia ser um simples print
            System.out.println(n2);
            System.out.println(str);

        } else {
            
            System.out.println("Error: Sla" + n);

        }

        //deboa 2
        if ( t != false ) {

            System.out.println("Funcionou");

        } else if ( t == true ) {
            //nada aqui
        }
        int ii = 0;
        //demonio do for
        for(int i = 1; i < 10; i++) {
            //nada aqui 
            //sdds do meu simples for {variavel} in range(1, 10): (carinha triste)
            System.out.println(i);
            ii = i;
        }

        System.out.print(ii);
        

        array_int[0] = 1;
        array_str[0] = "X";

        /*
         *
         * %d Numeros inteiros
         * %s Texto
         * %n pular linha
         * 
         */

        System.out.printf("numeros:%d texto: %s %n", array_int[0], array_str2[0]);

        


    }
}
