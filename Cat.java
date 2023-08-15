/*работа с котами */

public class Cat {
    int age;
    int weight;
    int length;

    public String toString() {
        return String.format("Возраст=%d лет вес=%d кг длина=%d см", age, weight, length);
    }  

    
    public Cat (int age, int weight, int length){
        this.age = age;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && weight == cat.weight && length == cat.length;
    }

    @Override
    public int hashCode(){
        return Object.hash(age, weight, length);
    }

}

    