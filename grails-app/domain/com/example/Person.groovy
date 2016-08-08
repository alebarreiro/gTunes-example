package com.example

class Person {
    // Extending Classes with inheritance
    String firstName
    String lastName
    Integer age

    /* Table-per-hierarchy mapping

    Por defecto colapsa todos los atributos en la super-entidad (Table-per-hierarchy mapping)

    mysql> DESCRIBE person;
    +-----------------+--------------+------+-----+---------+----------------+
    | Field           | Type         | Null | Key | Default | Extra          |
    +-----------------+--------------+------+-----+---------+----------------+
    | id              | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | version         | bigint(20)   | NO   |     | NULL    |                |
    | age             | int(11)      | NO   |     | NULL    |                |
    | first_name      | varchar(255) | NO   |     | NULL    |                |
    | last_name       | varchar(255) | NO   |     | NULL    |                |
    | class           | varchar(255) | NO   |     | NULL    |                |
    | company_name    | varchar(255) | YES  |     | NULL    |                |
    | employee_number | varchar(255) | YES  |     | NULL    |                |
    | team_name       | varchar(255) | YES  |     | NULL    |                |
    +-----------------+--------------+------+-----+---------+----------------+

    class: Atributo extra para discriminar el tipo de clase (Class = {Person, Employee, Player})

    Para especificar otro valor para el discriminador:

        static mapping = {
            //doc: http://docs.jboss.org/hibernate/orm/3.6/reference/en-US/html/mapping.html#d0e6906
            discriminator 'Custom People'
        }
    */

    static mapping = {
        tablePerHierarchy false
    }

    /* Table-per-SubClass Mapping

        mysql> DESCRIBE person;
        +------------+--------------+------+-----+---------+----------------+
        | Field      | Type         | Null | Key | Default | Extra          |
        +------------+--------------+------+-----+---------+----------------+
        | id         | bigint(20)   | NO   | PRI | NULL    | auto_increment |
        | version    | bigint(20)   | NO   |     | NULL    |                |
        | age        | int(11)      | NO   |     | NULL    |                |
        | first_name | varchar(255) | NO   |     | NULL    |                |
        | last_name  | varchar(255) | NO   |     | NULL    |                |
        +------------+--------------+------+-----+---------+----------------+

        mysql> DESCRIBE employee;
        +-----------------+--------------+------+-----+---------+-------+
        | Field           | Type         | Null | Key | Default | Extra |
        +-----------------+--------------+------+-----+---------+-------+
        | id              | bigint(20)   | NO   | PRI | NULL    |       |
        | company_name    | varchar(255) | NO   |     | NULL    |       |
        | employee_number | varchar(255) | NO   |     | NULL    |       |
        +-----------------+--------------+------+-----+---------+-------+

        mysql> DESCRIBE player;
        +-----------+--------------+------+-----+---------+-------+
        | Field     | Type         | Null | Key | Default | Extra |
        +-----------+--------------+------+-----+---------+-------+
        | id        | bigint(20)   | NO   | PRI | NULL    |       |
        | team_name | varchar(255) | NO   |     | NULL    |       |
        +-----------+--------------+------+-----+---------+-------+
     */

}
