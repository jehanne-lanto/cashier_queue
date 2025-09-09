
public class Cashier {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variables
    private Queue<Client> queue;
    private Client currentClient;

    private int ClientTime;
    private int ClientsServed;
    private int ItemsDone;
   
    //Constructor
    public Cashier(){
        queue = new ArrayQueue<Client>();

        ClientTime = 0;
        ClientsServed = 0;
        ItemsDone = 0;
    }
   
    // Instance methods
    public void add( Client client ) {
        queue.enqueue( client );
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void servedClients( int currentTime ){

        if ( currentClient == null && queue.isEmpty() ) {
            return;
        }

        // If currentClient is not null or the queue is not empty!
        if ( currentClient == null ){        
            currentClient = queue.dequeue();
            ClientTime += currentTime - currentClient.getArriveTime();
            ClientsServed++;
        }

        //serve
        currentClient.serve();

        // If current client is served
        if ( currentClient.getItems() == 0 ) {
            ItemsDone += currentClient.getItemsDone ();
            currentClient = null;    
        }
    }

    public int getClientTime() {      
        return ClientTime;      
    }    

    public int getItemsDone() {      
        return ItemsDone;
    }    

    public int getClientsServed() {
        return ClientsServed;    
    }

   
    public String toString() {

        StringBuffer out= new StringBuffer();

        out.append( "The total number of clients served is " );
        out.append( ClientsServed );
        out.append( str );

        out.append( "The average number of items per client was " );
        out.append( ItemsDone / ClientsServed );
        out.append( str );

        out.append( "The average time (in seconds) was " );
        out.append( ClientTime / ClientsServed );
        out.append( str );

        return out.toString();
    }

}
