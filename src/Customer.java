// capture the name of bank account owner (customer)
public class Customer 
{
        private String name;
    

 /* The meaning of Encapsulation,  is to make sure that "sensitive" data is hidden from users. 
 To achieve this, you must: declare class variables/attributes as private and provide public get and set methods to access and update the value of a private variable */       

        public String getName()  // The get method returns the value of the variable name.
        {
            return name;
        }
    
        public void setName(String name) /*The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object. */
        {
            this.name = name;
        }
}
    