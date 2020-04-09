class Canvas
{
    List<Point> points;
   
    void Canvas()
    {
        points = new List<Point>();
    }
    
    void addPoints(int x, int y)
    {
        Point point = new Point(x, y);
        points.add(point);
    }
    
    void moveAllUpward()
    {
        for(int i=0; i<points.size(); i++)
            points.get(i).move('S', 'U');
    }
    
    float getAvgX()
    {
        float avg = 0;
        for(int i=0; i<points.size(); i++)
            avg += points.get(i);
            
        return avg / points.size(); 
    }
}

