public abstract class Player {
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    private String type;


    // Builder 클래스를 정의하시오. (단, static nested class 로 정의하시오.  )
    public static class Builder {
        private String name ;
        private int jerseyNumber ;
        protected int speed ;
        private String type;

        public Builder setPlayerType(String type){
            this.type =type;
            return this;
        }
        public Builder setName(String name) {
            this.name= name;
            return this;
        }
        public Builder setJerseyNumber(int num){
            this.jerseyNumber= num;
            return this;
        }
        public Builder setSpeed(int speed){
            this.speed= speed;
            return this;
        }
        public Player build(){
            Player player = new Player() {
                @Override
                protected int getSpeed() {
                    if (type.equals("forward"))
                        speed+=10;
                    else if (type.equals("defender"))
                        speed-=10;
                    return speed;
                }
            };
            player.name = name;
            player.jerseyNumber= jerseyNumber;
            player.speed= speed;
            player.type=type;
            return player;
        }
    }

    protected abstract int getSpeed();

    @Override
    public String toString(){
        String upper = this.type;
        upper = upper.substring(0, 1).toUpperCase()+upper.substring(1);
        String format;
        format = String.format("Player Name='%s, JerseyNumber=%d, SPEED=%d, %s",this.name,this.jerseyNumber,this.getSpeed(),upper);
        return format;
    }
}
