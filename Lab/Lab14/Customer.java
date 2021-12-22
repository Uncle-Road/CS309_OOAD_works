import java.util.Vector;

class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String htmlStatement() {
        StringBuilder result = new StringBuilder("<H1>Rentals for <EM>").append(getName());
        result.append("</EM></H1><P>\n");
        for (Rental each : _rentals) {
            //show figures for each rental
            result.append(each.getMovie().getTitle()).append(": ");
            result.append(String.valueOf(each.getCharge())).append("<BR>\n");
        }
        //add footer lines
        result.append("<P>You owe <EM>" + String.valueOf(getTotalCharge()));
        result.append("</EM><P>\n");
        result.append("On this rental you earned <EM>");
        result.append(String.valueOf(getTotalFrequentRenterPoints()));
        result.append("</EM> frequent renter points<P>");

        return result.toString();
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental each: _rentals){
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        for (Rental each : _rentals) {
            result += each.getCharge();
        }
        return result;
    }





}
