
# Employee Address
In the Employee entity class, add a @OneToOne annotation to the address attribute between Employee and Address


## Authors

- Nagesh kumar Mourya
- nagesh91555@gmail.com


## Technology used

**Framework:** SpringBoot.

**Language:** JAVA.
**Database:** MYSQL.




## Features

Employee:
- id (Long)
- first name (String)
- lastName (String)
- address (Address)
Address:
- id (Long)
- street (String)
- City (String)
- state (String)
- Zipcode (String)
# Data Flow
## Controller :
- EmployeeController.
- AddressController.
## Services :
- EmployeeAndAddressApplication.
## Repository
- Addressrepo Interface.
- Employeerepo Interface. 


## License

Free to use


## Installation

- Step 1: you should most know about how to pull repo or clone .
- Step 2: then install notepad
.
    
## Used Data Structure 
- CollectionsFramwork.



## Project Summury

This is Springboot project for Empolyee Address using Mysql database used to manage all data.
In this project basically we try to implement ont to ont mapping and lots og Api of employee and Address class.
