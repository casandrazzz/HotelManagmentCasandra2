package exceptions;

import model.people.Staff;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import static model.people.Staff.salary;

    public class InputValidation extends Exception {

        private static final Logger logger = Logger.getLogger ( "Validation input" );

        private InputValidation(String message) {

            super ( message );
        }

        public InputValidation() {

        }

        static void parseInput(String value) throws InputValidation {
            try {
                Staff.salary = Integer.parseInt ( value );

            } catch (NumberFormatException e) {
                throw new InputValidation( "Please use a number" );

            }
            if (salary < 1 || salary > 100000) {
                throw new InputValidation( "Please enter values within the range" );
            }
            if (salary == Integer.parseInt ( "" )){
                throw new InputValidation("For input string: \"" + salary + "\"");
            }
        }



        static void existingNumber(String value) throws InputValidation {
            try{
                int n = Integer.parseInt ( value );
                if(n < 1){
                    throw new InputValidation( "You entered a number smaller than 1..." );
                }else if(n > 4){
                    throw  new InputValidation( "You entered a number greater than 4..." );
                }
            }catch(NumberFormatException exception){
                logger.log ( Level.ERROR,
                        exception.getMessage ()
                );
            }
        }


    }
