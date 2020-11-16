package caproject;
import java.util.*;

/**
 *
 * @author Keith
 */
public class patientSystem 
{
    
 private int age;
 private String name,address,phonenum,condition;

 

    public patientSystem(int age, String name, String address, String phonenum, String condition) 
    {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phonenum = phonenum;
        this.condition = condition;
    }

  

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getPhoneNum() 
    {
        return phonenum;
    }

    public void setPhoneNum(String number) 
    {
        this.phonenum = phonenum;
    }

    public String getCondition() 
    {
        return condition;
    }

    public void setCondition(String condition) 
    {
        this.condition = condition;
    }

     @Override
    public String toString() 
    {
        return " Patient information: " + "[Name:] " + name + "[Age:] " + age + "[Home address:] " + address + "[Phone Number:] " + phonenum + "[Condition:] " + condition + "\n";
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 89 * hash + this.age;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final patientSystem other = (patientSystem) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

            
  }
