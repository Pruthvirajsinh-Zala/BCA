/**
 * Rectangle
 */
class Rectangle{
    float height;
    float base;

    void getValue(float h, float b) {
        height = h;
        base = b;
    }
    float putValue() {
        return (height*base);
    }
    
}
class b {
    public static void main(String[] args) {
        Rectangle t1 = new Rectangle();
        t1.getValue(15.5f, 10.3f);
        float area = t1.putValue();
        System.out.println("Area: " + area);
    }
}