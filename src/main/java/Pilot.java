public class Pilot extends CabinCrewMember {



    private int license;

    public Pilot( int license , String name, RankType rankType) {
        super(name, rankType);
            this.license = license;
        };

        public int getPilotLicence() { return license; }
    }


