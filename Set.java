public class Set {

    private static final String str = System.getProperty("line.separator");

    // Instance variable
    private Cashier[] set;

    // Constructor
    public Set(int nbr) {
        if (nbr < 1) {
            throw new IllegalArgumentException(Integer.toString(nbr));
        }
        set = new Cashier[nbr];
        for (int i = 0; i < nbr; i++) {
            set[i] = new Cashier();
        }
    }

    // Ajoute un client à l’arrière de la file la plus courte
    public void add(Client client) {
        int best = 0;
        int bestLen = set[0].getQueueSize();
        for (int i = 1; i < set.length; i++) {
            int len = set[i].getQueueSize();
            if (len < bestLen) {
                bestLen = len;
                best = i;
            }
        }
        set[best].add(client);
    }

    // Fait avancer le service dans chaque caisse (appelée à chaque itération)
    public void servedClients(int currentTime) {
        for (int i = 0; i < set.length; i++) {
            set[i].servedClients(currentTime);
        }
    }

    public String toString() {
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < set.length; i++) {
            out.append("LINE ");
            out.append(i);
            out.append(" :");
            out.append(str);
            out.append(set[i].toString());
            out.append(str);
        }
        return out.toString();
    }
}
