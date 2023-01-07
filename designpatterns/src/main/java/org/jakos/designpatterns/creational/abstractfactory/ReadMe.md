The abstract factory pattern lets you abstract the factory creational logic. <br>
In case you have multiple interfaces you would need the same number of factories initialized in your business logic <br>
if you would like to use the conventional "factory pattern". Creating an instance of each factory could lead to a verbose business code. <br>
However by extracting this initialization logic we can create a factory to create the factories for us.