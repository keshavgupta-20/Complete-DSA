public class marks_in_a_physics {
    public static void main(String[] args) {
        float marks[] = {98.5f, 45.4f, 78.5f, 89.6f, 67.5f};
        float sum = 0;
        for (float total_marks : marks){
            sum += total_marks;
        }
        System.out.println("the avg of class in physics is " + sum / marks.length);;
    }
}
