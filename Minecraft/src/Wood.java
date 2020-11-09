public class Wood {



     private String woodType;   //type of tree oak and birth
    private String skin ="brownwood.png";
    boolean canbreak = true;
    public Wood() {
        Game.nameobejct("Wood");
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        if (woodType.equals("Brown") | woodType.equals("white")) {
            this.woodType = woodType;
        }else System.out.println("WRONG TYPE");
    }
}
