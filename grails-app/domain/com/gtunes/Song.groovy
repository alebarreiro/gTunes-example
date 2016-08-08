package com.gtunes

class Song {

    String title
    String artist
    Integer duration

    Album album

    /* Transient Properties *

       Definir propiedades que no sean persistidas en la base de datos:
       static transients = ['nombreProp']
     */

    /* Custom Validators *

       Crear validadores custom sobre constraint
       static constraints = {
          password(unique:true, length:5..15, validator:{val, obj ->
            if(val?.equalsIgnoreCase(obj.firstName)) {
                return false
            }
          })
        }
     */

    /* Customizing Database Mapping *

       String firstName //maps to 'first_name' by default
       String lastName //maps to 'last_name' by default

       static mapping = {
         table 'tableName' //Custom table name
         firstName column: 'person_first_name' //Custom column name mapping feature that the ORM DSL support
         secondName column: 'person_second_name'
       }
     */

    static constraints = {
        title blank: false
        artist blank: false
        duration(min: 1)
    }
}
