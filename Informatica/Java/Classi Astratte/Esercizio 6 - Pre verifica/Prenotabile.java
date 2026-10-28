public interface Prenotabile {
    public boolean prenota();

    default boolean statoPrenotazione()
    {
        if(prenota())
        {
            return true;
        }
        else{
            return false;
        }
    }
}
