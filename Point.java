class Point {
	String id;
	double x,y;

        String color;
   	//TODO add new variable
         public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Point(String id, double x, double y, String color) {
			super();
			this.id = id;
			this.x = x;
			this.y = y;
			this.color = color;
		}

	//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
             if(xDirection.equals('L'))
            x--;
        else if(xDirection.equals('R'))
            x++;
            
        if(yDirection.equals('U'))
            y++;
        else if(yDirection.equals('D'))
            y--;
	}

	public void draw () {
                 System.out.print("("+x+", "+y+")"); 
		
//TODO
	}



}

