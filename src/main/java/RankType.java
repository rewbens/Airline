public enum RankType {
        PILOT("Pilot"),
        FIRST_OFFICER("First Officer"),
        PURSER("Purser"),
        FLIGHT_ATTENDANT("Flight Attendant");

        private final String RANK;

        RankType(String rank) { RANK = rank; }

        public String getRank() {return RANK; }

}
