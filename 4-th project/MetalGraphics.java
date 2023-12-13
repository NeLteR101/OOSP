public class MetalGraphics extends Graphics{

    public MetalGraphics(){
        this.api = new MetalAPI();
    }

    public void drawLine(){
        api.drawLine();
    }
    public void drawRectangle(){
        api.drawRectangle();
    }
    public void drawCircle(){
        api.drawCircle();
    }

}
