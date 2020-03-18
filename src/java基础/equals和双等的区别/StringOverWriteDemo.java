package java基础.equals和双等的区别;

public class StringOverWriteDemo  {
    private String name;
    private int age;

    public StringOverWriteDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject)return true;
        if (anObject == null || this.getClass() != anObject.getClass()) {  //传递性,非空性
            return false;
        }
        StringOverWriteDemo person = (StringOverWriteDemo) anObject;
        return this.getName().equals(((StringOverWriteDemo) anObject).getName()) &&
                this.getAge() == ((StringOverWriteDemo) anObject).getAge();
    }
}
