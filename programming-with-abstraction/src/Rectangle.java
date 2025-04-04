public class Rectangle extends Shape{
    private float width;
    private float height;
    private String lineColor;

    public Rectangle(float w, float h){
        this.width = w;
        this.height = h;
        lineColor = "black";
    }

    @Override
    public float calculateArea(){
        float area = this.width * this.height;
        return area;
    }

    @Override
    public float calculatePerimeter(){
        return (this.width*2 + this.height*2);
    }

    public void draw(){
        System.out.println("Drawing Rectangle with width="+this.width+" height="+this.height);
    }
}
