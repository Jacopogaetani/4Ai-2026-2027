/*Scrivi un programma concorrente dove un processo padre genera due figli utilizzando l'istruzione switch per intercettare l'esecuzione dei due processi, utilizzando il forkid come selettore. Predisponi opportune stampe a monitor per distinguere i processi. Verifica la corretta esecuzione. Verifica l'esecuzione non deterministica.

Modifica poi il programma in modo che soltanto il primo figlio generi un processo. Predisponi opportune stampe a monitor per distinguere i processi.  Verifica la corretta esecuzione. Verifica l'esecuzione non deterministica.

1) Costruire l'albero dei processi. Consegnare.
2) Verificare utilizzando gli opportuni comandi Linux che siano presenti quattro processi utente, utilizzando eventualmente la funzione sleep(). Consegnare.
3) Utilizzando la funzione sleep() obbligare il processo padre a terminare prima dei figli e nipoti. Verificare tramite gli appositi comandi Linux la presenza dei processi figli e nipoti e l'adozione dei figli da parte del processo con PID uguale 1. Consegnare.
4) Domanda: Il processo nipote dovrà essere adottato? Motivate la risposta. Consegnare.
5) Successivamente obbligare il figlio1 a terminare prima del suo processo figlio e verificare la presenza dei processi ed eventuali adozioni. Consegnare.
Verificare poi la terminazione di tutti i processi rimanenti. Consegnare.*/

#include <iostream>
#include <unistd.h>

using namespace std;

int main()
{
    cout<<"Sono il padre il mio pid è "<<getpid()<<endl;
    sleep(10);
    //Creo il primo figlio, il padre non può distinguere entrambi i figli

    int forkid1=fork();


    cout<<"Valore della forkid1: "<<forkid1<<endl;
    switch(forkid1)
    {
        //COMANDO UTILE:  ps -ef | grep pidCheMiServe

        case 0:
            cout<<"Sono il primo figlio, il mio forkid è "<<forkid1<<endl;
            cout<<"Il mio pid è "<<getpid()<<endl;
            cout<<"Ho finito di dormire"<<endl;
            sleep(60); //Sleep elevate possono aiutare molto
            break;
        default:
            
            cout<<"Sono il padre, creo il secondo figlio"<<endl;
            int forkid2 = fork();

            if(forkid2 == 0)
            {
                cout<<"Sono il secondo figlio, il mio pid è  "<<getpid()<<endl;
                sleep(60);
            }

            else{
                cout<<"Sono il padre, ho creato il secondo figlio"<<endl;

                sleep(30);
                cout<<"Sono il padre, termino ora"<<endl;
                exit(0);
            }
            break;
    }
}