package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while(counter < personArray.length)
        {
           result += personArray[counter].toString();
           counter++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";
        int initial = 0;// identify initial value
        int finalCondition = personArray.length;// identify terminal condition
        int increment = 1;// identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
    for(int i = initial; i < finalCondition; i += increment){
        result += personArray[i].toString();
    }
        return result;
    }

    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for(Person arr: personArray){
            result += arr.toString();
        }
        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
