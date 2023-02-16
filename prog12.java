class person
{
int age;
String name;

person()
{
age=27;
name="Abhi";
}
}

class prog12
{
public static void main(String[] args) 
{
person p1 = new person();
System.out.println(p1.age);
System.out.println(p1.name);
}
}