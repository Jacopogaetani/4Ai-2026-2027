public class Main{
    public static void main(String[] args)
    {
        Auto a1 = new Auto("Ford", "Fiesta", 160, 10, 50);
        Bicicletta b1 = new Bicicletta("Lee", "Chougan", 40, 3, 4);
        Moto m1 = new Moto("Ducati", "Panigale", 200, 5, 6);

        System.out.println(a1); //richiama il toString()
        System.out.println(a1.toString()); //Fa ciò che fa la riga sopra

        

        a1.movimento();
        b1.movimento();
        m1.movimento();

    }
}
