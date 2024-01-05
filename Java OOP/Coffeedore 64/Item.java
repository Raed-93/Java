public class Item {
        private String name;
        private double price;
        private int index;
    
        public Item (String name, double price){
            this.name = name;
            this.price = price;
    
        }
    
        public String getname(){
            return name;
        }
    
        public void setname(String name){
            this.name = name;
        }
    
        public double getprice(){
            return price;
        }
    
        public void setprice(double price){
            this.price = price;
        }

        public int getIndex(){
            return this.index;
        }

        public void setIndex(int index){
            this.index = index;
        }
    }
    
