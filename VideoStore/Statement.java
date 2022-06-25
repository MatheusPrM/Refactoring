import java.util.Enumeration;

public class Statement {

   public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getPrologue(aCustomer);

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += getFigures(each);
    }
    result += getEpilogue(aCustomer);
    return result;
  }

}