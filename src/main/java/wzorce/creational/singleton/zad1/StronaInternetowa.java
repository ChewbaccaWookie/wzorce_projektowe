package wzorce.creational.singleton.zad1;

public class StronaInternetowa implements IGeneratorTicketow {
    public int generujTicket() {
       // return GeneratorTicketow.getInstance().pobierzNastepnyNumerek();
        return GeneratorTicketow.INSTANCE.pobierzNastepnyNumerek();
    }
}
