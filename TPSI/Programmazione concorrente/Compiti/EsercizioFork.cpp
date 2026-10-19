#include <iostream>
#include <unistd.h>

using namespace std;
int main()
{
    int forkid;

    cout<<"Viene creato un processo figlio"<<endl;
    forkid = fork(); //Crea il processo figlio

    if(forkid != 0) //esecuzione del padre
    {
        //Scelgo di fare 100 iterazioni per testare il funzionamento del round robin
        for(int i = 0; i < 100; i++)
        {
            cout<<"Padre iterazione n. "<<i<<endl;
        }
    }

    else if(forkid == 0)
    {
        forkid = fork(); //creazione del nipote

        if(forkid != 0) //0 se è il figlio
        {
            for(int i = 0; i < 100; i++)
            {
                cout<<"Figlio iterazione n. "<<i<<endl;
            }
        }
        else{
            for(int i = 0; i < 100; i++)
            {
                cout<<"Nipote iterazione n. "<<i<<endl;
            }
        }
       
    }

    return 0;
}