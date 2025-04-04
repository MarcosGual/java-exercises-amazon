public class Circle extends Shape{
    private float radius;

    Circle(float r){
        this.radius = r;
        this.lineColor = "black";
    }

    @Override
    public float calculateArea(){
        float area = (float)Math.PI * this.radius * this.radius;
        return area;
    }

    @Override
    public float calculatePerimeter(){
        return ((float) (2*Math.PI*radius));
    }

    @Override
    public void draw(){
        System.out.println("Drawing Circle with radius="+this.radius);
    }
}
