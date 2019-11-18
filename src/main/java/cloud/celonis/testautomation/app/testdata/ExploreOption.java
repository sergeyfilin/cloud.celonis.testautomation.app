package cloud.celonis.testautomation.app.testdata;

public enum ExploreOption {
    MOST_COMMON("Most common variant"),
    LEAST_COMMON("Least common variant"),
    LONGEST_TIME("Longest throughput time"),
    SHORTEST_TIME("Shortest throughput time");

    private String option;

    ExploreOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
