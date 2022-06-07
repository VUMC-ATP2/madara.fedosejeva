package classroom;

public class Euronics extends Shop {

    boolean isAcceptingCards;

// fieldiem jabut tadiem pasiem, kaa Shop klase - vismaz. Var but jauns klat "isAcceptingCards"
    public Euronics(String address, String telephoneNumber, String shopType, boolean isAcceptingCards) {
        super(address, telephoneNumber, shopType);
        this.isAcceptingCards = isAcceptingCards;  // pati pieliku klat
    }


}
