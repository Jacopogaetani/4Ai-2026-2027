#include <iostream>
#include <unistd.h> //Contine la funzione forkid

using namespace std;

int main()
{
    int x = 13;
    int forkid;//variabile alla quale viene assegnato il valore di ritorno della funzione fork()

    cout<<"1) Prima della fork"<<endl;//Viene eseguito dal padre
    forkid = fork(); //Viene chiamata la funzione
    cout<<"1.1) Prima della fork"<<endl;//Viene eseguito dal padre --> Verrà eseguito poi nella seconda istanza

    //Parte l'esecuzione del figlio
    if(forkid == 0) //Fork avrà valore 0 se si parla del figlio
    {
        cout<<"----FIGLIO----"<<endl;
        cout<<"La mia variabile x vale "<<x<<endl;
        cout<<"Figlio: Sommo 1 alla variabile "<<endl;
        x++;
        cout<<"La mia nuova variabile x vale "<<x<<endl;
        cout<<"Il mio PID è: "<<getpid()<<endl;
        cout<<"Il PID di mio padre è : "<<getppid()<<endl; //get parent process id
        cout<<"----FINE ESECUZIONE FIGLIO----"<<endl;
        exit(1); //Termina l'esecuzione del programma
    }

    //Con fifo viene eseguito prima il padre e poi il figlio --> VIENE USATO ROUND ROBIN    

    //Esecuzione programma 1 --> Potrebbe non bastare il suo quanto di tempo
    //Esecuzione programma 2 --> Potrebbe non bastare il suo quanto di tempo
    //Esecuzione programma 1 --> Termina la sua esecuzione

    else{
        cout<<"----PADRE----"<<endl;
        sleep(3); //metto in pausa il padre --> esaurisce il quanto di tempo
        cout<<"La mia variabile x vale "<<x<<endl;
        cout<<"Padre: Sottraggo 1 alla variabile "<<endl;
        x--;
        cout<<"La mia nuova variabile x vale "<<x<<endl;
        cout<<"Il mio PID è: "<<getpid()<<endl;
        cout<<"Il PID di mio padre è : "<<getppid()<<endl; //get parent process id
        cout<<"----FINE ESECUZIONE PADRE----"<<endl;
        exit(2);
    }
}

/*Cosa ci aspettiamo:

1)Prima della fork

2)Sono il padre
3)Ora termina l'esecuzione del figlio"

2)Sono il padre
3) Ora termina l'esecuzione del padre
*/ 


/*ps -ed | grep (pid)*/ 