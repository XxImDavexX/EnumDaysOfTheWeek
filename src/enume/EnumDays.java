package enume;

public enum EnumDays {
    monday(true),
    tuesday(true),
    wednesday(true),
    thursday(true),
    friday(true),
    saturday(false),
    sunday(false);
    
    private boolean workDay;
    
    private EnumDays(boolean workDay){
        this.workDay = workDay;
    }
    
    @Override
    public String toString(){
        if(workDay){
            return "The day " + this.name().toLowerCase() + " is a workday";
        }else{
            return "You can rest easy, the day " + this.name().toLowerCase() + " not is a workday";
        }
    }
}
