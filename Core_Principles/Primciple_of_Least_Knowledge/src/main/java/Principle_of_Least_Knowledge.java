public class Principle_of_Least_Knowledge {

    /**
         * This method shows two violations of "Law of Delimiter" or "Principle of least knowledge".
         */
        public void process(Order o) {

            // as per rule 1, this method invocation is fine, because o is a argument of process() method
            Message msg = o.getMessage();

            // this method call is a violation, as we are using msg, which we got from Order.
            // We should ask order to normalize message, e.g. "o.normalizeMessage();"
            msg.normalize();

            // this is also a violation, instead using temporary variable it uses method chain.
            o.getMessage().normalize();

            // this is OK, a constructor call, not a method call.
            Instrument symbol = new Instrument();

            // as per rule 4, this method call is OK, because instance of Instrument is created locally.
            symbol.populate();

        }
}
