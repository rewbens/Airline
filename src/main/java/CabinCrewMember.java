public class CabinCrewMember extends Person {


    private String name;

    private RankType rankType;



    public CabinCrewMember(String name, RankType ranktype) {
        super(name);
        this.rankType = ranktype;
    }

    public RankType getRankType() {
        return rankType;
    }

    public String talkToPassenger() {return "Crew ready for takeoff"; }
    }

