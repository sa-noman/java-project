class Student {
    int Roll;
    String Name;
}

class Result extends Student {
    float Mark;

    void GetData() {
        Roll = 96006;
        Name = "Wahid";
        Mark = 70.5f;
    }

    void Display() {
        System.out.println("Roll is : " + Roll);
        System.out.println("Name is : " + Name);
        System.out.println("Mark is : " + Mark);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Result R = new Result();
        R.GetData();
        R.Display();
    }
}
